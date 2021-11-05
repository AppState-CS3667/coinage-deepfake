<<<<<<< HEAD
public abstract class Coin implements metals {
    
    protected String commonName;
    protected double denomination;
    protected String countryCode;

    abstract  Coin();
}
=======
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
>>>>>>> 348b04504c0a06f3182d50f4f3e823c5d5496870
