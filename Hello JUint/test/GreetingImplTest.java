import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	private Greeting greeting;
	
	@Before
	public void setup() {
		System.out.println("--Setup--");
		greeting = new GreetingImpl();
	}
	
	
	
	@Test
	public void greetReturnGreetingTest() {
		System.out.println("greetReturnGreetingTest");
		String result = greeting.greet("JUnit");
		assertNotNull(result);
		assertEquals("Hello JUnit", result);	
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetThrowsException_NullNameTest() {
		System.out.println("greetThrowsException_NullNameTest");
		greeting.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetThrowsException_BlankNameTest() {
		System.out.println("greetThrowsException_BlankNameTest");
		greeting.greet("");
	}
	
	
	
	
	@After
	public void teardown() {
		System.out.println("--Teardown--");
		greeting = null;
	}
}
