package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.stream.Collectors;

public class SelectorOrLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com");

        String text = driver.findElement(By.className("caption")).getText().trim();
        System.out.println(text);

        driver.findElement(By.name("username")).sendKeys("shimu");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("shimu");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("got login")).click();
        Thread.sleep(2000);

     List<WebElement> elements=driver.findElements(By.tagName("a"));
     for (WebElement el:elements){
         System.out.println(el.getAttribute("href"));
     }

     driver.findElements(By.partialLinkText("got login")).size();
   driver.findElement(By.partialLinkText("got login")).isDisplayed();


        driver.quit();
    }
}
