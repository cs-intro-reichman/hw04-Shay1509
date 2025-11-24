public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerStr = str.toLowerCase();
        return lowerStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean isContains = true;
        int length1 = str1.length();
        int length2 = str2.length();
        int i = 0;
        int j = 0;
        char[] arr1 = new char[length1];
        char[] arr2 = new char[length2];
        int count = 0;

        if(length1 < length2){
            isContains = false;
        }
    
        else if(length2 != 0){
            while(i < length1){
                arr1[i] = str1.charAt(i);
                i++;
            }

            while(j < length2){
                arr2[j] = str2.charAt(j);
                j++;
            }
        
            i = 0;
            j = 0;

            while(i < length1){
                if(j == length2){
                    i = length1;
                }
                else if(arr1[i] == arr2[j]){
                    count++;
                    i++;
                    j++;
                }
                
                else{
                    if(count != length2){
                        count = 0;
                        i++;
                        j = 0;
                    }
                    else{
                        i = length1;
                    }
            }
        }
        
        if(count == 0){
            isContains = false;
        }
        }
        return isContains;
    
    }
    }

