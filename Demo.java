import java.util.Random;

public class Demo {


	Demo() {
		
	}

	public void main(String[] args) {

	//Possibly consolidate this into makeCoin() 
		
	Coin USDCoin = new USDCoin();
	Coin GBPCoin = new GBPCoin();

	USDCoin.toString();
	
	
	
	
		if(inspection()) {
			System.out.println("The" + baseCoin + "has passed inspection.");
		}
		if(smoothing()) {
			System.out.println("The" + baseCoin + "has been properly smoothed.");
		}
		if(buffing()) {
			System.out.println("The" + baseCoin + "has been properly buffed.");
		}

	}


}
