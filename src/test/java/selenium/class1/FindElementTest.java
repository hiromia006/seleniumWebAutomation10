package selenium.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FindElementTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

       WebElement element= driver.findElement(By.id("login-button"));
        System.out.println("Font Size: "+element.getCssValue("font-size"));
        System.out.println("color: "+element.getCssValue("color"));
        System.out.println("font-family: "+element.getCssValue("font-family"));

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
