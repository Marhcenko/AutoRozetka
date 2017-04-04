package pages;

import StartTest.SetUpTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by SHYRIK on 02.04.2017.
 */
public class PageAswer extends SetUpTest {
    WebDriver driver;
    HomePageTopBanner homePage;

    public PageAswer(WebDriver driver) {
        this.driver = driver;
    }

    By TitlePageXpath =  By.xpath("//header[@class=\"title-page\"]");

    public String titlePage(){
        String stringTitle  = driver.findElement(TitlePageXpath).getText();
        return stringTitle;
    }
}
