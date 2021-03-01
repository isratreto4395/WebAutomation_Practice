package amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageNotes {
    public static void main(String[] args) throws InterruptedException {

//        //firefox browser
//        String fireFoxDriverPath ="BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",fireFoxDriverPath);
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get("https://www.amazon.com/");
//
//        //edge browser
//        String edgeDriverPath ="BrowserDriver/windows/msedgedriver.exe";
//        System.setProperty("webdriver.edge.driver",edgeDriverPath);
//        WebDriver driver2 = new EdgeDriver();
//        driver2.get("https://www.amazon.com/");

        //chrome browser
        String chromeDriverPath ="BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().fullscreen(); //make the chrome driver full screen
        //driver.manage().deleteAllCookies();// it will delete all the cookies

        //automate by id
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("masks");// this is copied from amazon--> right click on amazon webpage, select the icon at the top left of inspect, then hover over the search box, and see the code in the inspect section adnd copy the id
       //findElement() is going to search teh element i have selected in inspect--> i wanted the code of the search box
        //sendKeys() used for entering the value--> example searching for masks
        //By.id because we copied the id code in inspect

        //now its going to hit search and display results for maska
        driver.findElement(By.id("nav-search-submit-button")).click();

        //automate by class
        //driver.findElement(By.className())

        //automate by css selector
        //driver.findElement(By.cssSelector());

       //automate by xpath
        //driver.findElement(By.xpath());

        //automate by tagname
        //driver.findElement(By.tagname());

        // automate by name
        //driver.findElement(By.name());










        Thread.sleep(5000);// browser will wait 5 seconds after openning it
        driver.close();// it will close the driver
    }

}
