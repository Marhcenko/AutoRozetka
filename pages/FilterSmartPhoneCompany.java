package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by SHYRIK on 03.04.2017.
 */
public class FilterSmartPhoneCompany {
    WebDriver driver;

    public FilterSmartPhoneCompany(WebDriver driver) {
        this.driver = driver;
    }
    By MainElementFristXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[1]/a[2]/span[2]");
    By FillterCompanyXpath = By.xpath("//*[@id=\"filter69\"]");
    By ListIpnoneXpath = By.xpath("//div[@class=\"g-i-tile g-i-tile-catalog\"]/div/div/div/div/div[@class=\"g-i-tile-i-title clearfix\"]");

    public void FirstElementPhone() throws InterruptedException {
        driver.findElement(MainElementFristXpath).click();
        filterClick();
        Thread.sleep(1000);
        List<WebElement> list = driver.findElements(ListIpnoneXpath);
        for(int i = 0; i < list.size();i++){
            String value = list.get(i).getText();
            System.out.println(value);
//            value.contains("Apple");

        }
        driver.navigate().back();
    }
    public void filterClick(){
        driver.findElement(FillterCompanyXpath).click();
    }
}
