public class USDHalfDollar extends Coin {
    
    public USDHalfDollar(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a USD HalfDollar!");
    }
}
