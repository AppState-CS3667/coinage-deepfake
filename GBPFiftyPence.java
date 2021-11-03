public class GBPFiftyPence implements Coin {
    
    public GBPFiftyPence(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP FiftyPence!");
    }
}