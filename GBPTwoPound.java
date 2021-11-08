public class GBPTwoPound extends Coin {
    
    public GBPTwoPound(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a GBP TwoPound!");
    }
}
