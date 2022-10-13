package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelperClass {

    private static DropdownHelperClass dropdownHelperClass;
    private static WebDriver webDriver;

    private DropdownHelperClass(WebDriver driver){
        webDriver = driver ;
    }

    public static DropdownHelperClass getInstance(WebDriver driver){

        if(driver.hashCode()!=webDriver.hashCode() ) {
            dropdownHelperClass = new DropdownHelperClass(driver);
        }
        return dropdownHelperClass;
    }

    public void selectByVisibleTextValue(By locator , String textValue){

        Select select = new Select(webDriver.findElement(locator)) ;
        select.selectByVisibleText(textValue);

    }

    public void selectByIndexPosition(By locator,int position){
        Select select = new Select(webDriver.findElement(locator)) ;
        select.selectByIndex(position);
    }




}
