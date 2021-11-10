/*
 * class USDHalfDollar extends Coin
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDHalfDollar extends Coin {
    /*
     * Coin constructor
     * @param double denomination
     * @param String countryCode
     * @param smelting composition
     */
    public USDHalfDollar(double denomination, String countryCode, smelting composition) {
        super(denomination, countryCode, composition);
    }
    /*
     * Method to run minting message
	 * @return void
     */
    public void display () {
        System.out.println("Minting a USD HalfDollar!");
    }
}
