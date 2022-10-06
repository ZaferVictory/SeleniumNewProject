package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("");
        driver.getCurrentUrl();// mevcut olan sayfanın url ini getiriyordu

        driver.manage().window().maximize();
        driver.getTitle();
        driver.navigate();





    }
}
