package generic_scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements frame_constants
{
	public static WebDriver driver;
	
	@BeforeMethod
	public static void openappln()
	{
		System.setProperty(gecko_KEY, gecko_value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, Ti.SECONDS);
		driver.get(url);
		
	}
	@AfterMethod
	public static void closeappln(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus());
		{
			generic_screnshot.getphoto(driver);
		}
		driver.close();
	}

}
