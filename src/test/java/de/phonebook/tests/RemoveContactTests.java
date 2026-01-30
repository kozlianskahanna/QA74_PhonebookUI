package de.phonebook.tests;

import de.phonebook.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RemoveContactTests extends TestBase {
    @BeforeMethod
    public void precondition() {

        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSingOutButton();
        }

        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegisterForm(new de.phonebook.model.User()
                .setEmail("demiyncevaanna@gmail.com")
                .setPassword("Anna14031981$"));
        app.getUser().clickOnLoginButton();

        app.getContact().clickOnAddLink();
        app.getContact().fillContactForm(new de.phonebook.model.Contact()
                .setName("Hanna")
                .setLastname("Kozlianska")
                .setPhone("12345678910")
                .setEmail("demiyncevaanna@gmail.com")
                .setAddress("Berlin")
                .setDescription("Berlin"));
        app.getContact().clickOnSaveButton();
    }

    @Test
    public void removeContactTest() {
        int sizeBefore = app.getContact().sizeOfContacts();

        app.getContact().removeContact();
        app.getContact().pause(500);
        int sizeAfter = app.getContact().sizeOfContacts();

        Assert.assertEquals(sizeAfter, sizeBefore - 1);

    }
}
