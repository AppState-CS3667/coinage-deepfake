public abstract class Coin implements smelting {
    protected double denomination;
    protected String countryCode;
    private smelting composition;

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
}