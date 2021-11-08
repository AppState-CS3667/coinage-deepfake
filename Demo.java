import java.util.Random;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner coinMaking = new Scanner(System.in);
		String counterfeitCoinCountry;
		double counterfeitCoinDenomination;

		//Possibly consolidate this into makeCoin()
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Welcome to Deep Fake!");
		System.out.println("What coin would you like to make?");
		System.out.println("Which counties coin do you want to make? Enter USD or GBP:");
		counterfeitCoinCountry = coinMaking.nextLine();
		counterfeitCoinCountry = counterfeitCoinCountry.toUpperCase();
		while((!counterfeitCoinCountry.equals("USD")) && (!counterfeitCoinCountry.equals("GBP"))) {
			System.out.println("We can't make that type of coin. \n Try again.");
			counterfeitCoinCountry = coinMaking.nextLine();
			counterfeitCoinCountry.toUpperCase();
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
	}

}
