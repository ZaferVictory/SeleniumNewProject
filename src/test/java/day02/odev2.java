package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev2 {

    public static void main(String[] args) {
        /*
        1. Yeni bir class olusturun (TekrarTesti)
        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
                (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        URL'yi yazdırın.
        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        5. Youtube sayfasina geri donun
        6. Sayfayi yenileyin
        7. Amazon sayfasina donun
        8. Sayfayi tamsayfa yapin
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        11.Sayfayi kapatin

     */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //Youtube web sayfasına gidin
        driver.get("https://www.youtube.com");

        //sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        String baslik=driver.getTitle();
        String kelime="youtube";

        if (baslik.contains(kelime)){
            System.out.println("title kontrolu passed");
        }else System.out.println("gerçek baslik :"+driver.getTitle());

        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //        URL'yi yazdırın.

        String actualurl=driver.getCurrentUrl();
        String kelime1="youtube";

        if (actualurl.contains(kelime1)){
            System.out.println("url testi passed");
        }else System.out.println("gercek url: "+driver.getCurrentUrl());


        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");

        //Youtube sayfasina geri donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Amazon sayfasina donun
        driver.navigate().forward();
        //driver.navigate().back();

        //Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.

        String baslik1=driver.getTitle();
        String kelime2="Amazon";

        if (baslik1.contains(kelime2)){
            System.out.println("baslik testi passed");
        }else System.out.println("actual title :"+driver.getTitle());

        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        // URL'yi yazdırın

        String url= driver.getCurrentUrl();
        String dogrulama="https://www.amazon.com/";

        if (url.equals(dogrulama)){
            System.out.println("url testi passed");
        }else System.out.println("gercek url: "+driver.getCurrentUrl());

        // nutella yazdırarak arattıralım

        //Sayfayi kapatin
        driver.close();





    }
}
