package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseClassTest {
    @Test(priority = 3)
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


    @Test(priority = 0)
    public void validatePageTittle() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }


    @Test(priority = 1)
    public void validateUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

    }

    @Test(priority = 2)
    public void validateLogo() {
        Assert.assertEquals(driver.findElement(By.className("login_logo")).getText().trim(), "Swag Labs");
    }
}
