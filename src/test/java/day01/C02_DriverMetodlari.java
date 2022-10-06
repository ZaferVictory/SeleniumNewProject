package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMetodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();



        // amazon sayfasına gıdınız
        driver.get("https://amazon.com");

        //System.out.println(driver.getPageSource());// SAYFADAKI KAYNAK KODLARINI verir. bu yuzden bunu yoruma aldım.
        String istenenKelime="Gateway";

        //  kaynak kodlarının içinde"Gateway" kelimesinin oldugunu test ediniz
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSourse testi Passed");
        }else System.out.println("PageSourse testi FAILED");

        // kontrolu yaptıktan sonra kapatıyor
        driver.close();
        //driver.quit();// birden fazla sayfa varsa hepsini kapatır.


    }

}
