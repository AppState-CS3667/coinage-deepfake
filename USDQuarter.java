public class USDQuarter extends Coin {
    
    public USDQuarter(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a USD Quarter!");
    }
}
