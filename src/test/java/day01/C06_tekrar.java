package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_tekrar {

    public static void main(String[] args) throws InterruptedException {
/*
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
                Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.

 */

       System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

       WebDriver driver=new ChromeDriver();

       driver.manage().window().maximize();
       //        Yeni bir class olusturalim : C03_GetMethods
       driver.get("https://www.amazon.com");

       //Sayfa basligini(title) yazdirin
        System.out.println("sayfa basligi: "+driver.getTitle());


        //Sayfa basliginin “Amazon” icerdigini test edin
         String baslık=driver.getTitle();
         String istenenKelime="Amazon";

        if (baslık.contains(istenenKelime)) {
            System.out.println("baslik Amazon passed");
        }else System.out.println("baslik Amazon failed");

        //Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.

        String url=driver.getCurrentUrl();
        String kelime="amazon";

        if (url.contains(kelime)){
            System.out.println("amazon urlsi passed iceriyor");
        }else System.out.println("amazon urlsi failed");

        //Sayfa handle degerini yazdirin
        System.out.println("sayfanin handle degeri :"+driver.getWindowHandle());


        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String kod=driver.getPageSource();
        String kelime1="Gateway";

        if (kod.contains(kelime1)){
            System.out.println("html kod passed ");
        }else System.out.println("html kod failed");


        driver.close();
    }
}
