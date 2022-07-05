package targetHomeWork_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Deals {
    static WebDriver driver;
    String browserName = "chrome";
    static String url = "https://www.target.com/";
    static String actualText;

    @BeforeTest
    public void setUpAutomation() {
        System.out.println("***************** Automation Started *******************");
    }

    @AfterTest
    public void tearDownAutomation() {
        System.out.println("***************** Automation End *******************");
    }
    @BeforeTest
    public static void setUpChromeBrowser() {
        String chromeDriverPath = "../Day_41_Automation/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();

        //  navigate to target.com
        driver.get(url);
        driver.manage().window().maximize();

    }
    @Test   //pass
    public static void testGetDealsForCustomer() throws InterruptedException {
        //click on Deals for customer
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[3]/a")).click();
        Thread.sleep(2000);

        //Verify SignIn
        String expectedText = "Clearance";
        String actualText = driver.findElement(By.xpath("//*[@id=\"overlay-8\"]/ul/li[4]/a/div")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, "Groceries are not successful");
        Thread.sleep(5000);
        driver.close();
    }
    @Test   //pass
    public static void testGetTopDealsForCustomer() throws InterruptedException {
        //click on Deals for customer
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"overlay-8\"]/ul/li[1]/a/div/span")).click();
        Thread.sleep(2000);

        //Verify SignIn
        String expectedText = "Toy Deals";
        String actualText = driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[3]/div/div/div/div/div/div[4]/a/div[2]")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, "Top Deals are not successful");
        Thread.sleep(5000);
        driver.close();
    }
}
