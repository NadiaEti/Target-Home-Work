package target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target {
    public static void main(String[] args) {
        String driverPath = "../Day_41_Automation/BrowserDriver/Windows/chromedriver.exe";


        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Soda");
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[6]/form/button")).click();

        String actualText = driver.findElement(By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div/div[2]/div/div[1]/div[1]/div/div/li[1]/a/div/div[1]/div/div/picture/img")).getText();
        System.out.println("Actual Text " +actualText);

        //String expectedText=""



    }
}
