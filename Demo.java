import java.util.Random;
import java.util.Scanner;

public class Demo {

	private static Scanner coinMaking = new Scanner(System.in);
	private static String counterfeitCoinCountry;
	private static double counterfeitCoinDenomination;

	public static void main(String[] args) {


		//Possibly consolidate this into makeCoin()
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Welcome to Deep Fake!");
		System.out.println("What coin would you like to make?");
		System.out.println("Which countries coin do you want to make? Enter USD or GBP:");
		counterfeitCoinCountry = coinMaking.nextLine();
		counterfeitCoinCountry = counterfeitCoinCountry.toUpperCase();
		while((!counterfeitCoinCountry.equals("USD")) && (!counterfeitCoinCountry.equals("GBP"))) {
			System.out.println("We can't make that type of coin. \n Try again.");
			counterfeitCoinCountry = coinMaking.nextLine();
			counterfeitCoinCountry.toUpperCase();
		}

		if(getCounterfeitCoinCountry().equals("USD")) {
			System.out.println("You want to make a USD Coin.");
			System.out.println("What denomination do you want to make?");
			counterfeitCoinDenomination = coinMaking.nextDouble();
			USDMint uSDMint = USDMint.getInstance(getCounterfeitCoinDenomination(), getCounterfeitCoinCountry());
			uSDMint.makeCoin();
		}
		else if(getCounterfeitCoinCountry().equals("GBP")) {
			System.out.println("You want to make a GBP Coin.");
			System.out.println("What denomination do you want to make?");
			counterfeitCoinDenomination = coinMaking.nextDouble();
			GBPMint gBPMint = GBPMint.getInstance(getCounterfeitCoinDenomination(), getCounterfeitCoinCountry());
			gBPMint.makeCoin();
		}
	}

	public static String getCounterfeitCoinCountry() {
		return counterfeitCoinCountry;
	}

	public static double getCounterfeitCoinDenomination() {
		return counterfeitCoinDenomination;
	}
	
	public static void setCounterfeitCoinCountry(String cCoinCountry) {
		counterfeitCoinCountry = cCoinCountry;
	}

	public static void setCounterfeitCoinDenomination(double cCDenomination) {
		counterfeitCoinDenomination = cCDenomination;
	}
}
