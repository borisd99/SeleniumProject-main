package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage navigateTo() {
        System.out.println("Navigating to the login page");
        driver.navigate().to(Defaults.BASE_URL);
        return this;
    }

    public LoginPage enterEmail(String email) {
        System.out.println("Entering email: " + email);
        WebElement emailField = driver.findElement(By.xpath("//input[@id='loginusername']"));
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage enterPassword(String password) {
        System.out.println("Entering password: " + password);
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='loginpassword']"));
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage pressLoginButton() {
        System.out.println("Pressing login button");
        WebElement logButton = driver.findElement(By.xpath("//input[@id='loginsubmit']"));
        logButton.click();
        return this;
    }

    public String getHeadingText() {
        return driver.findElement(By.xpath("//h1")).getText().trim();
    }

    public String getLoginErrorMessage() {
        return driver.findElement(By.xpath("//div[@id='error']")).getText().trim();
    }

    public String logoutSuccessfulMessage() {
        return driver.findElement(By.xpath("//div[@id='okmsg']")).getText().trim();
    }
}
