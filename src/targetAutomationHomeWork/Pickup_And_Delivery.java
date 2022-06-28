package targetAutomationHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pickup_And_Delivery {


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
    public static void testTargetPickupAndDelivery() throws InterruptedException {
        // Click on dropdown menu on “Pickup and Delivery
        driver.findElement(By.cssSelector("#headerPrimary > div.styles__PrimaryHeaderPickupAndDeliveryLinkContainer-sc-17dxxwu-11.kBOpSD > a")).click();
        Thread.sleep(2000);

        //Verify pickup and delivery
        String expectedText = "Same Day Delivery";
        String actualText = driver.findElement(By.cssSelector("#overlay-12 > ul > li:nth-child(3) > a > div")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, " Same Day Delivery Update not successful");
        Thread.sleep(3000);
        driver.close();
    }
    @Test   //pass
    public static void testTargetOrderPickup() throws InterruptedException {
        // Click on dropdown menu on “Pickup and Delivery
        driver.findElement(By.cssSelector("#headerPrimary > div.styles__PrimaryHeaderPickupAndDeliveryLinkContainer-sc-17dxxwu-11.kBOpSD > a")).click();
        Thread.sleep(2000);
        // Click on Order Pickup
        driver.findElement(By.xpath("//*[@id=\"overlay-12\"]/ul/li[1]/a/div/span")).click();
        Thread.sleep(3000);

        //Verify Order pickup
        String expectedText = "My Categories";
        String actualText = driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[2]/div[1]/div[1]/div/button[1]/div")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, "My Categories not successful");
        Thread.sleep(5000);
        driver.close();
    }
}