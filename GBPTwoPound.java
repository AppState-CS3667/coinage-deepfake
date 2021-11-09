/**
 *  GBPTwoPound class
 *  exetends coin
 *  @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 *  @version 1.0
 * */
public class GBPTwoPound extends Coin {

	/*
	 * GBPTwoPound()
	 * @param denomination
	 * @param countryCode
	 * @param smelting composition
	 * call the super constructor
	 */    
	public GBPTwoPound(double denomination, String countryCode, smelting composition) {
		super(denomination, countryCode, composition);
	}

	/*
	 * display()
	 * Display method for GBPTwoPound Coin
	 * @return void
	 */
	public void display() {
		System.out.println("Minting a GBP TwoPound!");
	}
}
