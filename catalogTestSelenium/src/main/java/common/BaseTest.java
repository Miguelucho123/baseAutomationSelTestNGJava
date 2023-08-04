package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    protected WebDriver driver;
    private final String URL ="https://www.nuskin.com/us/en/catalog/180_system";

    @BeforeMethod
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
