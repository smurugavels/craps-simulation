import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPlayWithInheritance
{
	PlayWithInheritance playWithInheritance = new PlayWithInheritance();

	/**
	 * static methods cannot participate in method override.
	 * A method should be dynamic to participate in method override
	 * static method is not associated with instance of a class.
	 * */
	@Test
	public void test_PlayWithInheritance_testStatic_returns_die() {
		assertEquals("Die", PlayWithInheritance.testStatic());
	}
}
