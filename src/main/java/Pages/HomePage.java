package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private By userPanelText = By.xpath("//div[@id='userpanel']");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserPanelText() {
        return driver.findElement(userPanelText).getText().trim();
    }

    public void logout() {
        System.out.println("Press logout link");
        driver.findElement(userPanelText).click();
        driver.findElement(By.xpath("//a[@class='selenium-button-logout button-logout']")).click();
    }

    public void clickOnClientsButton() {
        System.out.println("Clicking on clients button");
        driver.findElement(By.xpath("//a[@href='https://proba-ood.inv.bg/clients']")).click();
    }

}
