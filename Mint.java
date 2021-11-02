public class USDMint extends MintFactory {
    private volatile static USDMint uniqueMint;

    private USDMint(double denom, String cc) {
	rand.setSeed((int)denom * 17);
	makeCoin(denom, cc);
    } 
    //USDMint.getInstance() should be called 
    public static USDMint getInstance() {
	if (uniqueMint == null) {
	    synchronized (USDMint.class) {
		if (uniqueMint == null) {
		    // denomination and  countryCode will be set in the Demo class 
		    uniqueMint = new USDMint(denomination, countryCode) 
		}
	    }
	}
    }
    
    private void makeCoin(double denom, String cc) {
		
    }
    //implement in smelt?
    private USDCoin manafacture() {
	Smelt usSmelt = new Smelt(commonName);
	return usSmelt.run();
    }
    private boolean inspection() {
	// 1/12 chance of failing inspection 
	return rand.nextInt(12) != 0; 
    }
    private  boolean smoothing() {
	// 1/1000 chance of failing smoothing
	return rand.nextInt(1000) != 0;	
    }
    private boolean buffing() {
	// 1/1000 chance of failing buffing
	return rand.nextInt(1000) != 0;
    } 
}
