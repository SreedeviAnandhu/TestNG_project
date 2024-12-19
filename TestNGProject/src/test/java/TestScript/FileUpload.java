package TestScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends Base{
	
	@Test
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		WebElement web =driver.findElement(By.xpath("//input[@id='file-upload']"));
		web.sendKeys("C:\\Users\\91799\\OneDrive\\Documents\\Abstraction.pdf"); //path of a pdf file to upload
				
		WebElement ele =driver.findElement(By.xpath("//input[@id='file-submit']"));
		ele.click();
	}
	
	@Test
	public void fileUploadUsingRobotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		
		WebElement val = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		val.click();
		
		StringSelection select = new StringSelection("C:\\Users\\91799\\OneDrive\\Documents\\Abstraction.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
		
		Robot robot = new Robot(); //keyboard actions perform chyan
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER); 	}

}
