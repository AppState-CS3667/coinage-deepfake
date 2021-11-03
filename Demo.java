import java.util.Random;
import java.util.Scanner;

public class Demo {


        public void main(String[] args) {

	//Coin demoCoin = new demoCoin();
	//Scanner coinMaking = new Scanner(System.in);
	

	//Possibly consolidate this into makeCoin()
	System.out.println("-----------------------------------------------------------------------------");
	System.out.println("Welcome to Deep Fake!");
	System.out.println("What coin would you like to make?");
	System.out.println("Which counties coin do you want to make? Enter USD or GBP:");
	String counterfeitCoinCountry = coinMaking.nextLine();
	counterfeitCoinCountry.toUpperCase();
	while((counterfeitCoinCountry.compareTo("USD") == false) && (counterfeitCoinCountry.compareTo("GBP") == false)) {
		System.out.println("We can't make that type of coin. \n Try again.");
		CounterfeitCoinCountry = coinMaking.nextLine();
		counterfeitCoinCountry.toUpperCase();
	}
	if(counterfeitCoinCountry.compareTo("USD") == true) {
		System.out.println("You want to make a USD Coin.");
		System.out.println("What denomination do you want to make?");
	}

	else if(counterfeitCoinCountry.compareTo("GBP") == true) {
		System.out.println("You want to make a GBP Coin.");
		System.out.println("What denomination do you want to make?");
	}
	
	

	Coin USDCoin = new USDCoin();
	Coin GBPCoin = new GBPCoin();

	System.out.println(USDCoin);
	System.out.println("A USD " + USDCoin.getDescription() + " coin has been minted.");
	System.out.println("This coin is composed of " + UDSCoin.getComposition());

        System.out.println("-----------------------------------------------------------------------------");
	System.out.println("A GBP " + GBPCoin.getDesciption() + "");
	System.out.println(GBPCOIN);

//	USDCoin.toString();
	
	//	if(inspection()) {
	//		System.out.println("The" + baseCoin + "has passed inspection.");
	//	}
	//	if(smoothing()) {
	//		System.out.println("The" + baseCoin + "has been properly smoothed.");
	//	}
	//	if(buffing()) {
	//		System.out.println("The" + baseCoin + "has been properly buffed.");
	//	}

	//}


	}
}
