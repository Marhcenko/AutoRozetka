package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by SHYRIK on 02.04.2017.
 */
public class MainSearch {
    WebDriver driver;
    String value;
    public MainSearch(WebDriver driver) {
        this.driver = driver;
    }
    By LinetoSearchXpath = By.xpath("//*[@id=\"rz-search\"]/form/div[1]/div[2]/input");
    By ButtonSearchXpath = By.xpath("//*[@id=\"rz-search\"]/form/span/span/button");
    By ChackSearchtitle = By.xpath("//*[@id=\"search_result_title_text\"]");


    public void ClickSearch(String value){
        this.value = value;
        driver.findElement(LinetoSearchXpath).sendKeys(value);
        ClickButtonSearch();
        Assert.assertEquals(ChackPageTitleSearch(),value);
        driver.navigate().back();
    }

    public void ClickButtonSearch(){
        driver.findElement(ButtonSearchXpath).click();
    }

    public String ChackPageTitleSearch(){
      String value =   driver.findElement(ChackSearchtitle).getText();
      return value;
    }
}
