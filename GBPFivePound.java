public class GBPFivePound extends Coin {
    
    public GBPFivePound(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP FivePound!");
    }
}
