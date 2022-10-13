package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxHelper {

    private static TextBoxHelper textBoxHelper;
    private  WebDriver wd;
    private WebElement element;

   private TextBoxHelper(WebDriver driver){
        wd = driver;
    }

    public static TextBoxHelper getInstance(WebDriver driver){

        textBoxHelper = new TextBoxHelper(driver);

        return textBoxHelper;
    }

    public  void setText(By locater,String value){
        element= wd.findElement(locater);
        element.sendKeys(value);
    }

    public String getTextValue(By locater){
        element= wd.findElement(locater);
        String value =element.getText();
       return value;
    }

    public  void clearTextvalue(By locater){
        element= wd.findElement(locater);
        element.clear();
    }


}
