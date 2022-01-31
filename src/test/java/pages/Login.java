package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 The pages and test functions packages are separated to adopt Page Object Model design (POM)
    1. Tests objects and functions are separated for an easy maintenance and clean code
    2. Objects are kept separated from test scripts and can be used multiple times (multiples tests)
       e.g. No need to define/create username/password element check everytime
    3. Every unique locator is defined once to an easy maintenance and avoid rework
 */
public class Login {

    public static WebElement user(WebDriver wd) {
        return wd.findElement(By.id("username"));
    }

    public static WebElement pass(WebDriver wd) {
        return wd.findElement(By.xpath("//*[@id=\"password\"]"));

    }
}
