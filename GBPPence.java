public class GBPPence extends Coin {
    
    public GBPPence(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a GBP Pence!");
    }
}
