public class USDNickel extends Coin {
    
    public USDNickel(double denomination, String countryCode, smelting compasition) {
         super(denomination, countryCode, compasition);
    }
 
    public void display () {
        System.out.println("Minting a USD Nickel!");
    }
}

