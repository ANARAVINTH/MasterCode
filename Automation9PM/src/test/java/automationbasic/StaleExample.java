package automationbasic;

import org.openqa.selenium.*;
import reusable.BowserCall;

import java.io.IOException;

public class StaleExample {


    public static void main(String[] args) throws IOException {

       WebDriver driver = BowserCall.browserCall();

       WebElement user = driver.findElement(By.cssSelector("#username"));
       WebElement pass = driver.findElement(By.id("password"));
       user.sendKeys("123");
        pass.sendKeys("123");

       driver.navigate().refresh();
        try {
            user.sendKeys("Aravinth");
            pass.sendKeys("123");
        }
        catch(StaleElementReferenceException e){
             user = driver.findElement(By.cssSelector("#username"));
             pass = driver.findElement(By.id("password"));
            user.sendKeys("Aravinth");
            pass.sendKeys("123");
        }
        catch(Exception t){
            t.printStackTrace();
        }

        String s = "abc";
        int i = Integer.parseInt(s);

        //Number formate Excpeption


        String s1 = "";
        s1.length();  //Null point exception


    }
}
