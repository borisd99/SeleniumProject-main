package Pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    private String page_url = "/login";
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage navigateTo() {
        System.out.println("Navigating to the login page.");
        driver.navigate().to(Defaults.BASE_URL + page_url);
        return this;
    }

}
