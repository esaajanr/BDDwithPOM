package qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		try {
		prop = new Properties();
		FileInputStream fIn = new FileInputStream("C:\\Selenium\\Selenium_Workspace\\BDDwithPOM\\"
				+ "src\\main\\java\\qa\\config\\config.properties");
		prop = new Properties();
		prop.load(fIn);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		String browser = prop.getProperty("browser");
		
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.safari.driver", "C:\\Selenium\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver();
		} 
//		e_driver = new EventFiringWebDriver(driver);
//		// Now create object of EventListerHandler to register it with EventFiringWebDriver
//		eventListener = new WebEventListener();
//		e_driver.register(eventListener);
//		driver = e_driver;
//		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		
		}
	
	
}
