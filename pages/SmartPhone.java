package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by SHYRIK on 03.04.2017.
 */
public class SmartPhone {
    WebDriver driver;
    public SmartPhone(WebDriver driver) {
        this.driver = driver;
    }

    By MainElementFristXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[1]/a[2]/span[2]");
    By InputValueMin = By.xpath("//*[@id=\"price[min]\"]");
    By InputvalueMAx = By.xpath("//*[@id=\"price[max]\"]");
    By inputOk = By.xpath("//*[@id=\"submitprice\"]");


    public void ClickSmartPhone(){
        driver.findElement(MainElementFristXpath).click();
    }

    public void InputMinPrice(String s){
        driver.findElement(InputValueMin).clear();
        driver.findElement(InputValueMin).sendKeys(s);
        ClickOk();
        driver.navigate().back();

    }
    public void InputMaxPrice(String s){
        driver.findElement(InputvalueMAx).sendKeys("0");
        driver.findElement(InputvalueMAx).clear();
        driver.findElement(InputvalueMAx).sendKeys(s);
    }


    public void ClickOk(){
        driver.findElement(inputOk).click();
    }
}