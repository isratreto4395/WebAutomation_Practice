package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCodes {

    public static void main(String[] args) throws InterruptedException {
        String amazonUrl = "https://www.amazon.com";
        String productname = "Mask";
        String searchBoxLocator = "twotabsearchtextbox";
        String seachButtonLocator = "nav-search-submit-button";

        String chromeDriverPath ="BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(amazonUrl);
        driver.manage().window().fullscreen();
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productname);
        driver.findElement(By.id(seachButtonLocator)).click();
        Thread.sleep(5000);
        driver.close();

    }
}

