//program to print fibonacci series
//Swaliha_59
 class FibonacciSeries {

    
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    
    public static void fibonacciNonRecursive(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();  // Move to the next line after printing the series
    }

    public static void main(String[] args) {
        int n = 10;  // Number of terms in the Fibonacci series

        System.out.println("Fibonacci series using recursive method:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();  // Move to the next line after printing the series

        System.out.println("Fibonacci series using non-recursive method:");
        fibonacciNonRecursive(n);
    }
}



