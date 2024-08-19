import java.util.Scanner;

 class PrimeNumbers {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true; 
}
    public static void printPrimesUpTo(int limit) {
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("There are no prime numbers less than 2.");
        } else {
            printPrimesUpTo(number);
        }

        scanner.close();
    }
}
OUTPUT
Enter an integer: 48
Prime numbers up to 48:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 
