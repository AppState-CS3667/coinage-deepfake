public class GBPTwentyPence extends Coin {
    
    public GBPTwentyPence(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a GBP TwentyPence!");
    }
}
