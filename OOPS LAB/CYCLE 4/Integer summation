import java.util.Scanner;

class integersummation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integers (separated by spaces):");

      
        String input = s.nextLine();
        String[] numbers = input.split(" ");
        int sum = 0;

        for (String number : numbers) {
            try {
                int n = Integer.parseInt(number); 
                sum += n;
            } catch (NumberFormatException e) {
                System.out.println(number + " is not a valid integer");
            }
        }

     
        System.out.println("Sum of the integers: " + sum);
        s.close();
    }
}
	  
	  
