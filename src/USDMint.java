/*
 * class USDMint
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDMint extends MintFactory {
    /*
     * @fields
     * USDMint uniqueMint - unique instance of mint using singleton design pattern
     * Coin c - coin to be created
     */
    private volatile static USDMint uniqueMint;
    private Coin c;
    /*
     * Constructor for USDMint class
     */
    private USDMint(double denom_, String cc_) {
        denom = denom_;
        cc = cc_;
    } 
    /*
     * getInstance method to ensure only a single instance is created
     * @param double denom
     * @param String cc
     * @return USDMint
     */
    public static USDMint getInstance(double denom, String cc) {
        if (uniqueMint == null) {
            synchronized (USDMint.class) {
                if (uniqueMint == null) {
                    uniqueMint = new USDMint(denom, cc); 
                }
            }
        }
        return uniqueMint;
    }
    /*
     * Method to create coin
     * @return Coin
     */
    public Coin makeCoin() {
        if(denom == 0.01) {
            c = new USDPenny(0.01, cc, new CompP());
        }
        else if (denom == 0.05) {
            c = new USDNickel(0.05, cc, new CompNFFTF());
        }
        else if (denom == 0.1) {
            c = new USDDime(0.1, cc, new CompHQD());
        }
        else if (denom == 0.25) {
            c = new USDQuarter(0.25, cc, new CompHQD());
        }
        else if (denom == 0.5) {
            c = new USDHalfDollar(0.5, cc, new CompHQD());
        }
        else if (denom == 1) {
            c = new USDDollar(1, cc, new CompD());
        }
        else {
            c = Coin.NULL;
        }


        c.display();
        manafacture();
        if (!inspection() || c.getDenomination() == 0) {
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
    /*
     * Method for manufacture process
     * @return void
     */
    public void manafacture() {
        c.smelt();
    }
    /*
     * Method for inspeaction process
     * @return boolean
     */
    public boolean inspection() {
        // 1/12 chance of failing inspection 
        return rand.nextInt(12) != 0;
    }
    /*
     * Method for smoothing process
     * @return boolean
     */
    public boolean smoothing() {
        // 1/1000 chance of failing smoothing
        return rand.nextInt(1000) != 0;	
    }
    /*
     * Method for buffing process
     * @return boolean
     */
    public boolean buffing() {
        // 1/1000 chance of failing buffing
        return rand.nextInt(1000) != 0;
    } 
}
