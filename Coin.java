public abstract class Coin implements smelting {
    protected double denomination;
    protected String countryCode;
    private smelting composition;
    public static Coin NULL = new NullCoin();
    private static class NullCoin extends Coin {
        @Override
        public void smelt() {
            System.out.println("A Null coin can't be smelted");
        }
        @Override
        public void display() {
            System.out.println("Incompatable denomination Null coin created");
        }
	public NullCoin() {
	    super(0.0,"",null);
	}
    }
    public Coin(double denomination, String countryCode, smelting composition) {
        this.denomination = denomination;
        this.countryCode = countryCode;
        this.composition = composition;
    }

    public void smelt() {
        System.out.println("Beginning smelting:");
        composition.smelt();
    }

    public abstract void display();

    public double getDenomination() {
        return denomination;
    }
}
