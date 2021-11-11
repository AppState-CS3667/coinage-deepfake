import java.util.Random;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner coinMaking = new Scanner(System.in);
        String counterfeitCoinCountry;
        double counterfeitCoinDenomination;
        boolean runOnce = false;

        //Possibly consolidate this into makeCoin()
        System.out.println("====================================================================================================");
        System.out.println("                                    ~ Welcome to Deep Fake! ~\n");
        System.out.println("What coin would you like to make?");
        do {
            if (!runOnce) {
                System.out.printf("Which countries coin do you want to make? Enter USD or GBP (0 to exit, Defaults to USD): ");
                runOnce = true;
            } else {
                System.out.printf("\nWant to make another coin? Enter USD or GBP (0 to exit, Defaults to USD): ");
            }
            counterfeitCoinCountry = coinMaking.nextLine();
            counterfeitCoinCountry = counterfeitCoinCountry.toUpperCase();
            if (counterfeitCoinCountry.equals("")) counterfeitCoinCountry = "USD";
            while(((!counterfeitCoinCountry.equals("GBP")) && (!counterfeitCoinCountry.equals("USD"))) && (!counterfeitCoinCountry.equals("0"))) {
                System.out.println("\nWe can't make that type of coin, try again.");
                System.out.printf("Enter USD or GBP (0 to exit, Defaults to USD): ");
                counterfeitCoinCountry = coinMaking.nextLine();
                counterfeitCoinCountry = counterfeitCoinCountry.toUpperCase();
                if (counterfeitCoinCountry.equals("")) counterfeitCoinCountry = "USD";
            }

            if(counterfeitCoinCountry.equals("USD")) {
                System.out.println("\nYou want to make a USD Coin.");
                System.out.printf("What denomination do you want to make? (Enter 1, .5, .25, .1, .05, or .01) : ");
                try {
                    counterfeitCoinDenomination = Double.parseDouble(coinMaking.nextLine());
                } catch (NumberFormatException e) {
                    counterfeitCoinDenomination = 100;
                }
                USDMint USD = USDMint.getInstance(counterfeitCoinDenomination, counterfeitCoinCountry);
                USD.makeCoin();
            }
            else if(counterfeitCoinCountry.equals("GBP")) {
                System.out.println("\nYou want to make a GBP Coin.");
                System.out.printf("What denomination do you want to make? (Enter 5, 2, 1, .5, .2, .1, .05, .02, .01) : ");
                try {
                    counterfeitCoinDenomination = Double.parseDouble(coinMaking.nextLine());
                } catch (NumberFormatException e) {
                    counterfeitCoinDenomination = 100;
                }
                GBPMint GBP = GBPMint.getInstance(counterfeitCoinDenomination, counterfeitCoinCountry);
                GBP.makeCoin();
            }
        } while (!counterfeitCoinCountry.equals("0"));
        System.out.println("\n                              ~ Thanks for minting with Deep Fake! ~");
        System.out.println("====================================================================================================");
    }

}
