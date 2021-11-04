public class GBPTwoPence extends Coin {
    
    public GBPTwoPence(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a GBP TwoPence!");
    }
}
