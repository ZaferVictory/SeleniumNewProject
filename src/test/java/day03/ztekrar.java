package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

import java.time.Duration;
import java.util.List;

public class ztekrar {

    public static void main(String[] args) throws InterruptedException {
        /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //a. http://a.testaddressbook.com adresine gidiniz.
       driver.get(" http://a.testaddressbook.com");
        //b. Sign in butonuna basin
        WebElement butonbas=driver.findElement(By.id("sign-in"));
        butonbas.click();
       //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement email=driver.findElement(By.id("session_email"));
        WebElement password= driver.findElement(By.id("session_password"));
        WebElement signinbutton = driver.findElement(By.name("commit"));

       //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!

        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signinbutton.click();


       //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

      WebElement  gmail= driver.findElement(By.className("navbar-text"));

      if (gmail.isDisplayed()){
          System.out.println("ExpectedUser Testi PASSED \"+expectedUser.getText()");
      }else System.out.println("ExpectedUser Testi PASSED \"+expectedUser.getText()");


      //>>>>>
        String dogrulanacakolan="testtechproed@gmail.com";
        String dogru=gmail.getText();

        if (dogru.equals(dogrulanacakolan)){
            System.out.println("esit");
        }else System.out.println("esit degil");




       //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adreses=driver.findElement(By.linkText("Addresses"));
        WebElement signOut=driver.findElement(By.linkText("Sign out"));




       //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement>linklerinlistesi=driver.findElements(By.tagName("a"));
        System.out.println("linklerinlistesi  "+ linklerinlistesi.size());

        for (WebElement each:linklerinlistesi) {
            System.out.println(each.getText());
        }

        //4 linkleri yazdırınız




        //5. Linkleri LAMBDA ile yazdırınız


        linklerinlistesi.stream().forEach(t-> System.out.println());



    }
}
