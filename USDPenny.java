public class USDPenny extends Coin {
    
    public USDPenny(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a USD Penny!");
    }
}
