import java.util.Scanner;
class Trycatch {
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Program to perform division");
            System.out.print("Enter the numerator: ");
            int a = s.nextInt();
            System.out.print("Enter the denominator: ");
            int b = s.nextInt();
            int result = divide(a, b);
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("Error: Please enter valid integers");
        } finally {
            s.close();
        }
    }
}

