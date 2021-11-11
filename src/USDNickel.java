/**class USDNickel extends Coin.
 * @author group deepFake 
 * (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDNickel extends Coin {
    /**Coin constructor.
     * @param denomination amount of coin
     * @param countryCode country of origin
     * @param composition metalurgical composition
     */
    public USDNickel(double denomination, String countryCode,
    smelting composition) {
        super(denomination, countryCode, composition);
    }
    /**Method to run minting message.
     */
    public void display() {
        System.out.println("Minting a USD Nickel!");
    }
}

