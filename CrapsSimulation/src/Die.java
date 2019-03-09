
public class Die
{
	protected int lastRoll;

	public Die()
	{
		// CrapsGame.println("Die's constructor called.");
		lastRoll = getANewDieRoll();
	}

	public Die(int firstValue) // overloaded constructor: different signature
	{
		setLastRoll(firstValue);
	}

	public int getLastRoll() // getter or accessor method
	{

		return this.lastRoll;
	}

	// protected => visible to subclasses and package
	protected void setLastRoll(int lastRoll) // setter or mutator method
	{
		this.lastRoll = lastRoll;
	}

	public void roll() // note how this changes Die's state, but doesn't return anything
	{
		setLastRoll(getANewDieRoll());
	}
	
	public int getANewDieRoll()
	{
		return (int) (Math.random() * 6 + 1);
	}	

	// try changing visibility of toString to protected...
	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "A Die object with roll " + this.getLastRoll();

		// add the following to the end of the above line:
		// + " " + super.toString()
	}

	public String toString(int msg) // Overloading... but NOT overriding!
	{
		return msg + this.toString();
	}
	
	/**
	 * A static method that returns string value "Die"
	 * 
	 * */
	public static String testStatic()
	{
		return "Die";
	}
}
