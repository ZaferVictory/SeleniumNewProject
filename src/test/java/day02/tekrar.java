package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tekrar {
    public static void main(String[] args) throws InterruptedException {
       /*
        Yeni bir Class olusturalim.C07_ManageWindowSet
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        8. Sayfayi kapatin

        */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

       driver.manage().window().maximize();

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());


        driver.manage().window().fullscreen();

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
    }

}
