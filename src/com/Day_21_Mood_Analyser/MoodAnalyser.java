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
	public String analyseMood() throws MoodAnalysisException
	{
		try
		{			
			if(message.length() == 0)
			{
				throw new MoodAnalysisException("Message can't be Empty");
			}
			else if(message.contains("Sad"))
			{
				return "SAD";
			}
			else if(message == null)
			{
				throw new MoodAnalysisException("Message can't be Null");
			}
			else
			{
				return "HAPPY";
			}
		}
		catch(NullPointerException npe)
		{
			throw new MoodAnalysisException("Message can't be Null");
		}	
		catch(Exception e)
		{
			throw new MoodAnalysisException("Message can't be Empty");
		}
	}
}
