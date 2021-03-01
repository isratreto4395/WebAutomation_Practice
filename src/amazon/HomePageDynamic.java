package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageDynamic {
    WebDriver driver = null;
    String amazonUrl = "https://www.amazon.com";
    String productname = "Mask";
    String searchBoxLocator = "twotabsearchtextbox";
    String seachButtonLocator = "nav-search-submit-button";


    @BeforeMethod
    public void setUP(){
        String chromeDriverPath ="BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(amazonUrl);
        driver.manage().window().maximize();
    }

    @Test

    public void testCheckSearchBox(){
        checkSearchBox();
        String ex
    }
    @Test
    public void checkSearchBox(){
        //Enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productname);
        // click on search button
        driver.findElement(By.id(seachButtonLocator)).click();
    }


    @AfterMethod
    public void tearDown(){
        //driver.close();
        driver.quit();
    }
}
