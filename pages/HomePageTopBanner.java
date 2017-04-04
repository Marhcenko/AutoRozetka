package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by SHYRIK on 02.04.2017.
 */
public class HomePageTopBanner {
    WebDriver driver;

    public HomePageTopBanner(WebDriver driver) {
        this.driver = driver;
    }

    By questionAndAswerXpath = By.xpath("//ul[@class=\"m-top\"]/li[1]");
    By TitlePageXpath = By.xpath("//header[@class=\"title-page\"]");

    By CreditXpath = By.xpath("//ul[@class=\"m-top\"]/li[2]");
    By titleCreditXpath = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div/div/div[2]/div/h1");


    By DeliveryAndPayXpath = By.xpath("//ul[@class=\"m-top\"]/li[3]");
    By TitleDelivery = By.xpath("//*[@id=\"deliveries-payments-container\"]/h1");

    By GarantiyaXpath = By.xpath("//ul[@class=\"m-top\"]/li[4]");
    By TitlePageGaratiya = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div/div/div[2]/header/h1");

    By ContanctXpath = By.xpath("//ul[@class=\"m-top\"]/li[5]");
    By TitlePageConcant = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div/div/div[2]/header/h1");



    By SellOnTheRozektaXpath = By.xpath("//ul[@class=\"m-top\"]/li[7]");
    By PageTitleSell = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div[1]/div/div[1]/h1");


    public void ClickQuestionAndAswer() {
        driver.findElement(questionAndAswerXpath).click();
        Assert.assertEquals(ChackPageTitle(), "Вопросы и ответы");
        driver.navigate().back();
    }

    public String ChackPageTitle() {
        String StringTitle = driver.findElement(TitlePageXpath).getText();
        return StringTitle;
    }


    public void ClickCredit(){
        driver.findElement(CreditXpath).click();
        Assert.assertEquals(ChackPageTitleCredit(),"Покупка в кредит");
        driver.navigate().back();
    }
    public String ChackPageTitleCredit(){
        String value = driver.findElement(titleCreditXpath).getText();
        return value;
    }



    public void ClickDeliveryAndPay(){
       driver.findElement(DeliveryAndPayXpath).click();
       Assert.assertEquals(ChacktitleDeliveryAndPay(),"Доставка и оплата");
       driver.navigate().back();
    }
    public String ChacktitleDeliveryAndPay(){
        String value = driver.findElement(TitleDelivery).getText();
        return value;
    }

     public void ClickGarantiya(){
         driver.findElement(GarantiyaXpath).click();
          Assert.assertEquals(ChacktitleGarantiya(),"Гарантия и сервисное обслуживание");
         driver.navigate().back();
     }
     public String ChacktitleGarantiya(){
         String value = driver.findElement(TitlePageGaratiya).getText();
         return value;
     }

     public void ClickConcant(){
         driver.findElement(ContanctXpath).click();
         Assert.assertEquals(ChacktitleConcact(),"Консультации и заказ по телефонам");
         driver.navigate().back();
     }
     public String ChacktitleConcact(){
         String value = driver.findElement(TitlePageConcant).getText();
         return value;
     }

     public void ClickSell(){
         driver.findElement(SellOnTheRozektaXpath).click();
         Assert.assertEquals(ChackSellPage(),"Продавать на Розетке");
         driver.navigate().back();
     }
     public String ChackSellPage(){
         String value = driver.findElement(SellOnTheRozektaXpath).getText();
         return value;
     }

}
