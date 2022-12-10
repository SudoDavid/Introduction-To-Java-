import javax.swing.JOptionPane;
import java.util.Scanner; 

class Unit2CaseProblem {
/*Carly's Catering provides meals for parties and special events. 
Write a program that prompts the user for the number of guests attending an 
event and then computes the total price, which is $35 per person. 

Display the company motto with the border that you created in the CarlysMotto2 class in Chapter
  1, and then display the number of guests, price per guest, and total price.

   Also display a message that indicates true or false depending on whether the job
    is classified as a large event—an event with 50 or more guests. Save the file as CarlysEventPrice.java.

 */

    public static void main(String[] args) {

      //Display Motto - "Carly’s makes the food that makes it a party"
      System.out.println("Carly's makes the food that makes it a party.");
      //Display Motto - "Carly’s makes the food that makes it a party" with astericks border
      System.out.println("*************************************************");
      System.out.println("* Carly's makes the food that makes it a party. *");
      System.out.println("*************************************************");
        //Prompt the user
      Scanner myObj  = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Please enter the number of guests attending your event");
      int guests = myObj.nextInt();  // Read user input
      int price = 35;

      System.out.println("The number of guests are: " + guests); 
      System.out.println("The price per guest is: " + price); 
      System.out.println("While the total price is: " + (guests*price)); 

      if (guests< 50) {
        System.out.println("False, this  is not considered a large event.");
      } else {
        System.out.println("True, this  is a large event.");
      }


   }
}
