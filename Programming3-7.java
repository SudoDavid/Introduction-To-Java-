import java.util.Scanner;

public class InchConversion {
    
    public static void main (String args[]) {
        // Write your code here
        int inches = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter inches >> ");
        inches = input.nextInt();
        input.close();
        
        convertToFeet(inches);
        convertToYards(inches);
        
    }
    public static void convertToFeet(int inches) {
        // Write your code here
        final double factor = 12;
        
        System.out.println( inches+ " inches is " +(inches / factor)+ " feet");
        
    }
    public static void convertToYards(int inches) {
        // Write your code here
        final double factor = 36;
        
        System.out.println( inches+ " inches is " +(inches / factor)+ " yard");
        
    }
}
