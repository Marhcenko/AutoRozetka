package StartTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by SHYRIK on 01.04.2017.
 */
public class SetUpTest {
    @Test
    public void FirstTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://rozetka.com.ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);

        HomePageTopBanner homePage  = new HomePageTopBanner(driver);
        homePage.ClickQuestionAndAswer();
        homePage.ClickCredit();
        homePage.ClickDeliveryAndPay();
        homePage.ClickGarantiya();
        homePage.ClickConcant();
        homePage.ClickSell();

        MiddleBanner middleBanner = new MiddleBanner(driver);
        middleBanner.ClickSmartPhone();
        middleBanner.ClicClothes();
        middleBanner.ClickChemistry();
        middleBanner.ClickLaptop();
        middleBanner.ClickFood();
        middleBanner.ClickAlcohol();
        middleBanner.ClickPerfumery();
        middleBanner.ClickUnderclot();
        middleBanner.ClickRingGold();
        middleBanner.ClickChildOfWorld();




        MainSearch mainSearch = new MainSearch(driver);
        mainSearch.ClickSearch("IPhone 7");

        //1 asr about price
        PriceTo6990 priceTo6990 = new PriceTo6990(driver);
        priceTo6990.ClickLaptop();


         Price7000l9999 price7000l9999 = new Price7000l9999(driver);
         price7000l9999.ClickLaptop();

          //
//         SmartPhone smartPhone = new SmartPhone(driver);
//         smartPhone.ClickSmartPhone();
//         smartPhone.InputMinPrice("1000");
//         smartPhone.InputMaxPrice("3000");

        //Спросить как выбрать слово 'black' и проверить его
        SmartPhoneColor smartPhoneColor = new SmartPhoneColor(driver);
        smartPhoneColor.ClickFirstPhoneMain();


         FilterSmartPhoneCompany filterSmartPhoneCompany = new FilterSmartPhoneCompany(driver);
         filterSmartPhoneCompany.FirstElementPhone();


    }
}
