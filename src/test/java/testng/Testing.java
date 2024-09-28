package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testing {

    @Test
    public void loginShouldSucceed() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1000);

        String loginText = driver.findElement(By.id("logout_sidebar_link")).getText().trim();

        Assert.assertEquals(loginText, "Logout");

        driver.quit();
    }


    @Test
    public void validatePageTittle() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Assert.assertEquals(driver.getTitle(), "Swag Labs");

        driver.quit();
    }


    @Test
    public void validateUrl() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

        driver.quit();
    }

    @Test
    public void validateLogo() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Assert.assertEquals(driver.findElement(By.className("login_logo")).getText().trim(), "Swag Labs");

        driver.quit();
    }
}
