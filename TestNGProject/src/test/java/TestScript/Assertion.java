package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base{
	
	@Test
	public void assertEquals()
	{
		driver.navigate().to("https://www.browserstack.com/");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualtitle,expectedtitle);
	}
	
	@Test
	public void assertNotEquals() //actual and expected same aakan paadila(same aanengil error kanikum)
	{
		driver.navigate().to("https://www.browserstack.com/");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertNotEquals(actualtitle,expectedtitle);
	}
	
	@Test
	public void assertTrue() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifiedtitle = driver.getTitle().equalsIgnoreCase("most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertTrue(verifiedtitle);
	}
	@Test
	public void assertFalse() { //same allengil pass aakum
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifiedtitle = driver.getTitle().equalsIgnoreCase("most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertFalse(verifiedtitle);
}
}
