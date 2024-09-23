package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");

        Select country=new Select(driver.findElement(By.name("country")));
        country.selectByIndex(2);
        Thread.sleep(2000);
        country.selectByValue("ANDORRA");
        Thread.sleep(2000);
        country.selectByVisibleText("ANGUILLA");

       List<WebElement> elements= country.getOptions();
       for (WebElement el:elements){
           System.out.println(el.getText().trim() + "  "+el.getAttribute("value"));
       }

       driver.quit();
    }
}
