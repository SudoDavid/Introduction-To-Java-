
/*

Write a Java application that displays two dialog boxes in sequence.
The first asks you to think of a number between 1 and 10. The second 
displays a randomly generated number; the user can see whether his or her guess was accurate. 
(In future chapters, you will improve this game so that the user can enter a guess and the program can 
determine whether the user was correct. If you wish, you also can tell the user how far off the guess was, 
whether the guess was high or low, and provide a specific number of repeat attempts.) 
*/
import javax.swing.JOptionPane;
import java.util.Scanner; 
public class RandomGuess
{
    public static void main(String[] args)
   {
        //Two Dialogue boxes
        //One for input from user
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a random number between 0 and 10.");

        String userinput = myObj.nextLine();  // Read user input
        //Random number created and compared to user
        //One for output if correct or wrong on match
        int rand = (int)(Math.random() * 10) + 1;

          JOptionPane.showMessageDialog(null,"The random number is: ");
                 JOptionPane.showMessageDialog(null,rand);
    }//end main arguement
}//end class
