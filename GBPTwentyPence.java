public class GBPTwentyPence implements Coin {
    
    public GBPTwentyPence(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a GBP TwentyPence!");
    }
}