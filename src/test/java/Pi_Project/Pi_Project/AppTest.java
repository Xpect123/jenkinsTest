package Pi_Project.Pi_Project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
	System.out.println("Hello Test!");
	System.out.println("Update sucessful");
	System.out.println("first step to CI + second");
	System.out.println("test der dritte 17.9");
	System.out.println("Wie laeufts denn so 28.09");
	
	}

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
