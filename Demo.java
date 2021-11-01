import java.util.Random;

public class Demo {


	Demo() {
		
	}

	public void main(String[] args) {

	//Possibly consolidate this into makeCoin() 
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
