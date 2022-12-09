import java.util.Scanner;
class Eggs {
    public static void main(String[] args) {
        // Write your code here

        //Prompt User for Total Eggs
 

     Scanner myObj  = new Scanner(System.in);  // Create a Scanner object
     System.out.println("Enter number of eggs");

     int eggs = myObj.nextInt();  // Read user input

     double dozen = 3.25;
     double single = .45;

     System.out.println("You ordered " +
        eggs + ". That's " + eggs/12 + " dozen at $ " + dozen + " per dozen and "
        + (eggs%12) + " loose eggs at 45 cents each for a total of $ " + (((eggs/12)*3.25)+((eggs%12)*.45)) + "."); 

    }
}
