package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases2 extends BaseMethodTest {
    @Test
    public void loginShouldSucceed() throws InterruptedException {
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


    }

    @Test
    public void loginFailWithInvalidPassword() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("11");

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

        String loginText = driver.findElement(By.className("error-message-container")).getText().trim();
        System.out.println(loginText);
        Assert.assertTrue(loginText.contains("Username and password do not match any user in this service"));

    }

    @Test
    public void loginFailWithInvalidUsername() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("sdfadfsa");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

        String loginText = driver.findElement(By.className("error-message-container")).getText().trim();
        System.out.println(loginText);
        Assert.assertTrue(loginText.contains("Username and password do not match any user in this service"));

    }


    @Test
    public void validatePageTittle() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }


    @Test
    public void validateUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

    }

    @Test
    public void validateLogo() {
        Assert.assertEquals(driver.findElement(By.className("login_logo")).getText().trim(), "Swag Labs");
    }
}
