public class GBPFivePence extends Coin {
    
    public GBPFivePence(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP FivePence!");
    }
}
