import java.util.Random;
import java.util.Scanner;

public class Demo {

	Scanner coinMaking = new Scanner(System.in);
	private String counterfeitCoinCountry;
	private double counterfeitCoinDenomination;

	public void main(String[] args) {


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

		if(getCounterfeitCoinCountry().equals("USD")) {
			System.out.println("You want to make a USD Coin.");
			System.out.println("What denomination do you want to make?");
			counterfeitCoinDenomination = coinMaking.nextDouble();
			USDMint = USDMint.getInstance(getCounterfeitCoinDenomination(), getCounterfeitCoinCountry());
			USDMint.makeCoin();
		}
		else if(getCounterfeitCoinCountry().equals("GBP")) {
			System.out.println("You want to make a GBP Coin.");
			System.out.println("What denomination do you want to make?");
			counterfeitCoinDenomination = coinMaking.nextDouble();
			GBPMint = GBPMint.getInstance(getCounterfeitCoinDenomination(), getCounterfeitCoinCountry());
			GBPMint.makeCoin();
		}
	}

	public String getCounterfeitCoinCountry() {
		return counterfeitCoinCountry;
	}

	public double getCounterfeitCoinDenomination() {
		return counterfeitCoinDenomination;
	}
	
	public void setCounterfeitCoinCountry(String counterfeitCoinCountry) {
		this.counterfeitCoinCountry = counterfeitCoinCountry;
	}

	public void setCounterfeitCoinDenomination(double counterfeitCoinDenomination) {
		this.counterfeitCoinDenomination = counterfeitCoinDenomination;
	}
}
