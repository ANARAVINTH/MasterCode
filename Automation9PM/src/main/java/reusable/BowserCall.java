package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BowserCall {

    private static WebDriver driver;
    public static WebDriver browserCall() throws IOException {

       String path = System.getProperty("user.dir");
        System.out.println(path);

        FileInputStream stream = new FileInputStream(new File("D:\\Selenium\\Automation9PM\\src\\main\\resources\\configfile\\config.properties"));

        Properties prop = new Properties();

        prop.load(stream);

        if(prop.getProperty("BrowserName").equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver",path+"/src/main/resources/Driver/chromedriver.exe") ;
            driver = new ChromeDriver() ;
        }
        else if(prop.getProperty("BrowserName").equals("Edge")){
            System.setProperty("webdriver.edge.driver",path+"/src/main/resources/Driver/edge.exe") ;
            driver = new EdgeDriver();
        }
        else{
            throw  new InvalidArgumentException("Pass the valid browser name");
        }

        driver.manage().deleteAllCookies();

        driver.get(prop.getProperty("ApplicationURL"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        return driver;
    }

    public static int m1(){

        int a =1;


        return a;
    }

    public static String m2(){
        String s ="LearnMore";
        int a =1;
        return s;
    }

    public void m5(){
        List<String> rowOne = new ArrayList<String>();
        List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath("//div[@class='item-row item-block meta-inventorsInfoGroup']/div/div[3]"));
        for(WebElement e:list){
           rowOne.add(e.getText());
        }

    }

}
