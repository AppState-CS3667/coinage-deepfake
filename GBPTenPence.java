/**
 * GBPTencPence
 * extends coin
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class GBPTenPence extends Coin {

	/*
	 *GBPTenPence() 
	 @param double denomination
	 @param String countryCode
	 @param smeling composition
	 */    
	public GBPTenPence(double denomination, String countryCode, smelting composition) {
		super(denomination, countryCode, composition);
	}

	/*
	 * display()
	 * Display method for GBPTenPence coin
	 * @return void
	 */
	public void display() {
		System.out.println("Minting a GBP TenPence!");
	}
}
