import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GBPFiftyPenceTest {
    @Test
    public void testConstructor() {
	try {
	    Coin testGBPFiftyPence = new GBPFiftyPence(0.5,"GBP",new CompNFFTF());
	    assertNotNull(testGBPFiftyPence);
	}
	catch (Exception e) {
	    fail("Constructor threw exception: " + e.getMessage());
	}
    }

    @Test
    public void testSmelt() {
	Coin testGBPFiftyPence = new GBPFiftyPence(0.5,"GBP",new CompNFFTF());
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);
	String expectedResult = "Beginning smelting:\n75% Cu\n25% Ni\n"; 
	String testOutput = null;
	testGBPFiftyPence.smelt();
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);
	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
    @Test
    public void display() {
	Coin testGBPFiftyPence = new GBPFiftyPence(0.5,"GBP",new CompNFFTF());
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);
	String expectedResult = "Minting a GBP FiftyPence!\n"; 
	String testOutput = null;
	testGBPFiftyPence.display();
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);
	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
    @Test
    public void testgetDenomination() {
	Coin testGBPFiftyPence = new GBPFiftyPence(0.5,"GBP",new CompNFFTF());
	double expectedResult = 0.5;
	double testOutput = testGBPFiftyPence.getDenomination();
	assertEquals(expectedResult, testOutput,
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
}
