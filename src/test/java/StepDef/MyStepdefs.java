package StepDef;

import PageObject.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs extends Elements {

    public MyStepdefs(){

    }

    @Given("User Opens the webSite")
    public void userOpensTheWebSite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://way2automation.com/angularjs-protractor/webtables/");
        driver.manage().window().maximize();
    }

    @And("Verify the website")
    public void verifyTheWebsite() {
        Validate();

    }

    @Given("User click on the Add User Button")
    public void userClickOnTheAddUserButton() {
        AddUserButton();
    }

    @And("User Enter a Name {string}")
    public void userEnterAName(String name) {
        EnterNamen(name);
    }

    @And("User Enter a LastName {string}")
    public void userEnterALastName(String lastname) {
        EnterLastName(lastname);
    }

    @And("User Enter a UserName {string}")
    public void userEnterAUserName(String username) {
        EnterUserName(username);
    }
    @And("User Enter a Password {string}")
    public void userEnterAPassword(String password) {
        EnterPassword(password);
    }

    @And("User Click on Customer Radio Button")
    public void userClickOnCustomerRadioButton() {
        ClickRadioButtonBBB();
    }

    @And("User Enter a Email {string}")
    public void userEnterAEmail(String email) {
        EnterEmail(email);
    }

    @And("User Enter a CellPhone {string}")
    public void userEnterACellPhone(String phone) {
        EnterCellPhone(phone);
    }

    @Then("User Click on Save")
    public void userClickOnSave() {

        SaveUserButton();
    }

    @Given("Validated added User")
    public void validatedAddedUser() {
        ValidateAddUser();
    }


    @And("User Click on drop down for role")
    public void userClickOnDropDownForRole() {
        dropDown();
    }
}
