Stuff to redirect System.out for testing purposes.
import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TestCoin extends Coin {
    // Concrete constructor calls superclass constructor
    public TestCoin() {
	super("TestCoin for testing only!", 0.0);
    }
    public int calories() { return 0; }
    public double cost() { return 0.0; }
    public String toString() { return "Empty XxxxCookie test object"; }
    public boolean hasNuts() { return false; }
}

public class CoinTest {

    @Test
    public void testConstructor() {
	try {
	    Coin testCoin = new TestCoin();
	    assertNotNull(testCoin);
	}
	catch (Exception e) {
	    fail("Constructor threw exception: " + e.getMessage());
	}
    }

    @Test
    public void testDescription() {
	Coin testCoin = new testCoin();

	String expectedResult = "XxxxCookie for testing only!";
	String testOutput = null;

	testOutput = xxxxCookie.getDescription();

	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }

    @Test
    public void testToString() {
	// 1. Prep for test
	// 1a. Make object that has method needing testing.
	Cookie xxxxCookie = new XxxxCookie();

	// 1b. Declare actual and expected outputs
	String expectedResult = "Empty XxxxCookie test object";
	String testOutput = null;

	// 1c. Save current System.out and set to new stream we can read.
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);

	// 2. Conduct method test (print/println call toString automatically)
	System.out.print(xxxxCookie);

	// 3. Test Cleanup
	// 3a.Get all the stuff the method wrote to System.out, and reset it.
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);

	// 3b. Check results
	//      (Can't compare String object NAMES, need to compare chars!!)
	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
}
