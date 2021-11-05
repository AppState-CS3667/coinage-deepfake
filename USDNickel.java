public class USDNickel extends Coin {
    
    public USDNickel(double denomination, String countryCode, smelting composition) {
         super(denomination, countryCode, composition);
    }
 
    public void display () {
        System.out.println("Minting a USD Nickel!");
    }
}

