package automationbasic;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationClass {

    public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver","D:\\SeleniumFiles\\Drivers\\old.exe") ;

       WebDriver driver = new ChromeDriver() ;

        driver.get("https://login.salesforce.com/");

     //   driver.findElement(By.id("username")).sendKeys("Aravinth");

        driver.findElement(By.xpath("//input[@id='aravinth']")).sendKeys("123");
     //   driver.findElement(By.name("pw")).sendKeys("123");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
        driver.findElement(By.id("Login")).click();

       String actualErrorMessage = driver.findElement(By.id("error")).getText();
       String expectedErrorMessage = " check your username and password. If you still can't log in, contact your Salesforce administrator.";

       System.out.println(actualErrorMessage);
       if(actualErrorMessage.equals(expectedErrorMessage)){
           System.out.println("Error Message Matched");
       }
       else{
           System.out.println("Error Message Not matched");
       }


       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys("123");
    }

}
