/*
 * abstract class Coin
 * @author group deepFake
 * (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0 
 */
public abstract class Coin implements smelting {
    
    /*
     * Fields
     * double denomination = value of the coin
     * String countryCode = which country is the coin from
     * smelting composition = metalurgical composition of the coin 
     */
    protected double denomination;
    protected String countryCode;
    private smelting composition;
    public static Coin NULL = new NullCoin();

    /*
    * private static NullCoin class
    *
    *
    */
    private static class NullCoin extends Coin {
        /*
        * smelt()
        * @return void
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
            System.out.println("Incompatable denomination Null coin created");
        }
        /*
        * NullCoin()
        * Constructer
        *
        */
	    public NullCoin() {
	        super(0.0,"",null);
	    }
    }

    /*
     * Coin()
     * Coin constructor 
     * @param double denomination
     * @param String countryCode
     * @param smelting composition
     *
     */ 
    public Coin(double denomination, String countryCode, smelting composition) {
        this.denomination = denomination;
        this.countryCode = countryCode;
        this.composition = composition;
    }

    /*
     * smelt()
     * @return void
     * Adds the mealurigical composition value to the coin
     */ 
    public void smelt() {
        System.out.println("Beginning smelting:");
        composition.smelt();
    }

    /* abstract display()
     *  @return void
     */ 
    public abstract void display();

    /*
    * getDenomination()
    * @return double
    * Getter for the coins denomination.
    */
    public double getDenomination() {
        return denomination;
    }
}