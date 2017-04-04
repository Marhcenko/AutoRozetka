package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by SHYRIK on 03.04.2017.
 */
public class Price7000l9999 {
    WebDriver driver;
    By LaptopXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[1]/a[1]/span[2]");
    public Price7000l9999(WebDriver driver) {
        this.driver = driver;
    }
    By LaptopXpath7000l9990 = By.xpath("//*[@id=\"menu_categories_left\"]/li[3]/ul/li[2]/a");
    By PriceXpath = By.xpath("//div[@name=\"goods_list\"]//div[@class=\"inline\"]//div[@name=\"price\"]");

      public void ClickLaptop(){
        driver.findElement(LaptopXpath).click();
        ClickLaptop7000();
        List<WebElement> list = driver.findElements(PriceXpath);
        listPrice(list);
        driver.navigate().back();
        driver.navigate().back();
      }

      public void ClickLaptop7000(){
          driver.findElement(LaptopXpath7000l9990).click();
      }

    public void listPrice(List<WebElement> list) {
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i).getText();
            String a = value.substring(0, 5);
            String result = a.replace(" ", "");
            int numbers = Integer.parseInt(result);
            if (numbers <= 7000 && numbers >=1000) {
                System.out.println("error");
            } else {
                System.out.println("Cool");
            }
        }
    }
}
