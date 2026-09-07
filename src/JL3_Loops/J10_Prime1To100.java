package JL3_Loops;

public class J10_Prime1To100 {
    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 to 100:");

        for (int num = 2; num <= 100; num++) {

            boolean isPrime = true;
            int limit = (int) Math.sqrt(num);

            for (int i = 2; i <= limit; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}