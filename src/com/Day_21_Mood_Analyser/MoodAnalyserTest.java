package com.Day_21_Mood_Analyser;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void testTheMessageAndReturnTheMoodNullCase() 
	{
		try
		{
			MoodAnalyser ms = new MoodAnalyser(null);
			ms.analyseMood();
		}
		catch(MoodAnalysisException mae)
		{
			Assert.assertEquals("NULL_MESSAGE: Message can't be Null",mae.getMessage());
		}
		
	}
	@Test
	void testTheMessageAndReturnTheMoodEmptyCase() 
	{
		try
		{
			MoodAnalyser ms = new MoodAnalyser("");
			ms.analyseMood();
		}
		catch(MoodAnalysisException mae)
		{
			Assert.assertEquals("EMPTY_MESSAGE: Message can't be Empty",mae.getMessage());
		}
		
	}
}
