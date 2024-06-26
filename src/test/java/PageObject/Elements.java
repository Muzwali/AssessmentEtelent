package PageObject;

import Methods.BaseClass;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Elements  extends BaseClass {

    public Elements(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//button[contains(text(),' Add User')]")
    WebElement AddUserButton;
    public void AddUserButton(){
        try{
            click(AddUserButton);
        }catch (Exception e){

        }
    }
    @FindBy(xpath ="//input[@name='FirstName']")
    WebElement EnterName;
    public void EnterNamen(String Name){
        try{
            input(EnterName,Name);
        }catch (Exception e){

        }
    }
    @FindBy(xpath ="//input[@name='LastName']")
    WebElement EnterLastName;
    public void EnterLastName(String Name){
        try{
            input(EnterLastName,Name);
        }catch (Exception e){

        }
    }
    @FindBy(xpath ="//input[@name='UserName']")
    WebElement EnterUserName;
    public void EnterUserName(String Name){
        try{
            input(EnterUserName,Name);
        }catch (Exception e){

        }
    }
    @FindBy(xpath ="//input[@name='Password']")
    WebElement EnterPassword;
    public void EnterPassword(String Name){
        try{
            input(EnterPassword,Name);
        }catch (Exception e){

        }
    }
    @FindBy(xpath ="(//input[@name='optionsRadios'])[2]")
    WebElement ClickRadioButtonBBB;
    public void ClickRadioButtonBBB(){
        try{
            click(ClickRadioButtonBBB);
        }catch (Exception e){

        }
    }
    @FindBy(xpath ="(//input[@name='optionsRadios'])[1]")
    WebElement ClickRadioButtonAAA;
    public void ClickRadioButtonAAA(){
        try{
            click(ClickRadioButtonAAA);
        }catch (Exception e){

        }
    }
    @FindBy(xpath ="//select[@name='RoleId']")
    WebElement DropDownRole;

    public void dropDown(){
        try{
            //Select s = new Select(DropDownRole);
           // s.selectByIndex(1);
           selectbyIndex(DropDownRole,1);
        }catch(Exception e){

        }
    }

    @FindBy(xpath ="//input[@name='Email']")
    WebElement EnterEmail;
    public void EnterEmail(String Name){
        try{
            input(EnterEmail,Name);
        }catch (Exception e){

        }
    }
    @FindBy(xpath ="//input[@name='Mobilephone']")
    WebElement EnterCellPhone;
    public void EnterCellPhone(String Name){
        try{
            input(EnterCellPhone,Name);
        }catch (Exception e){

        }
    }
    @FindBy(xpath ="//button[contains(text(),'Save')]")
    WebElement SaveUserButton;

    public void SaveUserButton(){
        try{
            Thread.sleep(1000);
            click(SaveUserButton);
        }catch (Exception e){

        }
    }

    public  void Validate(){
        driver.getTitle();
        String Tittle = "Protractor practice website - WebTables";
        if(Tittle.equals(driver.getTitle())){
            Assert.assertEquals(Tittle,driver.getTitle());
        }
    }
    @FindBy(xpath ="//button[contains(text(),'Save')]")
    WebElement validatename;
    public  void ValidateAddUser() {
        if (validatename.getText().equalsIgnoreCase("muzwali")) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", validatename);
        } else {
            System.out.println("not validated");
        }
    }
}
