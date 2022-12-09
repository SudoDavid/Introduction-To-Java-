import java.util.Scanner;  // Import the Scanner class

class InchesToFeetInteractive
{    
  public static void main(String[] args) {
      // Modify the code below
 

     Scanner myObj  = new Scanner(System.in);  // Create a Scanner object
     System.out.println("Enter inches");

     int inches = myObj.nextInt();  // Read user input
     final int INCHES_IN_FOOT = 12;
     int feet;
     int inchesLeft;
     feet = inches / INCHES_IN_FOOT;
     inchesLeft = inches % INCHES_IN_FOOT;
     System.out.println(inches + " inches is " +
        feet + " feet and " + inchesLeft + " inches"); 
  }
}
