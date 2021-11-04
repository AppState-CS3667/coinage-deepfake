public class GBPTwoPound extends Coin {
    
    public GBPTwoPound(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP TwoPound!");
    }
}
