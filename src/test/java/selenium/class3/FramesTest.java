package selenium.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FramesTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println("Before Main Html: " + driver.findElement(By.className("text-center")).getText());

        driver.switchTo().frame("frame1");
        System.out.println("Ifram " + driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        System.out.println("After Main Html: " + driver.findElement(By.id("framesWrapper")).getText());


        driver.quit();

    }
}
