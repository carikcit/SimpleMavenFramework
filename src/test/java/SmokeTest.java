import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SmokeTest {
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty( "webdriver.chrome.driver", "/Users/tahs/Selenium/ChromeDriver/chromedriver" );
        driver = new ChromeDriver();
    }
    @AfterClass
    public void quit(){
        driver.quit();
    }

    @Test
    public void test(){
        driver.get( "https://google.com" );
    }

}
