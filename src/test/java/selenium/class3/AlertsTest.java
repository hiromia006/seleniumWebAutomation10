package selenium.class3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Alert
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //confirm Alert
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);


        //prompt  Alert
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
       Alert alt= driver.switchTo().alert();
        alt.sendKeys("dasfsf ");
        Thread.sleep(2000);
        alt.accept();
        Thread.sleep(2000);



        driver.quit();
    }
}
