package targetAutomationHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindStoreDirectory {
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
    public static void testToFindStoreDirectory() throws InterruptedException {
        //click on Find Store
        driver.findElement(By.id("utilityNav-findStores")).click();
        //click on View Store Directory
        driver.findElement(By.cssSelector("#__next > div.l-container-fixed > a")).click();
        Thread.sleep(2000);

        //Verify SignIn
        String expectedText = "Store Directory";
        String actualText = driver.findElement(By.cssSelector("#__next > div.h-margin-a-default > div.h-text-center > div > span:nth-child(3)")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, "Store Directory is not successfully found");
        Thread.sleep(5000);
        driver.close();
    }
    @Test//pass
    public static void testToViewStoreCoronavirusUpdate() throws InterruptedException {
        //click on Find Store
        driver.findElement(By.id("utilityNav-findStores")).click();
        //click on privacy policy
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/section/div/div/div/a")).click();
        Thread.sleep(2000);

        //Verify SignIn
        String expectedText = "Target's Coronavirus Response";
        String actualText = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[3]/section[1]/div/h1")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, "Coronavirus Update not successful");
        Thread.sleep(5000);
        driver.close();
    }
}
