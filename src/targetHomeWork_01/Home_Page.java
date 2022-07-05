package targetHomeWork_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home_Page {


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
    public static void testTargetLogo() throws InterruptedException {
        //Target Header with Target Logo
        driver.findElement(By.cssSelector("#headerPrimary > a.Link__StyledLink-sc-4b9qcv-0.styles__LogoLinkDesktop-sc-17dxxwu-2.gCNFxQ.llakbT > span > div > svg")).click();
        Thread.sleep(2000);

        String expectedText = "Get the deals”";
        String actualText = driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[2]/div/div/div/div/a/div[2]/div/button")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, " Wedding registry is not helpful");
        Thread.sleep(3000);
        driver.close();
    }


    @Test//fail
        public static void testMoreSizzlingDeals() throws InterruptedException {
        //Target features
        driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[7]/div/div[1]")).click();
        Thread.sleep(5000);
        //Verify
        String expectedText = "88 items”";
        String actualText = driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div[2]/h2")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, " Wedding registry is not helpful");
        Thread.sleep(3000);
        driver.close();
    }

        }




