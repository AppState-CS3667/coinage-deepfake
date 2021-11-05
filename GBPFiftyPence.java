public class GBPFiftyPence extends Coin {
    
    public GBPFiftyPence(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a GBP FiftyPence!");
    }
}
