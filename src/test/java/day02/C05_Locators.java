package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        // amazonda nutella aratınız

        /*İD İLE YAPILAN ARAMA*/
        //WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox")); BURADA İD İLE YAPTIK
        //aramakutusu.sendKeys("Nutella"+ Keys.ENTER);// id unıque oldugu için sorunsuz calıstı
                                     /* , virgulde kullanılır sorun olmaz*/


        /* NAME YAPILAN ARAMA*/
        //WebElement aramakutusu=driver.findElement(By.name("field-keywords"));// BURADA NAME İLE YAPTIM
        //aramakutusu.sendKeys("Nutella"+Keys.ENTER);// AMA İD VARKEN NAME KAULLANILMAZ.//name unıque oldugu için sorunsuz calıstı

        /* CLAS NAME İLE YAPILAN ARAMA*/

        //WebElement aramakutusu=driver.findElement(By.className("nav-search-field "));// classname calismadi
        //aramakutusu.sendKeys("Nutella"+Keys.ENTER);// locater alırken gozumızden kacan detaylar olabailir aldıgmız locater calısmazsa alternatif
                                                    //alternatif locater lar denemelıtyız


        driver.findElement(By.partialLinkText("oducts on Amazon")).click(); // a tag'ındaki link isminden istediğimiz bir parçayla locate edebiliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();











    }
}
