package targetHomeWork_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShoppingCart {

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
    public static void testShoppingCartFunctionality() throws InterruptedException {
        //Shopping Cart functionality should work
        //click on shopping cart
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/a[4]")).click();
        Thread.sleep(2000);
        //click on search button
        driver.findElement(By.cssSelector("#headerPrimary > div.styles__SearchWrapper-sc-17lf5y-0.iYGRXd > form > button")).click();

        //Verify pickup and delivery
        String expectedText = "Order summary";
        String actualText = driver.findElement(By.xpath("//*[@id=\"orderSummaryWrapperDiv\"]/div/div/div[1]/div/span/h2")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, " Same Day Delivery Update not successful");
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public static void testGetPromoCodeForRegistryCustomer() throws InterruptedException {
        //Shopping Cart functionality should work
        //click on shopping cart
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/a[4]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"listaccountNav-signIn\"]/a/span")).click();
        Thread.sleep(5000);
        // Enter email/ phoneNumber
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("nadiaeti67@gmail.com");
        // Enter password
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Na67");
        Thread.sleep(2000);
        // Click on check box in keep me sign in button
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[1]/div/div[2]/form/div[3]/label/div")).click();
        Thread.sleep(3000);
        // Click on keep me sign in button
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[1]/div/div[2]/form/div[3]/label/span[1]/span[1]")).click();
        Thread.sleep(3000);
        // Click SignIn Button
        driver.findElement(By.cssSelector("#login > span")).click();
        Thread.sleep(5000);
        driver.close();
    }
}




