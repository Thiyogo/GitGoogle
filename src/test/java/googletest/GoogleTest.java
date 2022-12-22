package googletest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class GoogleTest {

	@Test
	public void testgoogle() throws IOException {
	
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://www.google.com/");
			wd.findElement(By.name("q")).sendKeys("Chennai");
			wd.findElement(By.name("q")).submit();
			
			File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("C:\\Users\\ADMIN\\eclipse-workspace\\J1_GitTest1\\Output/Google.png"));
	}
}
