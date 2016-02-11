package ctec.model;

public class RecursionTool
{
	public int getFibNumber(int position)
	{
		//Defensive code against bad people
		if (position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		//Base case
		if (position == 0 || position == 1)
		{
			return 1;
		}
		else //Recursive case
		{
			return getFibNumber(position - 1) + getFibNumber(position - 2);
		}
	}
	
	public double getFactorialNumber(double position)
	{
		//Defensive code against bad people
		if (position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		if (position == 0)
		{
			return 1;
		}
		else
		{
			return position * getFactorialNumber(position - 1);
		}
	}
}
