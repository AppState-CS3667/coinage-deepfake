public class GBPTenPence extends Coin {
    
    public GBPTenPence(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a GBP TenPence!");
    }
}
