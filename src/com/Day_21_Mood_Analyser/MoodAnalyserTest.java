package com.Day_21_Mood_Analyser;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void testTheMessageAndReturnTheMood() 
	{
		MoodAnalyser ms = new MoodAnalyser("I am in Sad Mood");
		String mood = ms.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	@Test
	void testTheMessageAndReturnTheMood1() 
	{
		MoodAnalyser ms = new MoodAnalyser("");
		String mood = ms.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	@Test
	void testTheMessageAndReturnTheMood2() 
	{
		MoodAnalyser ms = new MoodAnalyser("I am in Any Mood");
		String mood = ms.analyseMood();
		Assert.assertEquals("HAPPY",mood);
	}
}
