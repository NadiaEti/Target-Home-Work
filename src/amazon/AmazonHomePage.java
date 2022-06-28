package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonHomePage {

public static void main(String[] args) throws InterruptedException {

    // Driver Location
String chromeDriverPath = "../Day_41_Automation/BrowserDriver/Windows/chromedriver.exe";

//WebDriver is a interface
// ChromeDriver is a class
// Create an instance which will help us to create a Driver

        System.setProperty("webdriver.chrome.driver",chromeDriverPath);


        // Open chrome browser
       WebDriver driver = new ChromeDriver();


        //Navigate to amazon.com
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();    //For maximize website

        //enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");

        //click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

        //Verify searched product
        String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text : "+ actualText);

        String expectedText="\"iPhone 14\"";
        System.out.println("Expected Text : "+ expectedText);

        if (actualText.equals(expectedText)){
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Fail");
        }


        String actualProductName=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
        String expectedProductName="Apple iPhone 12 Pro, 128GB, Pacific Blue - Fully Unlocked (Renewed)";

        if (actualProductName.equals(expectedProductName)){
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Fail");
        }

        Thread.sleep(5000);

        driver.close();

    }
}
