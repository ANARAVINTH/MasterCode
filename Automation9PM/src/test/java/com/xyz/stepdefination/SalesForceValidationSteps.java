package com.xyz.stepdefination;

import Helper.DropdownHelperClass;
import Helper.TextBoxHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BowserCall;
import reusable.ExcelHandling;

import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class SalesForceValidationSteps {

      WebDriver driver;
      String userName ="";

      private TextBoxHelper textBoxHelper;
      private DropdownHelperClass dropdownHelperClass;

    @Given("User naviagte to URL")
    public void user_naviagte_to_url() throws IOException {

        driver = BowserCall.browserCall();
        dropdownHelperClass= DropdownHelperClass.getInstance(driver);
        dropdownHelperClass.selectByIndexPosition(By.xpath("//"),1);
    }

    @When("handle it")
    public void handle(){

        WebElement footer = driver.findElement(By.id("nav_menu-2"));

        List<WebElement> clickLinks= footer.findElements(By.tagName("a"));

        for (WebElement e:clickLinks){
          String clic=  Keys.chord(Keys.CONTROL,Keys.ENTER);
            e.sendKeys(clic);
        }

       Set<String> winProp = driver.getWindowHandles();

       for (String prop:winProp){
           driver.switchTo().window(prop);
           System.out.println(driver.getTitle());
       }

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

       wait.pollingEvery(Duration.ofSeconds(10));
       wait.ignoring(NoSuchElementException.class);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("input.input.r4.wide.mb16.mt8.username[id$='me']")));




    }

    @When("Handle the table")
    public void tableHandling(){

//      WebElement tableElement =  driver.findElement(By.xpath("//table[@class='infobox vcard']"));
//
//     int columnOne = tableElement.findElements(By.tagName("th")).size();
//      for(int i =0 ;i<columnOne;i++ ){
//
//         String columnOneValue = tableElement.findElements(By.tagName("th")).get(i).getText();
//          System.out.println(columnOneValue);
//      }
//
//      driver.findElement(By.tagName("//tr/td[2]")).sendKeys();


    List<WebElement>  key=  driver.findElements(By.xpath("//table[@class='infobox vcard']/tbody/tr/th"));
    List<WebElement> value = driver.findElements(By.xpath("//table[@class='infobox vcard']/tbody/tr/td[not(contains(@class,'-image logo'))]"));

   Map<String,String> map = new HashMap<String,String>();

   for(int i=0;i<key.size();i++){

       //put - ?
   }

   //scanner --> key (type)

        //if -->>

        //for -->

        //if

        driver.findElements(By.cssSelector("#manager"));
        driver.findElements(By.cssSelector(".nonscrollable.mt8"));



    }

    @When("Handle the frame")
    public void handle_the_frame() {

        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);

        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
       WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
        actions.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();
        WebElement amazon =driver.findElement(By.id("nav-link-accountList"));
        actions.clickAndHold(amazon).build().perform();
        driver.findElement(By.partialLinkText("Baby Wishlist")).click();

        //element not interatable exception

    }

    @When("Select the specific month")
    public void selectMonth(){

        driver.findElement(By.className("ui-datepicker-trigger")).click();

        while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/descendant::div[2]")).getText().contains("December"))
        {
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

        }

       String value= driver.findElement(By.id("marketDate_2")).getAttribute("style");
        if(value.contains("0.5")){

        }
        else{

        }
        String expectedResult ="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        String actualResult = driver.findElement(By.id("")).getText();

        Assert.assertEquals(expectedResult,actualResult);

    }

    @When("User selects the value from the dropdown")
    public void selectValue(){

        driver.findElement(By.id("flying_from_N")).click();

        WebElement toDropdown = driver.findElement(By.name("flying_from"));

        toDropdown.sendKeys("che");

        int i=0;
        while (i<4){
            toDropdown.sendKeys(Keys.ARROW_DOWN);
           i++;
        }

        toDropdown.sendKeys(Keys.ENTER);

           }


    @When("User Reterives the values from dropdown")
    public void user_reterives_the_values_from_dropdown() {

       WebElement currencyDropdown = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
       int currencyDropdownSize = currencyDropdown.findElements(By.tagName("option")).size();

       for(int i=0;i<currencyDropdownSize-1;i++){
           String values=currencyDropdown.findElements(By.tagName("option")).get(i).getText();
           System.out.println(values);
       }

       List<WebElement> dropdown = currencyDropdown.findElements(By.tagName("option"));

       List<String> dropValue = new ArrayList<String>();

       for (WebElement e:dropdown){
           dropValue.add(e.getText());
       }







    }

    @When("Select the value from Auto suggestive dropdown")
    public void select_the_value_from_auto_suggestive_dropdown() {

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        WebElement toDropdown = driver.findElement(By.id("glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
        toDropdown.findElement(By.xpath("//a[@value='MAA']")).click();

        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();

    }



    @Given("XYZ")
   public  void m1(){

   driver.findElement(By.id("")).sendKeys(userName);
   }

   @When("User Enter the us {string} and pw {string}")
   public void enterUsernamePassword(String userName , String password) throws IOException {

        textBoxHelper.setText(By.id("username"),"Aravinth");
        textBoxHelper.setText(By.id("password"),"123");


  //  driver.findElement().sendKeys(ExcelHandling.retriveData("logindetails",0,0));
   // driver.findElement(By.id("password")).sendKeys(ExcelHandling.retriveData("logindetails",0,1));

   }

   @Then("user navigate to homepage")
   public void homepage(){

   }

   @Given("User Navigates to the salesforce")
   public void navigateToSalesforce() throws IOException {

      driver = BowserCall.browserCall();
      textBoxHelper=TextBoxHelper.getInstance(driver);

   }

   @Then("Validate the error message")
   public void errorMessageValidation(){


   }

   @And("User clicks the login button")
   public void clickLogin(){

     String keyAction = Keys.chord(Keys.CONTROL , Keys.ENTER);
     driver.findElement(By.id("Login")).sendKeys(keyAction);

    driver.findElement(By.className("referenceComponent reference parbase section"));
    driver.findElement(By.className("cq-dd-paragraph"));

    driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Aravinth");
   }

   public  void testDate(){


   }

}
