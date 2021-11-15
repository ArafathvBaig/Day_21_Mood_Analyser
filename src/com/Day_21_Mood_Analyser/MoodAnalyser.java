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
			if(message.contains("Sad"))
			{
				return "SAD";
			}
			else if(message.length() == 0)
			{
				return "Happy";
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception ::".toString());
		}
		return "SAD";		
	}
}
