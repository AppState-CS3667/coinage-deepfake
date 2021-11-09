public class Test {

    public static void main(String[] args){

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Welcome to Deep Fake!");
        System.out.println("BEGINNING TESTS:");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\tTest 1: Making a coin object");
        try {
            Coin new_coin = new USDDollar(1.00, "USD", null);
            System.out.println("\tTest 1: Passed!");
        }
        catch(Exception e) {
            System.out.println("\tTest 1: Failed!");
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\tTest 2: Minting coin objects");
        try {
            USDMint USD = USDMint.getInstance(1.00, "USD");
			USD.makeCoin();
            System.out.println("\n\tTest 2: Passed!");
        }
        catch (Exception e) {
            System.out.println("\tTest 2: Failed!");
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}