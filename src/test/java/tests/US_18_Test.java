package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.US_18_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class US_18_Test extends TestBase {

    US_18_Page us_18_page = new US_18_Page();
    @BeforeMethod
    public void start(){
        Driver.getDriver().get(ConfigReader.getProperty("demoqa_url"));
    }


    @Test
    public void sliders(){

        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        //us_18_page.wigdedsCard.click();
        //ReusableMethods.waitFor(2);
        //us_18_page.slider.click();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        JavascriptExecutor cse = (JavascriptExecutor) Driver.getDriver();





}
}