/**
 * class GBPFivePound
 * GBP Five Pound coin constructor class
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class GBPFivePound extends Coin {

	/*
	 * GBPFivePound ()
	 * extends coin
	 * GBP Five pound coin constructor
	 * @param double denomination
	 * @param String countryCode
	 * @param smelting composition
	 * Calls the super constructor
	 */ 
	public GBPFivePound(double denomination, String countryCode, smelting composition) {
		super(denomination, countryCode, composition);
	}

	/* display()
	 * display method for GBPFive Pound Coin
	 * @return void
	 *
	 */
	public void display() {
		System.out.println("Minting a GBP FivePound!");
	}
}
