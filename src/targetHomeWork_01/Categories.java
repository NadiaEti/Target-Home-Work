package targetHomeWork_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Categories {
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
    public static void testTargetCategories() throws InterruptedException {
        //click on Categories
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[2]/a")).click();
        //click on View Store Directory
        //driver.findElement(By.cssSelector("#__next > div.l-container-fixed > a")).click();

        Thread.sleep(3000);

        //Verify SignIn
        String expectedText = "All Categories";
        String actualText = driver.findElement(By.xpath("//*[@id=\"overlay-3\"]/div/div/div/div[1]/span/h3")).getText();
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, "Categories are not successful");
        Thread.sleep(2000);

        driver.close();
    }
    @Test//pass
    public static void testTargetGroceryCategories() throws InterruptedException {
        //click on Categories
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"overlay-3\"]/div[1]/div/div/a[2]")).click();
        //click on View Store Directory
        //driver.findElement(By.xpath("//*[@id=\"overlay-4\"]/div/div/div/a[2]/div/span")).click();

        //Verify SignIn
        String expectedText = "Grocery";
        String actualText = driver.findElement(By.xpath("//*[@id=\"overlay-3\"]/div/div/div[1]/span")).getText();
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, "Groceries are not successful");

        Thread.sleep(5000);
        driver.close();
    }
}
