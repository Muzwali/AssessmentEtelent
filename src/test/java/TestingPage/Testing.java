package TestingPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testing {

    WebDriver driver;
    @BeforeClass
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }
    @Test
   public void TestWeb(){
        ///////////////////////////login
       driver.get("https://adactinhotelapp.com/index.php");
       WebElement UserNameField =driver.findElement(By.xpath("//input[@id='username']"));
       UserNameField.clear();
       UserNameField.sendKeys("trevormccarthy");
       WebElement PasswordField =driver.findElement(By.xpath("//input[@id='password']"));
       PasswordField.clear();
       PasswordField.sendKeys("O2BH0K");
       driver.findElement(By.xpath("//input[@id='login']")).click();
       ////////////////////////////////
        WebElement Locator = driver.findElement(By.xpath("//select[@id='location']"));
        Select L = new Select(Locator);
        L.selectByIndex(1);

        WebElement Hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
        Select H = new Select(Hotels);
        H.selectByIndex(2);
        WebElement RoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
        Select R = new Select(RoomType);
        R.selectByIndex(1);
        WebElement NumberOfRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
        Select N = new Select(NumberOfRooms);
        N.selectByIndex(1);


        WebElement CheckInDate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
        CheckInDate.clear();
        CheckInDate.sendKeys("1/05/2024");

        WebElement CheckOutDate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
        CheckOutDate.clear();
        CheckOutDate.sendKeys("16/05/2024");

        WebElement AudultRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
        Select A = new Select(AudultRoom);
        A.selectByIndex(1);
        WebElement ChildRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
        Select C = new Select(ChildRoom);
        C.selectByIndex(1);

        WebElement Submit = driver.findElement(By.xpath("//input[@id='Submit']"));
        Submit.click();

        /////////////////////////////////////////////
         WebElement RadioButon = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
            RadioButon.click();
        WebElement ContinueButon = driver.findElement(By.xpath("//input[@id='continue']"));
        ContinueButon.click();

        WebElement FirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
        FirstName.clear();
        FirstName.sendKeys("16/05/2024");

        WebElement LastName = driver.findElement(By.xpath("//input[@id='last_name']"));
        LastName.clear();
        LastName.sendKeys("16/05/2024");

        WebElement Billing = driver.findElement(By.xpath("//textarea[@id='address']"));
        Billing.clear();
        CheckOutDate.sendKeys("16/05/2024");

        WebElement CheckOutDate1 = driver.findElement(By.xpath("//input[@id='datepick_out']"));
        CheckOutDate.clear();
        CheckOutDate.sendKeys("16/05/2024");

      /*
        User name: trevormccarthy
        Password: O2BH0K

        Using the adactin testing website (https://adactinhotelapp.com/index.php) create an automated script that will search for available hotels and validate that the data returned on the select screen matches the searched results, if the booking date is incorrect or in the past the script should validate the error message “Check-In Date shall be before than Check-Out Date”.
        Please use any report of your choice and ensure screenshot are captured as evidence.
        Adactin.com - Hotel Reservation System
[12:12 PM] Trevor McCarthy
        Using the pet store API https://dog.ceo/dog-api create a script that will fetch all the sub-breeds for a dog breed “mastiff”, The script should validate that “english” is on the list of the sub-breeds returned on the response.

        Please use any report of your choice and ensure the response is captured as evidence

       */
   }
}
