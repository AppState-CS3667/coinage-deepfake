public class GBPTenPence implements Coin {
    
    public GBPTenPence(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP TenPence!");
    }
}