public class GBPPound extends Coin {
    
    public GBPPound(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a GBP Pound!");
    }
}
