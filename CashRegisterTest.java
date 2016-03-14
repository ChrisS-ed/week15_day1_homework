/**
   A class to test the CashRegister class.
*/
public class CashRegisterTest
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      register.recordPurchase(13.50);
      register.recordPurchase(2.25);
      register.enterPayment(20);
      double change = register.calculateChange();
      System.out.println(change);
      register.giveChange();
   }
}