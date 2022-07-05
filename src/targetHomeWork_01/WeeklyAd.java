package targetHomeWork_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WeeklyAd {
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
    public static void testGetWeeklyAdForCustomer() throws InterruptedException {
        //click on Weekly Ad customer
        driver.findElement(By.id("utilityNav-weeklyAd")).click();

        Thread.sleep(2000);

        String expectedText = "Weekly Ads & Catalogs";
        String actualText = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/section/div/div/div/section/div[1]/div[1]")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        Thread.sleep(5000);

        Assert.assertEquals(actualText, expectedText, " Weekly Ads not helpful");
        Thread.sleep(3000);
        driver.close();
    }

    @Test   //Pass
    public static void testGetViewWeeklyAdForCustomer() throws InterruptedException {
        //click on Weekly Ad customer
        driver.findElement(By.id("utilityNav-weeklyAd")).click();
        //click on View Weekly Ad customer
        driver.findElement(By.id("signUpForReminders")).click();
        Thread.sleep(2000);

        //Verify
//        String expectedText = "Prices Valid Jun 26 - Jul 2";
//        String actualText = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/span")).getText();
//        Thread.sleep(2000);
//        System.out.println("Actual Text : " + actualText);
//        Thread.sleep(5000);
//        Assert.assertEquals(actualText, expectedText, " Weekly Ads not helpful");
//
//        Thread.sleep(3000);
        driver.close();


    }

}
