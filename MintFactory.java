import java.util.Random;
public abstract class MintFactory extends Coin {
    protected Random rand = new Random();
    abstract void makeCoin(double denom, String cc);
}
