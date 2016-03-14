import java.math.BigDecimal;

/**
   A class to test the CashRegister class.
*/
public class CashRegisterTest
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      register.recordPurchase(new BigDecimal("13.50"));
      register.recordPurchase(new BigDecimal("2.25"));
      register.enterPayment(new BigDecimal("20"));
      BigDecimal change = register.calculateChange();
      System.out.println(change);
      register.giveChange();
   }
}