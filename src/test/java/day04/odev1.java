package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class odev1 {

    public static void main(String[] args) throws InterruptedException {
            /*
    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna 10 kez basinız
    3- 10 kez Add element butonuna basıldığını test ediniz
    4 - Delete butonuna görünmeyene kadar basınız
    5- Delete butonunun görünmediğini test ediniz
    6- Sayfayı kapatınız
     */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/" +
                "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //  1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(1000);
        //2- Add Element butonuna 10 kez basinız
        WebElement addElementButonu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        for (int i = 1; i <=10 ; i++) {
            addElementButonu.click();
        }
        //3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> deleteButonList=driver.findElements(By.className("added-manually"));
        System.out.println("Delete buton sayisi = "+deleteButonList.size());
        if (deleteButonList.size()==10){
            System.out.println("Delete buton 10 adet TEST PASSED");
        }else System.out.println("Delete buton 10 adet TEST FAILED");
        //4 - Delete butonuna görünmeyene kadar basınız
        for (WebElement e:deleteButonList) {
            Thread.sleep(100);
            e.click();
        }
        // deleteButonList.stream().forEach(t->t.click());  //lambda ile
        WebElement anaSayfa = driver.findElement(By.className("no-js"));
        System.out.println(anaSayfa.getText());
        String deleteButton = "Delete";
        if (!anaSayfa.getText().contains(deleteButton)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");
        // 6- Sayfayı kapatınız
        driver.close();
    }
}

