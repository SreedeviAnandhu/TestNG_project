package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Practice extends Base{
	
	@Test
	public void alert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		alert.click();
		
		driver.switchTo().alert().accept();
		
	}
	
	@Test
	public void alert2()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement alertt = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertt.click();
		driver.switchTo().alert().sendKeys("Sreedevi");
		driver.switchTo().alert().accept();
	}

}
