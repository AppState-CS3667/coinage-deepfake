public class GBPFivePence extends Coin {
    
    public GBPFivePence(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a GBP FivePence!");
    }
}
