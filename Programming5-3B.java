import java.util.Scanner;
public class ShadyRestRoom2
{
   // Modify the code below
   public static void main (String args[])
   {
      int selection;
      int selection2;
      int price;
      String result;
      String result2;
      final int QUEEN = 1, KING = 2, SUITE = 3;
      final int QPRICE = 125, KPRICE = 139,
         SPRICE = 165;
      final String QSTRING = "Queen bed", KSTRING = "King bed",
         SSTRING = "Suite with a king bed and pull-out couch",
         INVALIDSTRING = "an invalid option";
      Scanner in = new Scanner(System.in);
      System.out.println("\t\n\nMenu\n");
      System.out.println("(" + QUEEN + ") " + QSTRING);
      System.out.println("(" + KING + ") " + KSTRING);
      System.out.println("(" + SUITE + ") " + SSTRING);
      System.out.print("Enter Selection (1, 2, or 3) >> ");
      selection = in.nextInt();
      if(selection == QUEEN)
      {
         result = QSTRING;
         price = QPRICE;
      }
      else
         if(selection == KING)
         {
            result = KSTRING;
            price = KPRICE;
         }
         else
            if (selection == SUITE)
            {
                result = SSTRING;
                price = SPRICE;
            }
            else
            {
                result = INVALIDSTRING;
                price = 0;
             }
      System.out.print("Please choose a view: \n (1) a lake \n (2) a park \n");
      System.out.print("Enter Selection (1, or 2) >> ");
      selection2 = in.nextInt();
      if(selection2 == 2){
          result2 = "park view";
      } 
      else if(selection2 == 1){
          result2 = "lake view";
          price += 15;
      }else{
          System.out.println("Invalid view");
          result2 = "lake view";
          price += 15;
      }
      System.out.println("You selected " + result + " with a " + result2 + " $"
       + price);
   }
}
