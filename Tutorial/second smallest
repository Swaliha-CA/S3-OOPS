// PROGRAM TO FIND SECOND LARGEST
//SWALIHA_59
import java.util.Scanner;

class Secondsmallest {

    
    public static Integer findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null; 
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
              
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return (secondSmallest == Integer.MAX_VALUE) ? null : secondSmallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Integer secondSmallest = findSecondSmallest(arr);

        if (secondSmallest != null) {
            System.out.println("The second smallest element is: " + secondSmallest);
        } else {
            System.out.println("There is no second smallest element in the array.");
        }

        scanner.close();
    }
}
OUTPUT
Enter the number of elements in the array: 5
Enter 5 elements:
1 55 88 9923 22 
The second smallest element is: 22

