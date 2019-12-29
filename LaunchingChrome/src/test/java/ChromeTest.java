import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	@Test
	public void chromeLaunchTest()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}

}
