package acoecseb.csebmaven5A6;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    public void test() {
    	App a=new App();
    	int actual=a.add(15,15);
    	int expected=30;
    	assertEquals(expected,actual);
    }
}
