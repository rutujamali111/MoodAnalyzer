package moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModdAnalyzerTest {

	@Test
	public void givenMessgae_WhenSad_ShouldReturn_Sad() {
		MoodAnalyzer ma=new MoodAnalyzer("This is a Sad Message");
		String result=ma.analyseMood();
		assertEquals("SAD", result);
		
	}
	
	public void givenMessgae_WhenHappy_ShouldReturn_Happy() {
		MoodAnalyzer ma=new MoodAnalyzer("This is a Happy Message");
		String result=ma.analyseMood();
		assertEquals("HAPPY", result);
	}
	
	public void givenMessgae_WhenNull_ShouldReturn_Happy() {
		MoodAnalyzer ma=new MoodAnalyzer(null);
		String result=ma.analyseMood();
		assertEquals("HAPPY", result);
	}

}
