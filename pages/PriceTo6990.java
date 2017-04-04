package pages;

import StartTest.SetUpTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by SHYRIK on 02.04.2017.
 */
public class PriceTo6990 extends SetUpTest {
        //div[@name="goods_list"]//div[@class="inline"]//div[@name="price"]
        WebDriver driver;
        By LaptopXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[1]/a[1]/span[2]");
        By LaptopXpath6999 = By.xpath("//*[@id=\"menu_categories_left\"]/li[3]/ul/li[1]/a");
        By PriceXpath = By.xpath("//div[@name=\"goods_list\"]//div[@class=\"inline\"]//div[@name=\"price\"]");

        public PriceTo6990(WebDriver driver) {
            this.driver = driver;
        }

       public void ClickLaptop(){
         driver.findElement(LaptopXpath).click();
         ClickLaptop6990();
           List<WebElement> list = driver.findElements(PriceXpath);
           System.out.println(" ");
           listPrice(list);
           System.out.println( " ");
           driver.navigate().back();
           driver.navigate().back();
       }


       public void ClickLaptop6990(){

           driver.findElement(LaptopXpath6999).click();
       }

       public void listPrice(List<WebElement> list){
           for(int i = 0; i < list.size();i++){
               String value = list.get(i).getText();
               String  a = value.substring(0,5);
               String result = a.replace(" ","");
               int numbers = Integer.parseInt(result);
               if(numbers >=7000){
                   System.out.println("error");
               }
               else {
                   System.out.println("Cool");
               }
           }
       }
}
