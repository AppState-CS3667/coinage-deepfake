/**abstract class Coin.
 * @author group deepFake
 * (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0 
 */
public abstract class Coin implements smelting {

    /**Fields.
     * double denomination = value of the coin
     * String countryCode = which country is the coin from
     * smelting composition = metalurgical composition of the coin 
     */
    public static Coin NULL  = new NullCoin();
    protected double denomination;
    protected String countryCode;
    private smelting composition;

    /**private static NullCoin class.
    */
    private static class NullCoin extends Coin {
        /**Null Coin.
         * Constructor
         */
        public NullCoin() {
            super(0.0, "", null);
        }

        /**smelt.
         * null coin smelt
         */
        @Override
        public void smelt() {
            System.out.println("A Null coin can't be smelted");
        }
        /*
         * display()
         * @return void
         * displays null coin 
         */
        @Override
        public void display() {
            System.out.println("Incompatable denomination"
                + "Null coin created");
        }
    }

    /**Coin constructor.
     * @param denomination coin value
     * @param countryCode country of origin
     * @param composition metalurgical composition
     */ 
    public Coin(double denomination, String countryCode,
    smelting composition) {
        this.denomination = denomination_;
        this.countryCode = countryCode_;
        this.composition = composition_;
    }

    /**Adds the mealurigical composition value to the coin.
    */ 
    public void smelt() {
        System.out.println("Beginning smelting:");
        composition.smelt();
    }

    /** display the coin as printlines. 
    */ 
    public abstract void display();

    /**Getter for the coin's denomination.
     * @return double
     */
    public double getDenomination() {
        return denomination;
    }
}
