package selenium.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.time.Duration;

public class BrowserLaunch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        Thread.sleep(2000);

        driver.quit();
    }
}
