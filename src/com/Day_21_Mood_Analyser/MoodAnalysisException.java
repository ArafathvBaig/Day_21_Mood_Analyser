package com.Day_21_Mood_Analyser;

public class MoodAnalysisException extends Exception
{
	public String message;
	public MoodAnalysisException(String message)
	{
		if(message.contains("Null"))
		{
			this.message = ExceptionType.NULL_MESSAGE + ": " +message;
		}
		else
		{
			this.message = ExceptionType.EMPTY_MESSAGE + ": " +message;
		}
	}
	public String getMessage()
	{
		return message;
	}
}
