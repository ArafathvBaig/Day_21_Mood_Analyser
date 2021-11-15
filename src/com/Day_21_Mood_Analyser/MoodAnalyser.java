package com.Day_21_Mood_Analyser;

public class MoodAnalyser
{
	public String message;
	public MoodAnalyser()
	{
		
	}
	public MoodAnalyser(String message)
	{
		this.message = message;
	}
	public String analyseMood()
	{
		try
		{			
			if(message.length() == 0)
			{
				throw new NullPointerException();
			}
			else if(message.contains("Sad"))
			{
				return "SAD";
			}
			else
			{
				return "HAPPY";
			}
		}
		catch(NullPointerException e)
		{
			return "HAPPY";
		}	
	}
}
