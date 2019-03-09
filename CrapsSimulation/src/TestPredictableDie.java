import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class TestPredictableDie
{
	private PredictableDie pd;
	@Before
	public void setUp()
	{
		pd = new PredictableDie(new int[] {1});
	}
	
	@Test
	public void test_predictable_die_one_value_toResult_one() {
		pd = new PredictableDie(new int[] {1});
		pd.roll();
		int lastRoll = pd.getLastRoll();
		assertEquals(1, lastRoll);
	}
	
	@Test
	public void test_predictable_die_two_value_toResult_as_expected_Number() {
		pd = new PredictableDie(new int[] {5, 2});
		pd.roll();
		assertEquals(5, pd.getLastRoll());

		pd.roll();
		assertEquals(2, pd.getLastRoll());
	}
	
	@Test
	public void test_predictable_die_undefined_value_ignored() {
		pd = new PredictableDie(new int[] {5,});
		pd.roll();
		assertEquals(5, pd.getLastRoll());

		pd.roll();
		assertEquals(5, pd.getLastRoll());
	}
	
	@Test
	public void test_predictable_die_two_values_toResult_as_wraparound() {
		pd = new PredictableDie(new int[] {1, 2});
		pd.roll();
		assertEquals(1, pd.getLastRoll());

		pd.roll();
		assertEquals(2, pd.getLastRoll());
		
		pd.roll();
		assertEquals(1, pd.getLastRoll());
	}
	
	@Test(expected = RuntimeException.class)
	public void test_predictable_die_empty_initializer() {
		pd = new PredictableDie(new int[] {});
		pd.roll();
	}
	
	@Test(expected = RuntimeException.class)
	public void test_predictable_die_null_initializer() {
		pd = new PredictableDie(null);
		pd.roll();
	}

}
