package Methods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    public static WebDriver driver;
    public static ExtentTest Logger;
    public static ExtentReports reports;


    public static void click(WebElement element){
        try{
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        }catch (Exception e){
        }
    }
    public static void input(WebElement element, String Input){
        try{
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOfAllElements(element));
            element.sendKeys(Input);
        }catch (Exception e){
        }
    }
    public static void selectbyIndex(WebElement element, int Input){
        try{
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            final Select select = new Select(element);
            select.selectByIndex(Input);
        }catch (Exception e){
        }
    }
    public static void createReport(){
        reports = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("");
        reports.attachReporter(spark);
    }
    public static void scenario(){

    }



}
