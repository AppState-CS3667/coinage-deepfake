public class USDPenny implements Coin {
    
    public USDPenny(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a USD Penny!");
    }
}
