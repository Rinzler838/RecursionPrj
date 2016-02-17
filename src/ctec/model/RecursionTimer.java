package ctec.model;

import org.apache.commons.lang.time.StopWatch;
import ctec.controller.RecursionController;

public class RecursionTimer extends Object
{
	private long executionTime;
	private Timer recursionTimer;
	
	public RecursionTimer()
	{
		executionTime = 0;
	}
	
	public void displayTimerInfo()
	{
		System.out.println("Elapsed milliseconds: " + executionTime);
	}
	
	public void startTimer()
	{
		recursionTimer.start();
	}
	
	public void stopTimer()
	{
		recursionTimer.stop();
	}
	
	public void resetTimer()
	{
		recursionTimer.restart();
	}
	
	public long getExecutionTimerInMicroSeconds(long executionTime)
	{
		return executionTime;
	}
	
	public long getElapsedTime()
	{
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		
		return executionTime;
	}
}
