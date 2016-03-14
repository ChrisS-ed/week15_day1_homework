
/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      double total = purchase + amount;
      purchase = total;
   }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
   public void enterPayment(double amount)
   {
      payment = amount;
   }

   /**
      Computes the change due
      @return the change due to the customer
   */
   public double calculateChange()
   {   
      double change = payment - purchase;
      //purchase = 0;
      //payment = 0;
      return change;
   }

/**
   Computes change due and prints how many coins to give to customer
*/
   public void giveChange()
   {
      double change = calculateChange();
      int pounds = 0;
      double pennies = 0.0;

      double currentBalance = change;

      if (currentBalance > 1.0) {
         pounds = (int) currentBalance;
         pennies = currentBalance - pounds;
         System.out.println("£1 coins: "+pounds);
         currentBalance -= pounds;
      }

      int fiftyPence = 0;
      int twentyPence = 0;
      int tenPence = 0;
      int fivePence = 0;
      int twoPence = 0;
      int onePence = 0;

      if (currentBalance > 0.49) {
         fiftyPence += 1;
         System.out.println("50p coins: "+fiftyPence);
         currentBalance -= 0.5;
      }
      if (currentBalance > 0.39) {
         twentyPence += 2;
         System.out.println("20p coins: "+twentyPence);
         currentBalance -= 0.4;
      }
      if (currentBalance > 0.19) {
         twentyPence += 1;
         System.out.println("20p coins: "+twentyPence);
         currentBalance -= 0.2;
      }
      if (currentBalance > 0.09) {
         tenPence += 1;
         System.out.println("10p coins: "+tenPence);
         currentBalance -= 0.1;
      }
      if (currentBalance > 0.049) {
         fivePence += 1;
         System.out.println("5p coins: "+fivePence);
         currentBalance -= 0.05;
      }
      if (currentBalance > 0.039) {
         twoPence += 2;
         System.out.println("2p coins: "+twoPence);
         currentBalance -= 0.04;
      }
      if (currentBalance > 0.019) {
         twoPence += 1;
         System.out.println("2p coins: "+twoPence);
         currentBalance -= 0.02;
      }
      if (currentBalance > 0.009) {
         onePence += 1;
         System.out.println("1p coins: "+onePence);
         currentBalance -= 0.01;
      }
      
      purchase = 0;
      payment = 0;

   }

}
