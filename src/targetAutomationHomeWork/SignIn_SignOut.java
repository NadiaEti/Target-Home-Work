package targetAutomationHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignIn_SignOut {
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
    @Test
    public static void testSignIn() throws InterruptedException {
         // Click on SignIn
       driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/a[4]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"listaccountNav-signIn\"]/a/span")).click();
        Thread.sleep(2000);
        // Enter email/ phoneNumber
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("nadiaeti67@gmail.com");
        // Enter password
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Nadiaaa7");
        Thread.sleep(2000);
        // Click on check box in keep me sign in button
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[1]/div/div[2]/form/div[3]/label/div")).click();

        Thread.sleep(3000);
        // Click SignIn Button
        driver.findElement(By.cssSelector("#login")).click();
        Thread.sleep(5000);
        driver.close();

        //Verify SignIn
//        String expectedText = "Sorry, something went wrong. Please try again.";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/a[4]/span")).getText();
//        Thread.sleep(2000);
//        System.out.println("Actual Text : " + actualText);
//
//        Assert.assertEquals(actualText, expectedText, "SignIn not successful");
//        Thread.sleep(5000);
//        driver.close();


    }
    @Test
    public static void testSignInUsingInvalidCredential() throws InterruptedException {
        // Click on SignIn
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/a[4]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"listaccountNav-signIn\"]/a/span")).click();
        Thread.sleep(2000);
        // Enter email/ phoneNumber
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("nadiaeti67@gmail.com");
        // Enter password
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Nadia");
        Thread.sleep(3000);

        // Verify successful login
        String expectedText = "Please enter a valid password";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"password--ErrorMessage\"]")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);

        Assert.assertEquals(actualText, expectedText, "SignIn not successful");
        Thread.sleep(5000);
        driver.close();


    }
}
