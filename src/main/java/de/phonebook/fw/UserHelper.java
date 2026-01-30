package de.phonebook.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends de.phonebook.core.BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void fillLoginRegisterForm(de.phonebook.model.User user) {
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

    public boolean isSignOutButtonPresent() {
        return isElementPresent(By.xpath("//button[.='Sign Out']"));
    }

    public void clickOnRegistrationButton() {
        click(By.name("registration"));
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void clickOnLoginButton() {
        click(By.name("login"));
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.cssSelector("[href='/login']"));
    }

    public void clickOnSingOutButton() {
        click(By.xpath("//button[.='Sign Out']"));
    }
}
