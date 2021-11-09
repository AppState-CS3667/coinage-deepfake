import java.util.Random;
public abstract class MintFactory {
    protected double denom = 0;
    protected String cc = "";
    protected Random rand = new Random();
    abstract Coin makeCoin();
}
