package targetHomeWork_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchBox {
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
    public static void testSearchBoxWithValidProductName() throws InterruptedException {
        //enter the valid product name on searchBox field
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("coca cola");
        //click on search button
        driver.findElement(By.cssSelector("#headerPrimary > div.styles__SearchWrapper-sc-17lf5y-0.iYGRXd > form > button")).click();
        Thread.sleep(2000);

        //Verify Registry Form For Wedding

//        String expectedText = "Price”";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div/div[2]/div/div[1]/div/div[2]/div/div[2]/button")).getText();
//        Thread.sleep(2000);
//        System.out.println("Actual Text : " + actualText);
//
//        Assert.assertEquals(actualText, expectedText, " Wedding registry is not helpful");
//        Thread.sleep(3000);
//        driver.close();
    }
    @Test   //pass
    public static void testSearchBoxWithInvalidProductName() throws InterruptedException {
        //enter the valid product name on searchBox field
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Saba");
        //click on search button
        driver.findElement(By.cssSelector("#headerPrimary > div.styles__SearchWrapper-sc-17lf5y-0.iYGRXd > form > button")).click();
        Thread.sleep(5000);
        driver.close();
    }
    }


