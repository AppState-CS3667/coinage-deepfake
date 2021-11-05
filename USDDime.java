public class USDDime extends Coin {
    
    public USDDime(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a USD Dime!");
    }
}
