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
		if(message == "I am in Sad Mood")
		{
			return "SAD";
		}
		else if(message.length() == 0)
		{
			return "SAD";
		}
		else
		{
			return "HAPPY";
		}
	}
}
