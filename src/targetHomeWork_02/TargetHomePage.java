package targetHomeWork_02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


//Action Method Class: All type of business action or behaviour to automate any test cases

public class TargetHomePage extends TestBase {

    static String actualText;
    /**
     * This method should verify " Target grocery of SearchBox functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetSearchBox() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user should be able to click on Target SearchBox
        driver.findElement(By.cssSelector("#search")).sendKeys("Diapers");
        Thread.sleep(2000);
        // user should be able to click on Search button
        driver.findElement(By.xpath("//button[@class='styles__SearchButton-sc-17dxxwu-24 hfLkTW']")).click();
        Thread.sleep(5000);
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-3)", "//span[text()='Huggies']");
        Thread.sleep(2000);
        //Verify SearchBox
        String expectedText = "351 results for “Diapers”";
        String actualText = driver.findElement(By.xpath("//h2[@class='Heading__StyledHeading-sc-1mp23s9-0 UABvu h-display-block h-margin-b-tiny']")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);

    }
    /**
     * This method should verify " Target Find Store Directory"
     *
     * @throws InterruptedException
     * Author: Nadia
     */
    public static void targetFindStoreDirectory() throws InterruptedException {
        //click on Find Store
        driver.findElement(By.cssSelector("#utilityNav-findStores")).click();
        //click on View Store Directory
        driver.findElement(By.cssSelector("#__next > div.l-container-fixed > a")).click();
        Thread.sleep(2000);
        // user should be able to click on Target Target Stores in the U.S.
        driver.findElement(By.xpath("//h2[text()='Target Stores in the U.S.']")).click();
        Thread.sleep(2000);
        // user should be able to click on Target California store
        driver.findElement(By.xpath("//a[@href=\"/store-locator/store-directory/california\"]")).click();
        Thread.sleep(2000);
        //Verify Store Directory
        String expectedText = "Target Stores in California";
        String actualText = driver.findElement(By.xpath("//h1[@class='Heading__StyledHeading-sc-1mp23s9-0 czSHDm']")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Store Directory is not successfully found");
        Thread.sleep(5000);
        driver.close();
    }
    /**
     * This method should verify " Target Baby Deals functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */
    public static void targetBabyDeals() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user should be able to click on Target Get the deals
        driver.findElement(By.xpath("//*[text()='Get the deals']")).click();
        Thread.sleep(2000);
        // user should be able to click on Electronic Deals
        driver.findElement(By.xpath("//div[@class='styles__ItemTitle-sc-1y2pbia-0 hdxYEx' and text()='Electronic Deals']")).click();
        Thread.sleep(5000);
        // user should be able to click on Cell Phone & Accessory Deals
        driver.findElement(By.xpath("//*[text()='Cell Phone & Accessory Deals']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@href=\"/p/google-pixel-6-5g-unlocked-128gb/-/A-84683612?preselect=83607398#lnk=sametab\" and @class='Link__StyledLink-sc-4b9qcv-0 styles__StyledTitleLink-sc-h3r0um-1 csEnsr dAyBrL h-display-block h-text-bold h-text-bs']")).click();
        Thread.sleep(2000);
        //Verify Baby Deals
        String expectedText = "Google Pixel 6 5G Unlocked (128GB)";
        String actualText = driver.findElement(By.xpath("//span[text()='Google Pixel 6 5G Unlocked (128GB)']")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target grocery of Categories functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetGroceryCategories() throws InterruptedException {
        //click on Categories
        driver.findElement(By.xpath("//*[@id='headerPrimary']/div[2]/a")).click();
        Thread.sleep(3000);
        //user able to click on Target Grocery
        driver.findElement(By.xpath("//*[@id='overlay-3']/div[1]/div/div/a[2]")).click();
        //Verify Grocery Categories
        String expectedText = "Grocery";
        String actualText = driver.findElement(By.xpath("//*[@id='overlay-3']/div/div/div[1]/span")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Groceries are not successful");
        Thread.sleep(5000);
        driver.close();
    }

    /**
     * This method should verify " Target What's New functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetWhatsNew() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the What's New on Target Home page
        driver.findElement(By.xpath("//*[@class='styles__PrimaryHeaderWhatsNewLinkContainer-sc-17dxxwu-10 kuWocs']")).click();
        Thread.sleep(2000);
        // user should be able to click on Beauty New Arrivals (Inside What's New function)
        driver.findElement(By.xpath("//a[@href='/c/new-in-beauty/-/N-2jck6?lnk=NB_GDD']")).click();
        Thread.sleep(2000);
        //Verify What's New
        String expectedText = "New in Beauty";
        String actualText = driver.findElement(By.xpath("//*[@class='styles__HeadingContainer-sc-4tej7h-0 hVEHfS']")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target College Shop functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */
    public static void targetCollegeShop() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the What's New on Target Home page
        driver.findElement(By.xpath("//*[@class='styles__PrimaryHeaderWhatsNewLinkContainer-sc-17dxxwu-10 kuWocs']")).click();
        Thread.sleep(2000);
        // user should be able to click on Beauty New Arrivals (Inside What's New function)
        driver.findElement(By.xpath("//a[@href='/c/new-in-beauty/-/N-2jck6?lnk=NB_GDD']")).click();
        Thread.sleep(2000);
        // user should be able to click on College Shop
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'College Shop')]"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        Thread.sleep(2000);
        //Verify College Shop
        String expectedText = "New in Beauty";
        String actualText = driver.findElement(By.xpath("//*[@class='styles__HeadingContainer-sc-4tej7h-0 hVEHfS']")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target About Us functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetAboutUs() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user should be able to click on About us
        driver.findElement(By.xpath("//*[@class='Heading__StyledHeading-sc-1mp23s9-0 dQAmDk' and text()='About Us']")).click();
        Thread.sleep(2000);
        // user should be able to click on careers
        driver.findElement(By.xpath("//a[@href=\"https://corporate.target.com/careers/\"]")).click();
        Thread.sleep(2000);
        // user should be able to click on Corporate Careers
        driver.findElement(By.xpath("//a[@href=\"/careers/corporate\"]")).click();
        //Verify About Us
        String expectedText = "Corporate Careers";
        String actualText = driver.findElement(By.xpath("//h1[text()='Corporate Careers']")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target Top Deals functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */
    public static void targetTopDeals() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the What's New on Target Home page
        driver.findElement(By.xpath("//*[@class='styles__PrimaryHeaderWhatsNewLinkContainer-sc-17dxxwu-10 kuWocs']")).click();
        Thread.sleep(2000);
        // user should be able to click on Beauty New Arrivals (Inside What's New function)
        driver.findElement(By.xpath("//a[@href='/c/new-in-beauty/-/N-2jck6?lnk=NB_GDD']")).click();
        Thread.sleep(2000);
        // user should be able to click on Top Deals
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//span[text()='Top Deals']"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        Thread.sleep(2000);
        //Verify Top Deals
        String expectedText = "New in Beauty";
        String actualText = driver.findElement(By.xpath("//*[@class='styles__HeadingContainer-sc-4tej7h-0 hVEHfS']")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target Gift Ideas functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetGiftIdeas() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the What's New on Target Home page
        driver.findElement(By.xpath("//*[@class='styles__PrimaryHeaderWhatsNewLinkContainer-sc-17dxxwu-10 kuWocs']")).click();
        Thread.sleep(2000);
        // user should be able to click on Beauty New Arrivals (Inside What's New function)
        driver.findElement(By.xpath("//a[@href='/c/new-in-beauty/-/N-2jck6?lnk=NB_GDD']")).click();
        Thread.sleep(2000);
        // user should be able to click on Top Deals
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//span[text()='Gift Ideas']"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        Thread.sleep(2000);
        //Verify Gift Ideas
        String expectedText = "Gift Ideas";
        String actualText = driver.findElement(By.xpath("//span[text()='Gift Ideas']")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        Thread.sleep(2000);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target Stores functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetStores() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user should be able to click on Target Stores
        driver.findElement(By.xpath("//*[@class='Heading__StyledHeading-sc-1mp23s9-0 dQAmDk' and text()='Stores']")).click();
        Thread.sleep(2000);
        // user should be able to click on careers
        driver.findElement(By.xpath("//*[@class='CellSkinny__TextWrapper-sc-117d15w-0 bcbdds' and text()='Pharmacy']")).click();
        Thread.sleep(2000);
        //Verify Stores
        String expectedText = "Make the most of your next visit";
        String actualText = driver.findElement(By.xpath("//*[text()='Make the most of your next visit']")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target Help functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetHelpService() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user should be able to click on Target Help sector
        driver.findElement(By.xpath("//h3[text()='Help']")).click();
        Thread.sleep(2000);
        // user should be able to click on Security & Fraud
        driver.findElement(By.xpath("//span[text()='Security & Fraud']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"/security\"]")).click();
        Thread.sleep(2000);
        //Verify Help
        String expectedText = "Don't use passwords and switch to passphrases.";
        String actualText = driver.findElement(By.xpath("//h3[@class='sc-bdnxRM sc-gtsrHT evDpAt gfuSqG' and text()]")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target PickUp And Delivery functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetPickUpAndDelivery() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user should be able to click on Pickup & Delivery
        driver.findElement(By.xpath("//a[@href=\"/c/same-day-delivery/-/N-bswkz?l1_nid=5xt1a&lnk=SDDGlobal\"]")).click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//span[text()='Order Pickup']"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        Thread.sleep(2000);
        //Verify PickUp And Delivery
//        String expectedText = "Order Pickup";
//        String actualText = driver.findElement(By.xpath("//h1[@class='Heading__StyledHeading-sc-1mp23s9-0 bntaiI h-margin-t-tight' and text()='Order Pickup']")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "Test fail");
//        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target Deals functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetGetTheDeals() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user should be able to click on Target Get the deals
        driver.findElement(By.xpath("//*[text()='Get the deals']")).click();
        Thread.sleep(2000);
        // user should be able to click on Security & Fraud
        driver.findElement(By.xpath("//*[@class='styles__ItemTitle-sc-1y2pbia-0 hdxYEx' and text()='Baby Deals']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[ text()='Car Seat Deals']")).click();
        Thread.sleep(2000);
        //Verify Deals
        String expectedText = "All Deals : Car Seats";
        String actualText = driver.findElement(By.xpath("//div[@class='styles__HeadingContainer-sc-4tej7h-0 hVEHfS']")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }

    /**
     * This method should verify " Target Clearance functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetClearance() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user should be able to click on Target Get the deals
        driver.findElement(By.xpath("//span[text()='Clearance']")).click();
        Thread.sleep(2000);
        // user should be able to click on Shoes Clearance
        driver.findElement(By.xpath("//div[text()='Shoes Clearance']")).click();
        Thread.sleep(5000);
        // user should be able to click on Department
        driver.findElement(By.xpath("//button[@class='BaseButton-sc-3v3oog-0 styles__PillStyledButton-sc-1mpm9rk-2 xuSzc iXqAKG' and text()='Department']")).click();
        Thread.sleep(2000);
        //Verify Clearance
        String expectedText = "Clothing, Shoes & Accessories";
        String actualText = driver.findElement(By.xpath("//*[@class='styles__FacetModalSelection-sc-1tporm4-1 htwTEm' and text()='Clothing, Shoes & Accessories' ]")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
  }
    /**
     * This method should verify " Target Services functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetServices() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // user should be able to click on Target Services
        js.executeScript("window.scrollBy(0,-30)", "//h3[text()='Services']");
        Thread.sleep(2000);
        // user should be able to click on Registry
        driver.findElement(By.xpath("//span[text()='Registry']")).click();
        Thread.sleep(2000);
        // user should be able to click on Create a wedding registry
        driver.findElement(By.xpath("//button[text()='Create a wedding registry']")).click();
        Thread.sleep(2000);
        //Verify Services
        String expectedText = "Wedding registry";
        String actualText = driver.findElement(By.xpath("//h1[@class='Heading__StyledHeading-sc-1mp23s9-0 styles__CustomHeading-sc-4vl928-4 doIbuH jhAqJF h-text-center']")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target Top Deals For Customer functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void getTopDealsForCustomer() throws InterruptedException {
        //click on Deals for customer
        driver.findElement(By.xpath("//*[@id='headerPrimary']/div[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='overlay-8']/ul/li[1]/a/div/span")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[text()='Home Deals']")).click();
        Thread.sleep(2000);
        //Verify Top Deals For Customer
        String expectedText = "Shop by category";
        String actualText = driver.findElement(By.xpath("//h2[@class='Heading__StyledHeading-sc-1mp23s9-0 styles__StyledHeading-sc-1tk9lto-5 kmgmYA gXcsHq' and text()='Shop by category']")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Top Deals are not successful");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target View Store Coronavirus Update functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void viewStoreCoronavirusUpdate() throws InterruptedException {
        //click on Find Store
        driver.findElement(By.cssSelector("#utilityNav-findStores")).click();
        Thread.sleep(2000);
        //click on privacy policy
        driver.findElement(By.xpath("//*[@id='__next']/div[3]/section/div/div/div/a")).click();
        Thread.sleep(2000);
        //Verify View Store Coronavirus Update
        String expectedText = "Target's Coronavirus Response";
        String actualText = driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/section[1]/div/h1")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Coronavirus Update not successful");
        Thread.sleep(5000);
    }
    /**
     * This method should verify " Target Weekly Ad For Customer functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetWeeklyAdForCustomer() throws InterruptedException {
        //click on Weekly Ad customer
        driver.findElement(By.cssSelector("#utilityNav-weeklyAd")).click();
        Thread.sleep(2000);
        // user able to click on View the Weekly Ad
        driver.findElement(By.xpath("//button[text()='View the Weekly Ad']")).click();
        Thread.sleep(2000);
        // user able to click on View by Category
        driver.findElement(By.xpath("//a[@href=\"/categories?code=Target-20220703\"]")).click();
        Thread.sleep(2000);
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-30)", "#link-5118571");
        Thread.sleep(2000);
        //Verify Weekly Ad For Customer
        String expectedText = "shop weekly ad categories";
        String actualText = driver.findElement(By.xpath("//h2[text()='shop weekly ad categories']")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        Thread.sleep(5000);
        Assert.assertEquals(actualText, expectedText, " Test fail");
        Thread.sleep(3000);
    }
    /**
     * This method should verify " Target Circle functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void getTargetCircle() throws InterruptedException {
        //click on Target Circle
        driver.findElement(By.cssSelector("#utilityNav-circle")).click();
        Thread.sleep(2000);
        // user able to click on gift Cards
        driver.findElement(By.cssSelector("#utilityNav-giftCards")).click();
        Thread.sleep(2000);
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-30)", "//h3[text()='Specialty Gift Cards']");
        Thread.sleep(2000);
        //Verify Target Circle
        String expectedText = "Student-special gift cards";
        String actualText = driver.findElement(By.xpath("//h2[text()='Student-special gift cards']")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        Thread.sleep(5000);
        Assert.assertEquals(actualText, expectedText, " test fail");
        Thread.sleep(3000);
    }
    /**
     * This method should verify " Target Health Deals functionality checking"
     *
     * @throws InterruptedException
     * Author: Nadia
     */

    public static void targetHealthDeals() throws InterruptedException {
        //Given user on Target Home page
        Thread.sleep(2000);
        // user should be able to click on Target Get the deals
        driver.findElement(By.xpath("//*[text()='Get the deals']")).click();
        Thread.sleep(2000);
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-300)", "//span[text()='Health Deals']");
        Thread.sleep(2000);
        //Verify Clothing Deals
        String expectedText = "Top Deals";
        String actualText = driver.findElement(By.xpath("//h1[@class='Heading__StyledHeading-sc-1mp23s9-0 kmgmYA' and text()='Top Deals']")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Test fail");
        Thread.sleep(5000);
    }
}










