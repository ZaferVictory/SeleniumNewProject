package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c04_ilktest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        /*
        1- amazon sayfasına gidiniz
        2- baslıfgın amazon ıcerdiğini test ediniz
        3- url nin amazon içerdiğini test ediniz
        4-  sonrada sayfayı kapatınız
         */

        // 1-Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");

        // 2-Basligin "Amazon" icerdigini test ediniz
        String actualTitle=driver.getTitle();

        String istenenKelime="Amazon";

        if (actualTitle.contains(istenenKelime)) {
            System.out.println("Title testi PASSED"); //Title testi PASSED
        }else System.out.println("Title testi FAILED");

        // 3-Url'nin amazon icerdigini test ediniz
        String actualUrl= driver.getCurrentUrl();

        String arananKelime="amazon";

        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED"); //Url testi PASSED
        }else  System.out.println("Url testi FAILED");

        //  4-sayfayi kapatiniz
        driver.close();


    }
}
