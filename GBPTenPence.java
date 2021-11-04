public class GBPTenPence extends Coin {
    
    public GBPTenPence(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP TenPence!");
    }
}
