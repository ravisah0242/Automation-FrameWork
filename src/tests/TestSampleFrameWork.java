package tests;

import java.io.IOException;
import org.testng.annotations.Test;
import generics.BaseTest;
import pages.SampleFrameWorkPage;

public class TestSampleFrameWork extends BaseTest
{
	
	
	@Test
	public void submit() throws IOException
	{
		SampleFrameWorkPage sample=new SampleFrameWorkPage(driver);
		sample.submitDetaild();
	}

	@Test // (invocationCount=2,priority=2)
	public void after()
	{
		System.out.println("67.	Can we develop more than one test methods in a single test class");
	}
}
