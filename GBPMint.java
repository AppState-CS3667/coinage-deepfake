public class GBPMint extends MintFactory {
    private volatile static GBPMint uniqueMint;
    private Coin c;

    private GBPMint(double denom, String cc) {
		rand.setSeed((int)denom * 17);
    } 
 
    public static GBPMint getInstance() {
		if (uniqueMint == null) {
			synchronized (GBPMint.class) {
				if (uniqueMint == null) {
					// denomination and  countryCode will be set in the Demo class 
					uniqueMint = new GBPMint(denomination, countryCode); 
				}
			}
		}
    }
    //To be called in Demo
    public Coin makeCoin(double denom) {
		switch(denom) {
			case 0.01:
			c = new GBPPence(0.01, "GBP", new CompPT());
			break;
            case 0.02:
            c = new GBPTwoPence(0.02, "GBP", new CompPT());
            break;
			case 0.05:
			c = new GBPFivePence(0.05, "GBP", new CompNFFTF());
			break;
			case 0.1:
			c = new GBPTenPence(0.1, "GBP", new CompNFFTF());
			break;
			case 0.20:
			c = new GBPTwentyPence(0.20, "GBP", new CompTp());
			break;
			case 0.5:
			c = new GBPFiftyPence(0.5, "GBP", new CompNFFTF());
  			break;
			case 1:
			c = new GBPPound(1, "GBP", new CompPo());
			break;
            case 2:
            c = new GBPTwoPound(2, "GBP", new CompT());
            break;
            case 5:
            c = new GBPFivePound(5, "GBP", new CompNFFTF());
            break;
		}
		manafacture();
		c.setInspect(inspection());
		c.setSmooth(smoothing());
		c.setBuff(buffing());
    }
	
    //implement in smelt?
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
