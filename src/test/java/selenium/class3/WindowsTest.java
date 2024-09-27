package selenium.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WindowsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println("Before Main Window: " + driver.findElement(By.className("text-center")).getText());
        String originalWindow = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        driver.get("https://demoqa.com/sample");
        System.out.println("Tab " + driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(2000);

        driver.switchTo().window(originalWindow);
        Thread.sleep(1000);
        System.out.println("After Main Window: " + driver.findElement(By.className("text-center")).getText());


        driver.quit();

    }
}
