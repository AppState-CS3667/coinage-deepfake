public class GBPPence extends Coin {
    
    public GBPPence(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP Pence!");
    }
}
