public class USDQuarter implements Coin {
    
    public USDQuarter(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a USD Quarter!");
    }
}
