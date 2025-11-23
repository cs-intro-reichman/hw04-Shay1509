public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }
    


    public static boolean isEquals(String word, String [] keywords){
        boolean equal = false;
        int n = 0;

        String loweredWord = word.toLowerCase();
        while(n < keywords.length){
            if(loweredWord.equals(keywords[n].toLowerCase())){
                equal = true;
            }
            n++;
        }
        return equal;
     }   


    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
    int i = 0;
    int t = 0;
    String string = "";
       while(i < sentences.length){
            while(t < sentences[i].length()){
                while((t < sentences[i].length()) && (sentences[i].charAt(t) != ' ')){
                    string += sentences[i].charAt(t);
                    t++;
                }
                if(isEquals(string, keywords)){
                    System.out.println(sentences[i]);
                }
                t++;
                string = "";
       }
       i++;
       t = 0;
    }
        }
    


     



    }
    
    
    
    
    
    
   


