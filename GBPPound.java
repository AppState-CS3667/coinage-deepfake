public class GBPPound extends Coin {
    
    public GBPPound(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP Pound!");
    }
}
