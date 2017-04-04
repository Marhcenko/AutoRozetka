package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by SHYRIK on 04.04.2017.
 */
public class MiddleBanner {
    WebDriver driver;
    public MiddleBanner(WebDriver driver) {
        this.driver = driver;
    }

    By laptopXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[1]/a[1]/span[2]");
    By TitleLaptop = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/header/h1");

    By SmartphoneXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[1]/a[2]/span[2]");
    By TitleSmartPhone = By.xpath("//*[@id=\"title_page\"]/div/div/div[2]/h1");

    By ChemistryXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[1]/a[3]/span[2]");
    By TitleChemistry = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/header/h1");

    By FoodXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[1]/a[4]/span[2]");
    By Titlefood = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/header/h1");

    By ClothesXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[1]/a[5]/span[2]");
    By TitleClothes = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/header/h1");

    By AlcoholXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[2]/a[1]/span[1]/img");
    By TitleAlcohol = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/header/h1");

    By PerfumeryXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[2]/a[2]/span[1]/img");
    By TitlePerfumery = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/header/h1");

    By UnderclothesXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[2]/a[3]/span[1]/img");
    By TitleUnderclothes = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/header/h1");

    By RingGoldXpath = By.xpath("//*[@id=\"popular-categories\"]/div/div[2]/a[4]/span[1]/img");
    By TitleRingGold = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/header/h1");

    By ChildOfWorld = By.xpath("//*[@id=\"popular-categories\"]/div/div[2]/a[5]/span[1]/img");
    By titleChildOfWorld = By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/header/h1");


    public void ClickLaptop() throws InterruptedException {
        driver.findElement(laptopXpath).click();
        Thread.sleep(1000);
        String value = driver.findElement(TitleLaptop).getText();
        Assert.assertEquals(value,"Ноутбуки");
        driver.navigate().back();


    }



    public void ClickSmartPhone() throws InterruptedException {
        driver.findElement(SmartphoneXpath).click();
        Thread.sleep(1000);
        String value = driver.findElement(TitleSmartPhone).getText();
        Assert.assertEquals(value,"Все смартфоны");
        driver.navigate().back();
    }


    public void ClickChemistry() throws InterruptedException {
        driver.findElement(ChemistryXpath).click();
        Thread.sleep(1000);
        String value = driver.findElement(TitleChemistry).getText();
        Assert.assertEquals(value,"Бытовая химия");
        driver.navigate().back();
    }


    public void ClickFood() throws InterruptedException {
        driver.findElement(FoodXpath).click();
        Thread.sleep(1000);
        String value = driver.findElement(Titlefood).getText();
        Assert.assertEquals(value,"Продукты");
        driver.navigate().back();
    }
    public void ClicClothes() throws InterruptedException {
        driver.findElement(ClothesXpath).click();
        Thread.sleep(1000);
        String value = driver.findElement(TitleClothes).getText();
        Assert.assertEquals(value,"Одежда, обувь и аксессуары");
        driver.navigate().back();
    }
    public void ClickAlcohol() throws InterruptedException {
        driver.findElement(AlcoholXpath).click();
        Thread.sleep(1000);
        String value = driver.findElement(TitleAlcohol).getText();
        Assert.assertEquals(value,"Алкогольные напитки");
        driver.navigate().back();
    }

    public void ClickPerfumery() throws InterruptedException {
        driver.findElement(PerfumeryXpath).click();
        Thread.sleep(1000);
        String value = driver.findElement(TitlePerfumery).getText();
        Assert.assertEquals(value,"Косметика и парфюмерия");
        driver.navigate().back();
    }
    public void ClickUnderclot() throws InterruptedException {
        driver.findElement(UnderclothesXpath).click();
        Thread.sleep(1000);
        String value = driver.findElement(TitleUnderclothes).getText();
        Assert.assertEquals(value,"Нижнее белье, колготки и одежда для дома");
        driver.navigate().back();
    }
    public void ClickRingGold() throws InterruptedException {
        driver.findElement(RingGoldXpath).click();
        Thread.sleep(1000);
        String value = driver.findElement(TitleRingGold).getText();
        Assert.assertEquals(value,"Ювелирные изделия");
        driver.navigate().back();
    }
    public void ClickChildOfWorld() throws InterruptedException {
        driver.findElement(ChildOfWorld).click();
        Thread.sleep(1000);
        String value = driver.findElement(titleChildOfWorld).getText();
        Assert.assertEquals(value,"Товары для детей");
        driver.navigate().back();
    }
}
