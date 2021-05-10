import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void test(){

        System.setProperty("webdriver.chrome.driver", "/home/seshl/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.99-bottles-of-beer.net/");
        driver.close();
    }

}
