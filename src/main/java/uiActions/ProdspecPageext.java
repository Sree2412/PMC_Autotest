package uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.testBase;

import java.math.BigInteger;
import java.security.SecureRandom;






/* For every new class always extend from testBase*/
    public class ProdspecPageext  extends testBase {


    public final static Logger log = Logger.getLogger(uiActions.HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/
    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-buttons > div > p-button > button")
    WebElement Savedraft;
    @FindBy(css = "#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")
    WebElement ProductionName;
    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div[1]/app-menu/div/a[1]")
    WebElement Home;


    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public ProdspecPageext(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String generateRandomString() {

        return "Autotest" + new BigInteger(120, new SecureRandom()).toString(32);
    }


    public void saveform() {
        ProdspecPage hcode = new ProdspecPage(driver);
        hcode.selecthcodefromdropdown();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        waitForElement(driver, 10, ProductionName);
        ProductionName.sendKeys(generateRandomString());
        log.info("Enter Production Name:-" + ProductionName.toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Savedraft)).click();
        log.info("Click Save Draft:-" + Savedraft.toString());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void saveform_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        saveform();

    }

    public void saveform_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        saveform();

    }

    public void saveform_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        saveform();

    }

    public void saveform_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        saveform();

    }

    public boolean verifysavedform() {
        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > app-root > app-main > div > div > div.layout-menu > app-menu > div > a:nth-child(1)"))).click();
            EditexistingPage editexistingpage = new EditexistingPage(driver);
            editexistingpage.editexistingform();
            editexistingpage.editexistingProdspecforms();
            String prodName = driver.findElement(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")).getAttribute("class");
            prodName.contains("Autotest" + new BigInteger(120, new SecureRandom()).toString(32));

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void cannontsaveform() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Savedraft)).click();
        log.info("Click Save Draft:-" + Savedraft.toString());

    }

    public void cannontsaveform_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        cannontsaveform();
    }

    public void cannontsaveform_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        cannontsaveform();
    }

    public void cannontsaveform_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        cannontsaveform();
    }

    public void cannontsaveform_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        cannontsaveform();
    }

    public boolean verifycannotsaveformwithoutprodname() {
        try {

            waitForElement(driver, 50, driver.findElement(By.cssSelector("#toast-container")));
            String popup = driver.findElement(By.cssSelector("#toast-container")).getText();
            popup.contains("The Production Name question must contain a value to submit this form");

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void cannotsaveformwohcode() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        waitForElement(driver, 10, ProductionName);
        ProductionName.sendKeys(generateRandomString());
        log.info("Enter Production Name:-" + ProductionName.toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Savedraft)).click();
        log.info("Click Save Draft:-" + Savedraft.toString());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cannotsaveformwohcode_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        cannotsaveformwohcode();

    }

    public void cannotsaveformwohcode_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        cannotsaveformwohcode();

    }

    public void cannotsaveformwohcode_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        cannotsaveformwohcode();

    }

    public void cannotsaveformwohcode_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        cannotsaveformwohcode();

    }

    public boolean verifycannotsaveformwithoutHcode() {
        try {

            waitForElement(driver, 50, driver.findElement(By.cssSelector("#toast-container")));
            String popup = driver.findElement(By.cssSelector("#toast-container")).getText();
            popup.contains("A Project H-Code must be selected before saving this form ");

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void unsavedchangewarningtosave() {
        saveform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select ProductionDAT = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        ProductionDAT.selectByVisibleText("Eastern Time (UTC -5:00)");
        log.info("Change ProductionDAT value:-" + ProductionDAT.toString());

    }

    public void unsavedchangewarningtosave_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        unsavedchangewarningtosave();

    }

    public void unsavedchangewarningtosave_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        unsavedchangewarningtosave();

    }

    public void unsavedchangewarningtosave_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        unsavedchangewarningtosave();

    }

    public void unsavedchangewarningtosave_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        unsavedchangewarningtosave();

    }

    public boolean verifyunsavedchangeswarningtosave() {
        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main/div/div/div[1]/app-menu/div/a[3]"))).click();

        } catch (UnhandledAlertException f) {
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                System.out.println("Alert data: " + alertText);
            } catch (NoAlertPresentException e) {
                e.printStackTrace();
            }
        }
        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main/div/div/div[1]/app-menu/div/a[1]"))).click();

        } catch (UnhandledAlertException f) {
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                System.out.println("Alert data: " + alertText);
            } catch (NoAlertPresentException e) {
                e.printStackTrace();
            }
        }
        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main/div/div/div[1]/app-menu/div/div/a"))).click();
        } catch (UnhandledAlertException f) {
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                System.out.println("Alert data: " + alertText);

            } catch (NoAlertPresentException e) {
                e.printStackTrace();
            }
        }
        try {
            driver.switchTo().alert().getText().contains("Changes you made may not be saved");
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    public void enableSubmitbutton(){
        ProdspecPage confirmcheck = new ProdspecPage(driver);
        confirmcheck.Generalprodreqcheckboxchecked();
        confirmcheck.redactionandplaceholderreqcheckboxchecked();
        confirmcheck.nativeimagingoptionscheckboxchecked();
        confirmcheck.brandinginfocheckboxchecked();
        confirmcheck.prodfilespeccheckboxchecked();
        confirmcheck.prodlocationcheckboxchecked();
       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-7-titlebar > p-header > div > user-confirmation-checkbox > i"))).click();
        confirmcheck.suffixdisplayonprodbatespreview();
        saveform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(1) > input"))).sendKeys("H45678");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(3) > input"))).sendKeys("Test001");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > div:nth-child(4) > span > input"))).sendKeys(Keys.UP);;
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > div:nth-child(6) > span > input"))).sendKeys(Keys.UP);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > div:nth-child(7) > span > input"))).sendKeys(Keys.UP);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > div:nth-child(9) > span > input"))).sendKeys(Keys.UP);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > div:nth-child(10) > span > input"))).sendKeys(Keys.UP);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > div:nth-child(12) > span > input"))).sendKeys(Keys.UP);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-2-content > div > div.ui-g-9.ng-tns-c92-7 > span > input"))).sendKeys("Test001");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-3-content > div > div.ui-g-9.ng-tns-c92-8 > span > input"))).sendKeys("Test001");

    }
    public void enableSubmitbutton_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        enableSubmitbutton();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-6-content > div > div:nth-child(3) > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();

    }
    public void enableSubmitbutton_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        enableSubmitbutton();

    }
    public void enableSubmitbutton_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        enableSubmitbutton();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-6-content > div > div:nth-child(3) > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();


    }
    public void enableSubmitbutton_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        enableSubmitbutton();
    }
    public boolean verifySubmitbuttonenabled() {
        try {

            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-buttons > div > div > button.btn.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-text-only"))).click();

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void prodnamelessthan5chars(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")).sendKeys("test");
        log.info("Enter Prod Name less than 5 chars:-" + "#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input".toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Savedraft)).click();
        log.info("Click Save Draft:-" + Savedraft.toString());


    }
    public void prodnamelessthan5chars_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        prodnamelessthan5chars();

    }
    public void prodnamelessthan5chars_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        prodnamelessthan5chars();

    }
    public void prodnamelessthan5chars_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        prodnamelessthan5chars();

    }
    public void prodnamelessthan5chars_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        prodnamelessthan5chars();

    }
    public boolean verifyprodnamelessthan5chars() {
        try {

            waitForElement(driver, 50, driver.findElement(By.cssSelector("#toast-container")));
            String popup = driver.findElement(By.cssSelector("#toast-container")).getText();
            popup.contains("The Production Name must be atleast 5 characters.");

            return true;
        } catch (Exception e) {
            return false;
        }

    }
    public void duplicateprodname(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ProdspecPage selecthcode =new ProdspecPage(driver);
        selecthcode.selecthcodefromdropdown();
        driver.findElement(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")).sendKeys("test1");
        log.info("Enter Prod Name:-" + "#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input".toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Savedraft)).click();
        log.info("Click Save Draft:-" + Savedraft.toString());


    }
    public void duplicateprodname_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        duplicateprodname();

    }
    public void duplicateprodname_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        duplicateprodname();

    }
    public void duplicateprodname_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        duplicateprodname();

    }
    public void duplicateprodname_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        duplicateprodname();

    }
    public boolean verifyduplicateprodname() {
        try {
            Thread.sleep(2000);
            waitForElement(driver, 50, driver.findElement(By.cssSelector("#toast-container")));
           boolean b = driver.getPageSource().contains("Unable to save form. A production form named \"test1\" already exists for this HCode.");
            return b;
        } catch (Exception e) {
            return false;
        }

    }

}



