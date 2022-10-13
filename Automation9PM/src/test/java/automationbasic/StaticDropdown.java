package automationbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BowserCall;

import java.io.IOException;
import java.time.Duration;

public class StaticDropdown extends BowserCall {

    public static void main(String[] args) throws IOException {

      WebDriver driver = BowserCall.browserCall(); //Webdriver

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Forgot Your Password?")));

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[2]/div/input[1]")).click();
        driver.findElement(By.linkText("Forgot Your Password?")).click();
       // driver.findElement(By.partialLinkText("ur Password?")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("GroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));

     WebElement currencyElement = driver.findElement(By.id("GroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
      Select currencyDropdown = new Select(currencyElement);

      //  currencyDropdown.selectByIndex(5);

       // currencyDropdown.selectByVisibleText("EUR");

        currencyDropdown.selectByValue("OMR");

        WebElement adultElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));

        Select adultDropdown = new Select(adultElement);

    }
}
