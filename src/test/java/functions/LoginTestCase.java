package functions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

public class LoginTestCase {

    static WebDriver wd = null;

    public static void main(String[] args) {
        loggingIn();
    }

    public static void loggingIn() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();

        try{
            wd.get("https://baq.d2.opencell.work/opencell/");
//          wd.findElement(By.id("username")).sendKeys("opencell.admin");
            Login.user(wd).sendKeys("opencell.admin");
            Login.pass(wd).sendKeys("opencell.admin");
            wd.findElement(By.id("kc-login")).click();
            Thread.sleep(7000);
            System.out.println("Successfully logged in !");
            wd.close();
        }catch (Exception ex){
            System.out.println("logging in failed: "+ex);
        }


    }
}
