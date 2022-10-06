package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindovHandle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());//CDwindow-560EA718C5E3A5D5B1BDB9F785A3DC59
         // farklı pencereler arasında gezinebılmek ıcın getwindovhandlemetodunu kullanırız.
        // yukarıdakı kod her sayfa acısta değişiyor.
    }
}
