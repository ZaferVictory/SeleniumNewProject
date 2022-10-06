package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkclass {

    public static void main(String[] args) {

         /*
        En temel haliyle bir otomasyon yapmak için
        Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
        bunun için java kutuphanesinde System.setProperty() method'unu kullanırız
        ve metthod'un içine ilk olarak driver'i yazarız. İkinci olarak onun fiziki yolunu kopyalarız
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println("actual Title: "+driver.getTitle());// gidilen sitenın baslıgını yazdırır.
        System.out.println("Actual url: "+driver.getCurrentUrl());// içinde bulunan sayfanın url'sini getirir

        System.out.println(driver.getPageSource());


    }
}
