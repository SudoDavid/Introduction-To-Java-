import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        // Write your code here
        int number = 0;
        // Accept System Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number >> ");
        number = input.nextInt();
        input.close();
        // Verify if input is odd or even
        boolean remainder = isEven(number);
        if (remainder == true)
            System.out.println("The integer entered is even.");
        else
            System.out.println("The integer entered is odd.");
        
    }
    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    
    }
}
