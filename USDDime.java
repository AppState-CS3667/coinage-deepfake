public class USDDime extends Coin {
    
    public USDDime(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a USD Dime!");
    }
}
