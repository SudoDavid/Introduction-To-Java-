import javax.swing.JOptionPane;
import java.util.Scanner; 

public class Unit1GameZone {
    public static void main(String[] args){
    
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Please enter a random number between 0 and 10");
    
        String userNumber = myObj.nextLine();  // Read user input
        JOptionPane.showMessageDialog(null,"The number you have entered is: "+ (userNumber));

        JOptionPane.showMessageDialog(null,"The number is "+

        (1 + (int)(Math.random() * 10)));


    }

}
