public class GBPMint extends MintFactory {
    private volatile static GBPMint uniqueMint;
    private Coin c;

    private GBPMint(double denom_, String cc_) {
	denom = denom_;
	cc = cc_;
    } 

    public static GBPMint getInstance(double denom, String cc) {
	if (uniqueMint == null) {
	    synchronized (GBPMint.class) {
		if (uniqueMint == null) {
		    uniqueMint = new GBPMint(denom, cc); 
		}
	    }
	}
    }
    //To be called in Demo
    public Coin makeCoin() {
	if (denom == 0.01) {
	    c = new GBPPence(0.01, cc, new CompPT());
	} 
	else if (denom == 0.02) {
	    c = new GBPTwoPence(0.02, cc, new CompPT());
	} 
	else if (denom == 0.05) {
	    c = new GBPFivePence(0.05, cc, new CompNFFTF());
	} 
	else if (denom == 0.1) {
	    c = new GBPTenPence(0.1, cc, new CompNFFTF());
	} 
	else if (denom == 0.2) {
	    c = new GBPTwentyPence(0.20, cc, new CompTp());
	} 
	else if (denom == 0.5) {
	    c = new GBPFiftyPence(0.5, cc, new CompNFFTF());
	} 
	else if (denom == 1) {
	    c = new GBPPound(1, cc, new CompPo());
	} 
	else if (denom == 2) {
	    c = new GBPTwoPound(2, cc, new CompT());
	} 
	else if (denom == 5) {
	    c = new GBPFivePound(5, cc, new CompNFFTF());
	}
	else {
	    c = Coin.NULL;
	}


	c.display();
	manafacture();
	if (!inspection()) {
	    System.out.println("Failed inspection.");
	    return null;
	} else {
	    System.out.println("Passed inspection!");
	    if(!smoothing()) {
		System.out.println("Failed inspection.");
		return null;
	    } else {
		System.out.println("Passed smoothing!");
		if(!buffing()) {
		    System.out.println("Failed inspection.");
		    return null;
		} else {
		    System.out.println("Passed buffing!");
		}
	    }
	}
	return c;
    }

    private void manafacture() {
	c.smelt();
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
