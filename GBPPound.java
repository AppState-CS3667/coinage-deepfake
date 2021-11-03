public class GBPPound implements Coin {
    
    public GBPPound(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP Pound!");
    }
}