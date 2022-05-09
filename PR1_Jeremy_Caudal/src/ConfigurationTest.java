import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConfigurationTest {
	private Configuration test1;
	
	@Before
	public void setUp() {
		test1 = CLIClassique.configuration("-K", "10", "-A", ".90", "-K", "20", "-P", "-K", "30", "-C");
	}
	
	@After
	public void tearDown() {
		test1 = null;
	}
	
	@Test
	public void testConfiguration() {
		System.out.println(test1.toString());
		assertEquals(test1.toString(), "alpha=0.9, epsilon=-1.0, indice=30, mode=CREUSE");
	}
}
