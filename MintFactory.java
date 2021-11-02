public abstract class MintFactory extends Coin {
    abstract Coin makeCoin(double denom, String cc);
}
