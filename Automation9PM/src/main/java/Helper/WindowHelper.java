package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WindowHelper {

    private static WindowHelper dropdownHelperClass;
    private static WebDriver webDriver;

    private WindowHelper(WebDriver driver){
        webDriver = driver ;
    }

    public static WindowHelper getInstance(WebDriver driver){

        if(driver.hashCode()!=webDriver.hashCode() ) {
            dropdownHelperClass = new WindowHelper(driver);
        }
        return dropdownHelperClass;
    }

    //fixed wait

    private WebDriverWait getWait()  {

    //    Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(50));
        return wait;
    }
    private List<String> getWindowID(){

     List<String> windowIds = new ArrayList<>(webDriver.getWindowHandles()) ;

     return Collections.unmodifiableList(windowIds);
    }

    public  void switchToWindow(int index){
       List<String>windowsID = getWindowID();

       WebDriverWait wait =getWait();
       wait.until(ExpectedConditions.numberOfWindowsToBe(index));

        if(index < 0 || index >windowsID.size() ){
            throw new IllegalArgumentException("Index is not valid"+ index);
        }
        webDriver.switchTo().window(windowsID.get(index));
    }

    public void switchToParent(){
        List<String>windowsID = getWindowID();
        webDriver.switchTo().window(windowsID.get(0));

    }

    //once switch back to parent window all child window should be closed




}
