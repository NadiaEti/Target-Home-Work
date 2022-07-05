package targetHomeWork_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistryForm {
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
    public static void testGetRegistryFormForRegistryCustomer() throws InterruptedException {
        //click on registry form for registry customer
        driver.findElement(By.id("utilityNav-registries")).click();
        Thread.sleep(3000);

          //Verify Registry Form

        String expectedText = "Celebrate any milestone";
        String actualText = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/h2")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, " Celebrate any milestone not helpful");
        Thread.sleep(3000);
        driver.close();
    }
    @Test//pass
    public static void testGetRegistryFormForWedding() throws InterruptedException {
        //click on registry form for registry customer
        driver.findElement(By.id("utilityNav-registries")).click();
        Thread.sleep(2000);

        //click create wedding registry
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div/div[2]/div[2]/button")).click();
        Thread.sleep(2000);

        //Verify Registry Form For Wedding

        String expectedText = "Get ready to build your new life together.";
        String actualText = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/div[2]/div[2]")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, " Wedding registry is not helpful");
        Thread.sleep(3000);
        driver.close();


    }
}
