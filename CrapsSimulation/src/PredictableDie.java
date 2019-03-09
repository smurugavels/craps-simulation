import javax.management.RuntimeErrorException;

public class PredictableDie extends Die
{
	private int[] throwSequence = {};
	private int nextInSequence = 0;

	public PredictableDie(int[] sequence)
	{
		super();
		if (sequence == null || sequence.length == 0) {
			throw new RuntimeException("null or empty sequence");
		}
		throwSequence = sequence;
	}
	
	public void roll()
	{
		if ((nextInSequence == throwSequence.length) || (throwSequence.length == 0))
		{
			nextInSequence = 0;
		}

		super.setLastRoll(throwSequence[nextInSequence]);
		nextInSequence++;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
