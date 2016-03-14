import java.math.*;

/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private BigDecimal purchase;
   private BigDecimal payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = new BigDecimal ("0.00");
      payment = new BigDecimal ("0.00");
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(BigDecimal amount)
   {
      //BigDecimal total = purchase + amount;
      BigDecimal total = purchase.add(amount);
      purchase = total;
      System.out.println("*** Record purchase: "+purchase);
   }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
   public void enterPayment(BigDecimal amount)
   {
      payment = amount;
   }

   /**
      Computes the change due
      @return the change due to the customer
   */
   public BigDecimal calculateChange()
   {   
      //BigDecimal change = payment - purchase;
      BigDecimal change = payment.subtract(purchase);
      //purchase = 0;
      //payment = 0;
      return change;
   }

/**
   Computes change due and prints how many coins to give to customer
*/
   public void giveChange()
   {
      BigDecimal change = calculateChange();
      BigDecimal pounds = new BigDecimal ("0.00");
      BigDecimal pennies = new BigDecimal ("0.00");

      BigDecimal currentBalance = change;
      System.out.println("*** Current balance: "+currentBalance);

      //if (currentBalance > 1.0) {
      if (currentBalance.compareTo(new BigDecimal("1.00")) > 0) {
         pounds = currentBalance.setScale(0, RoundingMode.FLOOR);
         pennies = currentBalance.subtract(pounds);
         System.out.println("£1 coins: "+pounds);
         currentBalance = currentBalance.subtract(pounds);
      }

      int fiftyPence = 0;
      int twentyPence = 0;
      int tenPence = 0;
      int fivePence = 0;
      int twoPence = 0;
      int onePence = 0;

      //if (currentBalance > 0.49) {
      if (currentBalance.compareTo(new BigDecimal("0.49")) > 0) {
         fiftyPence += 1;
         System.out.println("50p coins: "+fiftyPence);
         currentBalance = currentBalance.subtract(new BigDecimal("0.5"));
      }
      //if (currentBalance > 0.39) {
      if (currentBalance.compareTo(new BigDecimal("0.39")) > 0) {
         twentyPence += 2;
         System.out.println("20p coins: "+twentyPence);
         currentBalance = currentBalance.subtract(new BigDecimal("0.4"));
      }
      //if (currentBalance > 0.19) {
      if (currentBalance.compareTo(new BigDecimal("0.19")) > 0) {
         twentyPence += 1;
         System.out.println("20p coins: "+twentyPence);
         currentBalance = currentBalance.subtract(new BigDecimal("0.2"));
      }
      //if (currentBalance > 0.09) {
      if (currentBalance.compareTo(new BigDecimal("0.09")) > 0) {
         tenPence += 1;
         System.out.println("10p coins: "+tenPence);
         currentBalance = currentBalance.subtract(new BigDecimal("0.1"));
      }
      //if (currentBalance > 0.049) {
      if (currentBalance.compareTo(new BigDecimal("0.049")) > 0) {
         fivePence += 1;
         System.out.println("5p coins: "+fivePence);
         currentBalance = currentBalance.subtract(new BigDecimal("0.05"));
      }
      //if (currentBalance > 0.039) {
      if (currentBalance.compareTo(new BigDecimal("0.039")) > 0) {
         twoPence += 2;
         System.out.println("2p coins: "+twoPence);
         currentBalance = currentBalance.subtract(new BigDecimal("0.04"));
      }
      //if (currentBalance > 0.019) {
      if (currentBalance.compareTo(new BigDecimal("0.019")) > 0) {
         twoPence += 1;
         System.out.println("2p coins: "+twoPence);
         currentBalance = currentBalance.subtract(new BigDecimal("0.02"));
      }
      //if (currentBalance > 0.009) {
      if (currentBalance.compareTo(new BigDecimal("0.009")) > 0) {
         onePence += 1;
         System.out.println("1p coins: "+onePence);
         currentBalance = currentBalance.subtract(new BigDecimal("0.01"));
      }
      
      purchase = new BigDecimal ("0.00");
      payment = new BigDecimal ("0.00");

   }
}
