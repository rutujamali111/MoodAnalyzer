package moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import exception.MoodAnalysisException;

public class ModdAnalyzerTest {

	@Test
	public void givenMessgae_WhenSad_ShouldReturn_Sad()
	{
		MoodAnalyzer ma=new MoodAnalyzer("This is a Sad Message");
		String result;
		try {
			result=ma.analyseMood();
			assertEquals("SAD", result);			
		}catch (MoodAnalysisException e) {
        }
		
		
	}
	
	public void givenMessgae_WhenHappy_ShouldReturn_Happy() {
		MoodAnalyzer ma=new MoodAnalyzer("This is a Happy Message");
		String result;
		try {
			result=ma.analyseMood();
			assertEquals("HAPPY", result);			
		}catch (MoodAnalysisException e) {
        }
	}
	
	public void givenMessgae_WhenNull_ShouldReturn_Happy() {
		MoodAnalyzer ma=new MoodAnalyzer(null);
		String result;
		try {
			ExpectedException exceptionrule=ExpectedException.none();
			 exceptionrule.expect(MoodAnalysisException.class);
			result=ma.analyseMood();
			assertEquals("HAPPY", result);			
		}catch (MoodAnalysisException e) {
			e.printStackTrace();
        }
	}
	
	@Test
	public void givenNullMood_ShouldThrow_Exception()
	{
		MoodAnalyzer ma=new MoodAnalyzer(null);
		try {
			ma.analyseMood();
		}catch(MoodAnalysisException e)
		{
			assertEquals(MoodAnalysisException.exceptionType.ENTERED_NULL, e.type);
		}
	}
	

}
