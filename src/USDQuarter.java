/**
 * class USDQuarter extends Coin.
 * @author group deepFake (Baylor Matney, Isaac Allen,
 * Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDQuarter extends Coin {
	/**
	* Coin constructor.
	* @param denomination denom
	* @param countryCode cc
	* @param composition comp
	*/
    public USDQuarter(double denomination, 
	String countryCode, smelting composition) {
		super(denomination, countryCode, composition);
    }
	/**
	 * Method to run minting message.
	 */
    public void display() {
        System.out.println("Minting a USD Quarter!");
    }
}
