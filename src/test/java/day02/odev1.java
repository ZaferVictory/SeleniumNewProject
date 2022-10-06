package day02;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev1 {
    /*
    1.Yeni bir class olusturalim (Homework)
2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
    oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
            3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
    yazdirin.
4.https://www.walmart.com/ sayfasina gidin.
            5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
            6. Tekrar “facebook” sayfasina donun
7. Sayfayi yenileyin
8. Sayfayi tam sayfa (maximize) yapin
9.Browser’i kapatin

     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //facebook sayfasina gidin
        driver.navigate().to("https://www.facebook.com");

        //sayfa basliginin (title) “facebook”
        //    oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        String baslık= driver.getTitle();
        String title="facebok";

        if (baslık.contains(title)){
            System.out.println("title passed");
        }else System.out.println("dogru baslik: "+driver.getTitle());

        //sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //    yazdirin.
        String url=driver.getCurrentUrl();
        String kelime="facebook";

        if (url.contains(kelime)){
            System.out.println("url testi passed");
        }else System.out.println("gercek url :"+driver.getCurrentUrl());

        //https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com");


        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        String baslik=driver.getTitle();
        String arananurl="Walmart.com";

        if (baslik.contains(arananurl)){
            System.out.println("baslik PASSED");
        }else System.out.println("baslik failed");

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();


       // Sayfayi yenileyin
        driver.navigate().refresh();


        //Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //Browser’i kapatin
        driver.close();


    }
}
