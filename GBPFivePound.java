public class GBPFivePound extends Coin {
    
    public GBPFivePound(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a GBP FivePound!");
    }
}
