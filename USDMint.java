public class USDMint extends MintFactory {
    private volatile static USDMint uniqueMint;
    private Coin c;
    private String commonName = "";
    private USDMint(double denom, String cc) {
	rand.setSeed((int)denom * 17);
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
    //To be called in Demo
    public Coin makeCoin(double denom) {
    		switch(denom) {
	switch(denom) {
	    case 0.01:
		c = new USDPenny();
		break;
	    case 0.05:
		commonName = "USDNickel";
		break;
	    case 0.1:
		commonName = "USDDime";
		break;
	    case 0.25:
		commonName = "USDQuarter";
		break;
	    case 0.5:
		commonName = "USDHalfdollar";
		break;
	    case 1:
		commonName = "USDDollar";
		break;

	}
	Coin coin = manafacture();
	coin.setInspect(inspection());
	coin.setSmooth(smoothing());
	coin.setBuff(buffing());
	return coin;
    }
    //implement in smelt?
    private USDCoin manafacture() {
	Smelt usSmelt = new Smelt(c);
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