public abstract class Coin implements smelting {
    protected double denomination;
    protected String countryCode;
    private smelting compasition;

    public Coin(double denomination, String countryCode, smelting compasition) {
        this.denomination = denomination;
        this.countryCode = countryCode;
        this.compasition = compasition;
    }

    public void smelt() {
        System.out.println("Beginning smelting:");
        compasition.smelt();
    }
}
