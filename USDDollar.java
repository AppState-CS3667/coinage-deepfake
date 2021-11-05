public class USDDollar extends Coin {
    
   public USDDollar(double denomination, String countryCode, smelting composition) {
        super(denomination, countryCode, composition);
   }

   public void display () {
       System.out.println("Minting a USD Dollar!");
   }
}
