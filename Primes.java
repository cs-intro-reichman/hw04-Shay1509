public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        int i = 2;
        int j = 2;
        int count = 0;
        boolean isPrime = true;
        while(i <= N){
            while(j < i){
                if(i % j == 0){
                    j = i;
                    isPrime = false;
                }
                else{
                    j++;
                }
            }
            if(isPrime){
                System.out.println(i);
                count++;
            }
            j = 2;
            i++;
            isPrime = true;
        }

        int precentage = ((count * 100) / N);
        System.out.println("There are " + count + " primes between 2 and " + N + " (" + precentage + "% are primes)");
        
    }
}