import javax.swing.JOptionPane;
import java.util.Scanner; 
class CommentsDialog
{
   public static void main(String[] args)
   {
      System.out.println("Program comments are nonexecuting statements ");
      System.out.println("you add to a file for documentation.");
      
      JOptionPane.showMessageDialog(null,"Program comments are nonexecuting statements you add to a file for documentation.");

      // three line comments
      // Program comments are nonexecuting statements 
      // you add to a file for documentation.
      // one block comment
      /* Program comments are nonexecuting statements 
         you add to a file for documentation. */
      // one javadoc comment
      /** Program comments are nonexecuting statements 
          you add to a file for documentation.  */
   }
}



