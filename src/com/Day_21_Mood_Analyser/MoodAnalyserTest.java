package com.Day_21_Mood_Analyser;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void testTheMessageAndReturnTheMood() 
	{
		MoodAnalyser ms = new MoodAnalyser();
		String mood = ms.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD",mood);
	}
	@Test
	void testTheMessageAndReturnTheMood1() 
	{
		MoodAnalyser ms = new MoodAnalyser();
		String mood = ms.analyseMood("I am in Any Mood");
		Assert.assertEquals("HAPPY",mood);
	}

}
