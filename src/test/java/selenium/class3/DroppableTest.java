package selenium.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DroppableTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        new Actions(driver).dragAndDrop(source, target).build().perform();
        Thread.sleep(3000);

        driver.navigate().to("https://demoqa.com/menu");

        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.cssSelector("#nav > li:nth-child(2) > a")))
                .click().build().perform();
        Thread.sleep(1000);
        act.moveToElement(driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul > li:nth-child(3) > a")))
                        .click().build().perform();
        Thread.sleep(1000);
        act.moveToElement(driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(1) > a")))
                .click().build().perform();
        Thread.sleep(1000);




        driver.quit();

    }
}
