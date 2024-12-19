package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends Base {
	
	@Test
	public void javaScriptExecutor()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; //typecasting
		
		WebElement web = driver.findElement(By.id("single-input-field"));
		js.executeScript("arguments[0].value='Sree';",web);
		
		WebElement button = driver.findElement(By.xpath("//button[@id='button-one']"));
		js.executeScript("arguments[0].click();",button);
		
	}
	
	@Test
	public void javaScriptScroll()
	{
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)","");
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
	}

}
