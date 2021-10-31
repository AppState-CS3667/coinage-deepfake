import java.util.Random;
public abstract class Mint extends Coin {
    private volatile static Mint uniqueMint;
    private static baseCoin;
    protected Random rand = new Random();
    // Set seed of rand in the implementations of this constructo (in the concrete factories) 
    protected Mint(String countryCode); 
    //To be implemented in the various "Concrete Factory Classes (Quarter, penny...)
    public abstract static Mint getInstance() {
	if (uniqueBaseCoin == null) {
	    synchronized (Mint.class) {
		if (uniqueBaseCoin == null) {
		    // countryCode will be set in the Concrete Factories 
		    uniqueBaseMint = new Mint(countryCode) 
		}
	    }
	}
    }
    //implement in smith?
    abstract static boolean manafacture() {}
    public static boolean inspection() {
	// 1/12 chance of failing inspection 
	return rand.nextInt(12) != 0; 
    }
    public static boolean smoothing() {
	// 1/1000 chance of failing smoothing
	return rand.nextInt(1000) != 0;	
    }
    public static boolean buffing() {
	// 1/1000 chance of failing buffing
	return rand.nextInt(1000) != 0;
    } 
}
