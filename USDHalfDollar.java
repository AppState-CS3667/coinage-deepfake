public class USDHalfDollar implements Coin {
    
    public USDHalfDollar(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a USD HalfDollar!");
    }
}
