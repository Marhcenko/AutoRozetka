package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by SHYRIK on 03.04.2017.
 */
public class SmartPhoneColor {
    WebDriver driver;
    public SmartPhoneColor(WebDriver driver) {
        this.driver = driver;
    }
    By MainElementFristXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[1]/a[2]/span[2]");
    By PhoneColorBotton = By.xpath("//*[@id=\"filter20371\"]");
    By ListColorXpath = By.xpath("//div[@class=\"g-i-tile g-i-tile-catalog\"]/div/div/div/div/div[@class=\"g-i-tile-i-title clearfix\"]");

    public void ClickFirstPhoneMain() throws InterruptedException {
        driver.findElement(MainElementFristXpath).click();
        ClickPhoneColorFilter();
        Thread.sleep(1000);
        List<WebElement> elementList =  driver.findElements(ListColorXpath);

        for(int i = 0; i < elementList.size();i++){
            String result = elementList.get(i).getText();
            System.out.println(result);
//            result.contains("Black");
        }
        System.out.println("  ");
        driver.navigate().back();
    }
    public void ClickPhoneColorFilter(){
        driver.findElement(PhoneColorBotton).click();
    }
}
