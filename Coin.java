public abstract class Coin implements Metals {
    public boolean inspect;
    public boolean smooth;
    protected String commonName;

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
