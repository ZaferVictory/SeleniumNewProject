package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMetodlariWait {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.get("https://www.techproeducation.com");
        driver.close();
        /*
        ileride wait konusunu daha geniş olarak ele alacagız
        bir sayfa acılırken ilk basta sayfanın içerisinde bulunan elementlere göre bir yukleme
        suresine ıhtıyac vardır. veya bir web elementin kullanılabılmesi için zamana ıhtıyac olabilir.
        implicitlyWait bize sayfanın yuklenmesi ve sayfadakı elementlere ulasım için beklenecek maxıumum
        sureyı belirleme olanagı tanır.
         */
    }
}
