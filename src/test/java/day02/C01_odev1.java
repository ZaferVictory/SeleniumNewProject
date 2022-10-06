package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_odev1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

         /*


        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
                Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin. Sayfayi kapatin.

         */

        driver.manage().window().maximize();

        // Amazon sayfasina gidelim.

        driver.get("https://www.amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println("sayfa basligi :"+driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String acturalTitle= driver.getTitle();
        String istenenKelime="Amazon";

        if (acturalTitle.contains(istenenKelime)) {
            System.out.println("Title testi pass");
        }else System.out.println("title testi failed");


        //Sayfa adresini(url) yazdirin

        System.out.println("sayfa url'i :"+driver.getCurrentUrl());

       // Sayfa url’inin “amazon” icerdigini test edin.

        String acturalUrl= driver.getCurrentUrl();
        String arananKelime="amazon";

        if (acturalUrl.contains(arananKelime)){
            System.out.println("url testi passed");
        }else System.out.println("url testi failed");

        //Sayfa handle degerini yazdirin

        System.out.println("handle degeri: "+driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin

        String actualpageSource=driver.getPageSource();
        String htmlArananKelime="Gateway";
        if (actualpageSource.contains(htmlArananKelime)) {
            System.out.println("source testi passed");
        }else System.out.println("source testi failed");

        // Sayfayi kapatin.

        driver.close();
    }
}
