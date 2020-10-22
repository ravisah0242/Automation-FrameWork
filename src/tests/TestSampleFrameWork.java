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

}
