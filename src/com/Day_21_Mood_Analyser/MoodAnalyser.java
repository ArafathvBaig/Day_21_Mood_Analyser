package com.Day_21_Mood_Analyser;

public class MoodAnalyser
{
	public String analyseMood(String message)
	{
		if(message == "I am in Sad Mood")
		{
			return "SAD";
		}
		else
		{
			return "HAPPY";
		}
	}
	public static void main(String[] args) 
	{
		MoodAnalyser ms = new MoodAnalyser();
		String mood = ms.analyseMood("I am in Sad Mood");
		System.out.println("Mood for Message is:: "+mood);
		String mood1 = ms.analyseMood("I am in Any Mood");
		System.out.println("Mood for Message is:: "+mood1);
	}
}
