public class GBPTwoPence extends Coin {
    
    public GBPTwoPence(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP TwoPence!");
    }
}
