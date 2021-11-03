public class USDDollar implements Coin {
    
   public USDDollar(double denomination, String countryCode, smelting compasition) {
        super(denomination, countryCode, compasition);
   }

   public void display () {
       System.out.println("Minting a USD Dollar!");
   }
}
