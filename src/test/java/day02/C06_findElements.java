package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        /*
        amazon sayfasına gıdınız amazon sayfasında kı tagların sayısını yazdısırın
         */

        driver.get("https://www.amazon.com");

        //  amazon sayfasında kı tagları input olanların  sayısını yazdırın

        List<WebElement>tag= driver.findElements(By.tagName("input"));
        System.out.println("input tag'nın sayısı :"+ tag.size());

        System.out.println(driver.findElement(By.xpath("(//*[@class='a-color-base headline truncate-2line'])[1]")).getText());
    }
}
