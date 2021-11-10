import java.util.Random;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

	Scanner coinMaking = new Scanner(System.in);
	String counterfeitCoinCountry;
	double counterfeitCoinDenomination;
	boolean runOnce = false;

	//Possibly consolidate this into makeCoin()
	System.out.println("-----------------------------------------------------------------------------");
	System.out.println("Welcome to Deep Fake!");
	System.out.println("What coin would you like to make?");
	do {
	    if (!runOnce) {
		System.out.println("Which countries coin do you want to make? Enter USD or GBP (0 to exit):");
		runOnce = true;
	    } else {
		System.out.println("Want to make another coin? Enter USD or GBP (0 to exit):");
	    }
	    counterfeitCoinCountry = coinMaking.nextLine();
	    counterfeitCoinCountry = counterfeitCoinCountry.toUpperCase();
	    while(((!counterfeitCoinCountry.equals("GBP")) && (!counterfeitCoinCountry.equals("USD"))) && (!counterfeitCoinCountry.equals("0"))) {
		System.out.println("We can't make that type of coin. \n Try again.");
		counterfeitCoinCountry = coinMaking.nextLine();
		counterfeitCoinCountry = counterfeitCoinCountry.toUpperCase();
	    }

	    if(counterfeitCoinCountry.equals("USD")) {
		System.out.println("You want to make a USD Coin.");
		System.out.println("What denomination do you want to make?");
		counterfeitCoinDenomination = coinMaking.nextDouble();
		USDMint USD = USDMint.getInstance(counterfeitCoinDenomination, counterfeitCoinCountry);
		USD.makeCoin();
	    }
	    else if(counterfeitCoinCountry.equals("GBP")) {
		System.out.println("You want to make a GBP Coin.");
		System.out.println("What denomination do you want to make?");
		counterfeitCoinDenomination = coinMaking.nextDouble();
		GBPMint GBP = GBPMint.getInstance(counterfeitCoinDenomination, counterfeitCoinCountry);
		GBP.makeCoin();
	    }
	    if (!counterfeitCoinCountry.equals("0")) coinMaking.nextLine();
	} while (!counterfeitCoinCountry.equals("0"));
    }

}
