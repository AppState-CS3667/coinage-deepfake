import java.util.Random;
/*
 * abstract class MintFactory
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public abstract class MintFactory {
    /*
     * @fields
     * double denom - denomination
     * String cc - country code
     * Random rand - random object
     */
    protected double denom = 0;
    protected String cc = "";
    protected Random rand = new Random();
    /*
     * abstract makeCoin method
     * @return Coin
     */
    abstract Coin makeCoin();
}
