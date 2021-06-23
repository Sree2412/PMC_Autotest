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
    @FindBy(xpath = "//*[@id=\"ui-panel-0-content\"]/div/div/div[1]/span[1]/label")
    WebElement DatabaseName;
    @FindBy(xpath = "//*[@id=\"ui-panel-0-content\"]/div/div/div[1]/span[2]/label")
    WebElement Productionname;
    @FindBy(xpath = "//*[@id=\"ui-panel-0-content\"]/div/div/div[1]/span[3]/label")
    WebElement ListorBatch;
    @FindBy(xpath = "//*[@id=\"ui-panel-0-content\"]/div/div/div[1]/span[4]/label")
    WebElement Totaldoccount;
    @FindBy(xpath = "//*[@id=\"ui-panel-0-content\"]/div/div/div[1]/span[5]/label")
    WebElement Redacteddoccount;
    @FindBy(xpath = "//*[@id=\"ui-panel-0-content\"]/div/div/div[1]/span[6]/label")
    WebElement Exceptiondoccount;
    @FindBy(xpath = "//*[@id=\"ui-panel-0-content\"]/div/div/div[1]/span[6]/label")
    WebElement Blackoutnativelyredacteddoccount;
    @FindBy(xpath = "//*[@id=\"ui-panel-0-content\"]/div/div/div[2]/div[2]/span/label")
    WebElement Unreadabledoccount;
    @FindBy(xpath = "//*[@id=\"ui-panel-0-content\"]/div/div/div[2]/div[5]/span/label")
    WebElement Priveilegedoccount;
    @FindBy(xpath = "//*[@id=\"ui-panel-0-content\"]/div/div/div[2]/div[8]/span/label")
    WebElement Emptyfiledoccount;
    @FindBy(xpath = "//*[@id=\"ui-panel-1-content\"]/div/div/div[1]/span[1]/label")
    WebElement ProductionDAT;
    @FindBy(xpath = "//*[@id=\"ui-panel-1-content\"]/div/div/div[1]/span[2]/label")
    WebElement ProductionDateformat;
    @FindBy(xpath = "//*[@id=\"ui-panel-1-content\"]/div/div/div[1]/span[3]/label")
    WebElement Productiontimeformat;
    @FindBy(xpath = "//*[@id=\"ui-panel-1-content\"]/div/div/div[1]/span[4]/label")
    WebElement Productiontype;
    @FindBy(xpath = "//*[@id=\"ui-panel-1-content\"]/div/div/div[1]/span[5]/label")
    WebElement Sortorder;
    @FindBy(xpath = "//*[@id=\"ui-panel-1-content\"]/div/div/div[1]/span[6]/label")
    WebElement Preproduceddochandling;
    @FindBy(xpath = "//*[@id=\"ui-panel-1-content\"]/div/div/div[1]/span[7]/label")
    WebElement Familyassociation;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[1]/span[1]/label")
    WebElement Redactionlayer;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[1]/span[1]/label")
    WebElement Markupset;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[1]/span[2]/label")
    WebElement Text;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[1]/span[3]/label")
    WebElement Imageredactionlabel;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[1]/span[4]/label")
    WebElement Audio;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[1]/span[4]/label")
    WebElement BlackoutRedactionsText;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[1]/span[5]/label")
    WebElement Redactedwithfamily;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-5-content\"]/div/div[1]/span[1]/label")
    WebElement Unreadableidentifier;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-5-content\"]/div/div[1]/span[2]/label")
    WebElement Unreadableplaceholdertext;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-5-content\"]/div/div[1]/span[3]/label")
    WebElement Unreadablewithfamilyhandling;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-6-content\"]/div/div[1]/span[1]/label")
    WebElement PrivielegeId;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-6-content\"]/div/div[1]/span[2]/label")
    WebElement Privielegeplaceholdertext;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-6-content\"]/div/div[1]/span[3]/label")
    WebElement Privielegewithfamilymemberhandling;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-7-content\"]/div/div[1]/span[1]/label")
    WebElement Emptyfileid;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-7-content\"]/div/div[1]/span[2]/label")
    WebElement Emptyfile;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-8-content\"]/div/div[1]/span[1]/label")
    WebElement nativefiles;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-8-content\"]/div/div[1]/span[2]/label")
    WebElement Tifffailure;
    @FindBy(xpath = "//*[@id=\"ui-panel-3-content\"]/div/div/div[1]/span[1]/label")
    WebElement spreadsheetfiles;
    @FindBy(xpath = "//*[@id=\"ui-panel-3-content\"]/div/div/div[1]/span[2]/label")
    WebElement presentationfiles;
    @FindBy(xpath = "//*[@id=\"ui-panel-3-content\"]/div/div/div[1]/span[3]/label")
    WebElement otherfiles;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[1]/span[1]/label")
    WebElement Productionnumbering;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[1]/span[2]/label")
    WebElement Prefix;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[1]/span[3]/label")
    WebElement suffix;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[2]/div[4]/span/label")
    WebElement pagesuffixpadding;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[1]/span[4]/label")
    WebElement Startingnumber;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[2]/div[7]/span/label")
    WebElement Productionbatespadding;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[1]/span[5]/label")
    WebElement Productionbatespreview;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[1]/span[6]/label")
    WebElement Useexistingfield;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[1]/span[7]/label")
    WebElement Brandingfont;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-9-content\"]/div/div[1]/div[1]/span/label")
    WebElement Topleft;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-9-content\"]/div/div[2]/div[1]/span/label")
    WebElement Topmiddle;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-9-content\"]/div/div[3]/div[1]/span/label")
    WebElement Topright;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-9-content\"]/div/div[1]/div[3]/span/label")
    WebElement Bottomleft;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-9-content\"]/div/div[2]/div[3]/span/label")
    WebElement Bottommiddle;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-9-content\"]/div/div[3]/div[3]/span/label")
    WebElement Bottomright;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[3]/span/label")
    WebElement Conffieldname;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[5]/span[1]/label")
    WebElement workspace1;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[7]/span[1]/label")
    WebElement Brandingmessage1;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[5]/span[2]/label")
    WebElement workspace2;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[7]/span[2]/label")
    WebElement Brandingmessage2;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[5]/span[3]/label")
    WebElement workspace3;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[7]/span[3]/label")
    WebElement Brandingmessage3;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[5]/span[4]/label")
    WebElement workspace4;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[7]/span[4]/label")
    WebElement Brandingmessage4;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[5]/span[5]/label")
    WebElement workspace5;
    @FindBy(xpath = "//*[@id=\"ui-panel-4-content\"]/div/div/div[7]/span[5]/label")
    WebElement Brandingmessage5;
    @FindBy(xpath = "//*[@id=\"ui-panel-5-content\"]/div/div/div[2]/span[1]/label")
    WebElement Loadfiledelimiters;
    @FindBy(xpath = "//*[@id=\"ui-panel-5-content\"]/div/div/div[2]/span[2]/label")
    WebElement Loadfileencoding;
    @FindBy(xpath = "//*[@id=\"ui-panel-5-content\"]/div/div/div[2]/span[3]/label")
    WebElement Imagefiledeliveryformat;
    @FindBy(xpath = "//*[@id=\"ui-panel-5-content\"]/div/div/div[2]/span[4]/label")
    WebElement Textfiledeliveryformat;
    @FindBy(xpath = "//*[@id=\"ui-panel-5-content\"]/div/div/div[2]/span[5]/label")
    WebElement Nativefiledeliveryformat;
    @FindBy(xpath = "//*[@id=\"ui-panel-6-content\"]/div/div/div/div[1]/span[1]/label")
    WebElement Imagefolder;
    @FindBy(xpath = "//*[@id=\"ui-panel-6-content\"]/div/div/div/div[1]/span[2]/label")
    WebElement Textfolder;
    @FindBy(xpath = "//*[@id=\"ui-panel-6-content\"]/div/div/div/div[1]/span[3]/label")
    WebElement Nativesfolder;
    @FindBy(xpath = "//*[@id=\"ui-panel-6-content\"]/div/div/div/div[1]/span[4]/label")
    WebElement Loadfilesfolder;
    @FindBy(xpath = "//*[@id=\"ui-panel-6-content\"]/div/div/div/div[1]/span[5]/label")
    WebElement Pathprefix;
    @FindBy(xpath = "//*[@id=\"ui-panel-6-content\"]/div/div/div/div[1]/span[6]/label")
    WebElement pdffilesfolder;





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
            Thread.sleep(3000);
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
            Thread.sleep(3000);
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
            Thread.sleep(3000);
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
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-2-content\"]/div/div[2]/span/input"))).sendKeys("Test001");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-3-content\"]/div/div[2]/span/input"))).sendKeys("Test001");

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
            Thread.sleep(3000);
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
            Thread.sleep(3000);
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
            Thread.sleep(3000);
            waitForElement(driver, 50, driver.findElement(By.cssSelector("#toast-container")));
           boolean b = driver.getPageSource().contains("Unable to save form. A production form named \"test1\" already exists for this HCode.");
            return b;
        } catch (Exception e) {
            return false;
        }

    }


    public void mouseovertext_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        waitForElement(driver, 10, Blackoutnativelyredacteddoccount);
        String actualTooltip74 = Blackoutnativelyredacteddoccount.getAttribute("title");
        String expectedTooltip74 = "Blackout Redacted Document Count";
        actualTooltip74.equals(expectedTooltip74);
        if(actualTooltip74.equals(expectedTooltip74)) {
            System.out.println("Blackout Redacted Document Count verified");
        }
        waitForElement(driver, 10, BlackoutRedactionsText);
        String actualTooltip72 = BlackoutRedactionsText.getAttribute("title");
        String expectedTooltip72 = "Blackout Redactions Text";
        actualTooltip72.equals(expectedTooltip72);
        if(actualTooltip72.equals(expectedTooltip72)) {
            System.out.println("Blackout Redactions Text verified");
        }
        waitForElement(driver, 10, Markupset);
        String actualTooltip73 = Markupset.getAttribute("title");
        String expectedTooltip73 = "Markup Set";
        actualTooltip73.equals(expectedTooltip73);
        if(actualTooltip73.equals(expectedTooltip73)) {
            System.out.println("Markup Set verified");
        }


    }
    public void mouseovertext_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        waitForElement(driver, 10, Blackoutnativelyredacteddoccount);
        String actualTooltip74 = Blackoutnativelyredacteddoccount.getAttribute("title");
        String expectedTooltip74 = "Blackout Redacted Document Count";
        actualTooltip74.equals(expectedTooltip74);
        if(actualTooltip74.equals(expectedTooltip74)) {
            System.out.println("Blackout Redacted Document Count verified");
        }
        waitForElement(driver, 10, BlackoutRedactionsText);
        String actualTooltip72 = BlackoutRedactionsText.getAttribute("title");
        String expectedTooltip72 = "Blackout Redactions Text";
        actualTooltip72.equals(expectedTooltip72);
        if(actualTooltip72.equals(expectedTooltip72)) {
            System.out.println("Blackout Redactions Text verified");
        }
        waitForElement(driver, 10, Markupset);
        String actualTooltip73 = Markupset.getAttribute("title");
        String expectedTooltip73 = "Markup Set";
        actualTooltip73.equals(expectedTooltip73);
        if(actualTooltip73.equals(expectedTooltip73)) {
            System.out.println("Markup Set verified");
        }


    }
    public void mouseovertext_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        waitForElement(driver, 10, Exceptiondoccount);
        String actualTooltip6 = Exceptiondoccount.getAttribute("title");
        String expectedTooltip6 = "Exception Document Count";
        if(actualTooltip6.equals(expectedTooltip6)) {
            System.out.println("Exception Document Count verified");
        }
        waitForElement(driver, 10, Audio);
        String actualTooltip20 = Audio.getAttribute("title");
        String expectedTooltip20 = "Audio Redactions";
        actualTooltip20.equals(expectedTooltip20);
        if(actualTooltip20.equals(expectedTooltip20)) {
            System.out.println("Audio verified");
        }
        waitForElement(driver, 10, Redactionlayer);
        String actualTooltip17 = Redactionlayer.getAttribute("title");
        String expectedTooltip17 = "Redaction Layer";
        actualTooltip17.equals(expectedTooltip17);
        if(actualTooltip17.equals(expectedTooltip17)) {
            System.out.println("Redaction Layer verified");
        }



    }
    public void mouseovertext_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        waitForElement(driver, 10, Exceptiondoccount);
        String actualTooltip6 = Exceptiondoccount.getAttribute("title");
        String expectedTooltip6 = "Exception Document Count";
        actualTooltip6.equals(expectedTooltip6);
        if(actualTooltip6.equals(expectedTooltip6)) {
            System.out.println("Exception Document Count verified");
        }
        waitForElement(driver, 10, Audio);
        String actualTooltip20 = Audio.getAttribute("title");
        String expectedTooltip20 = "Audio Redactions";
        actualTooltip20.equals(expectedTooltip20);
        if(actualTooltip20.equals(expectedTooltip20)) {
            System.out.println("Audio is verified");
        }
        waitForElement(driver, 10, Redactionlayer);
        String actualTooltip17 = Redactionlayer.getAttribute("title");
        String expectedTooltip17 = "Redaction Layer";
        actualTooltip17.equals(expectedTooltip17);
        if(actualTooltip17.equals(expectedTooltip17)) {
            System.out.println("Redaction Layer is verified");
        }


    }
    public boolean verifymouseovertext() {

        try {
            Thread.sleep(3000);
            waitForElement(driver, 10, DatabaseName);
            String actualTooltip1 = DatabaseName.getAttribute("title");
            String expectedTooltip1 = "Database Name";
            actualTooltip1.equals(expectedTooltip1);
            waitForElement(driver, 10, Productionname);
            String actualTooltip2 = Productionname.getAttribute("title");
            String expectedTooltip2 = "Production Name";
            actualTooltip2.equals(expectedTooltip2);
            waitForElement(driver, 10, ListorBatch);
            String actualTooltip3 = ListorBatch.getAttribute("title");
            String expectedTooltip3 = "List or Batch Set/Production Source";
            actualTooltip3.equals(expectedTooltip3);
            waitForElement(driver, 10, Totaldoccount);
            String actualTooltip4 = Totaldoccount.getAttribute("title");
            String expectedTooltip4 = "Document Count";
            actualTooltip4.equals(expectedTooltip4);
            waitForElement(driver, 10, Redacteddoccount);
            String actualTooltip5 = Redacteddoccount.getAttribute("title");
            String expectedTooltip5 = "Redacted Document Count";
            actualTooltip5.equals(expectedTooltip5);
            waitForElement(driver, 10, Unreadabledoccount);
            String actualTooltip7 = Unreadabledoccount.getAttribute("title");
            String expectedTooltip7 = "Unreadable Document Count";
            actualTooltip7.equals(expectedTooltip7);
            waitForElement(driver, 10, Priveilegedoccount);
            String actualTooltip8 = Priveilegedoccount.getAttribute("title");
            String expectedTooltip8 = "Priv Document Count";
            actualTooltip8.equals(expectedTooltip8);
            waitForElement(driver, 10, Emptyfiledoccount);
            String actualTooltip9 = Emptyfiledoccount.getAttribute("title");
            String expectedTooltip9 = "Empty File Document Count";
            actualTooltip9.equals(expectedTooltip9);
            waitForElement(driver, 10, ProductionDAT);
            String actualTooltip10 = ProductionDAT.getAttribute("title");
            String expectedTooltip10 = "Production DAT/TIFF/Text Time Zone";
            actualTooltip10.equals(expectedTooltip10);
            waitForElement(driver, 10, ProductionDateformat);
            String actualTooltip11 = ProductionDateformat.getAttribute("title");
            String expectedTooltip11 = "Production Date Format";
            actualTooltip11.equals(expectedTooltip11);
            waitForElement(driver, 10, Productiontimeformat);
            String actualTooltip12 = Productiontimeformat.getAttribute("title");
            String expectedTooltip12 = "Production Time Format";
            actualTooltip12.equals(expectedTooltip12);
            waitForElement(driver, 10, Productiontype);
            String actualTooltip13 = Productiontype.getAttribute("title");
            String expectedTooltip13 = "Production Type";
            actualTooltip13.equals(expectedTooltip13);
            waitForElement(driver, 10, Sortorder);
            String actualTooltip14 = Sortorder.getAttribute("title");
            String expectedTooltip14 = "Sort Order";
            actualTooltip14.equals(expectedTooltip14);
            waitForElement(driver, 10, Preproduceddochandling);
            String actualTooltip15 = Preproduceddochandling.getAttribute("title");
            String expectedTooltip15 = "Previously Produced Docs Handling";
            actualTooltip15.equals(expectedTooltip15);
            waitForElement(driver, 10, Familyassociation);
            String actualTooltip16 = Familyassociation.getAttribute("title");
            String expectedTooltip16 = "Family Association";
            actualTooltip16.equals(expectedTooltip16);
            waitForElement(driver, 10, Text);
            String actualTooltip18 = Text.getAttribute("title");
            String expectedTooltip18 = "Redacted File Handling Text";
            actualTooltip18.equals(expectedTooltip18);
            waitForElement(driver, 10, Imageredactionlabel);
            String actualTooltip19 = Imageredactionlabel.getAttribute("title");
            String expectedTooltip19 = "Image Redaction Label";
            actualTooltip19.equals(expectedTooltip19);
            waitForElement(driver, 10, Redactedwithfamily);
            String actualTooltip21 = Redactedwithfamily.getAttribute("title");
            String expectedTooltip21 = "Redacted with Family";
            actualTooltip21.equals(expectedTooltip21);
            waitForElement(driver, 10, Unreadableidentifier);
            String actualTooltip22 = Unreadableidentifier.getAttribute("title");
            String expectedTooltip22 = "Unreadable Identifier (field/choice)";
            actualTooltip22.equals(expectedTooltip22);
            waitForElement(driver, 10, Unreadableplaceholdertext);
            String actualTooltip23 = Unreadableplaceholdertext.getAttribute("title");
            String expectedTooltip23 = "Exception Docs";
            actualTooltip23.equals(expectedTooltip23);
            waitForElement(driver, 10, Unreadablewithfamilyhandling);
            String actualTooltip71 = Unreadablewithfamilyhandling.getAttribute("title");
            String expectedTooltip71 = "Unreadable with Family Handling";
            actualTooltip71.equals(expectedTooltip71);
            waitForElement(driver, 10, PrivielegeId);
            String actualTooltip24 = PrivielegeId.getAttribute("title");
            String expectedTooltip24 = "Privilege Identifier (field/choice)";
            actualTooltip24.equals(expectedTooltip24);
            waitForElement(driver, 10, Privielegeplaceholdertext);
            String actualTooltip25 = Privielegeplaceholdertext.getAttribute("title");
            String expectedTooltip25 = "Exception Docs";
            actualTooltip25.equals(expectedTooltip25);
            waitForElement(driver, 10, Privielegewithfamilymemberhandling);
            String actualTooltip26 = Privielegewithfamilymemberhandling.getAttribute("title");
            String expectedTooltip26 = "Privilege with Family Member Handling";
            actualTooltip26.equals(expectedTooltip26);
            waitForElement(driver, 10, Emptyfileid);
            String actualTooltip27 = Emptyfileid.getAttribute("title");
            String expectedTooltip27 = "Empty File Identifier";
            actualTooltip27.equals(expectedTooltip27);
            waitForElement(driver, 10, Emptyfile);
            String actualTooltip28 = Emptyfile.getAttribute("title");
            String expectedTooltip28 = "Empty Files";
            actualTooltip28.equals(expectedTooltip28);
            waitForElement(driver, 10, nativefiles);
            String actualTooltip29 = nativefiles.getAttribute("title");
            String expectedTooltip29 = "Native Files";
            actualTooltip29.equals(expectedTooltip29);
            waitForElement(driver, 10, Tifffailure);
            String actualTooltip30 = Tifffailure.getAttribute("title");
            String expectedTooltip30 = "Tiff failure/Exception Files";
            actualTooltip30.equals(expectedTooltip30);
            waitForElement(driver, 10, spreadsheetfiles);
            String actualTooltip31 = spreadsheetfiles.getAttribute("title");
            String expectedTooltip31 = "Spreadsheets";
            actualTooltip31.equals(expectedTooltip31);
            waitForElement(driver, 10, presentationfiles);
            String actualTooltip32 = presentationfiles.getAttribute("title");
            String expectedTooltip32 = "Presentation Files";
            actualTooltip32.equals(expectedTooltip32);
            waitForElement(driver, 10, otherfiles);
            String actualTooltip33 = otherfiles.getAttribute("title");
            String expectedTooltip33 = "Word/Text Files";
            actualTooltip33.equals(expectedTooltip33);
            waitForElement(driver, 10, Productionnumbering);
            String actualTooltip34 = Productionnumbering.getAttribute("title");
            String expectedTooltip34 = "Production Numbering Method";
            actualTooltip34.equals(expectedTooltip34);
            waitForElement(driver, 10, Prefix);
            String actualTooltip35 = Prefix.getAttribute("title");
            String expectedTooltip35 = "Bates Prefix";
            actualTooltip35.equals(expectedTooltip35);
            waitForElement(driver, 10, suffix);
            String actualTooltip36 = suffix.getAttribute("title");
            String expectedTooltip36 = "Suffix (no spaces)";
            actualTooltip36.equals(expectedTooltip36);
            waitForElement(driver, 10, Startingnumber);
            String actualTooltip37 = Startingnumber.getAttribute("title");
            String expectedTooltip37 = "Starting Number";
            actualTooltip37.equals(expectedTooltip37);
            waitForElement(driver, 10, pagesuffixpadding);
            String actualTooltip38 = pagesuffixpadding.getAttribute("title");
            String expectedTooltip38 = "Page Suffix Padding";
            actualTooltip38.equals(expectedTooltip38);
            waitForElement(driver, 10, Productionbatespadding);
            String actualTooltip39 = Productionbatespadding.getAttribute("title");
            String expectedTooltip39 = "Bates Padding";
            actualTooltip39.equals(expectedTooltip39);
            waitForElement(driver, 10, Productionbatespreview);
            String actualTooltip40 = Productionbatespreview.getAttribute("title");
            String expectedTooltip40 = "Productions Bates Preview";
            actualTooltip40.equals(expectedTooltip40);
            waitForElement(driver, 10, Useexistingfield);
            String actualTooltip41 = Useexistingfield.getAttribute("title");
            String expectedTooltip41 = "Use Existing Fields";
            actualTooltip41.equals(expectedTooltip41);
            waitForElement(driver, 10, Brandingfont);
            String actualTooltip42 = Brandingfont.getAttribute("title");
            String expectedTooltip42 = "Branding Font";
            actualTooltip42.equals(expectedTooltip42);
            waitForElement(driver, 10, Topleft);
            String actualTooltip43 = Topleft.getAttribute("title");
            String expectedTooltip43 = "Standard: Blank, if Custom select the option and edit as needed";
            actualTooltip43.equals(expectedTooltip43);
            waitForElement(driver, 10, Topmiddle);
            String actualTooltip44 = Topmiddle.getAttribute("title");
            String expectedTooltip44 = "Standard: Blank, if Custom select the option and edit as needed";
            actualTooltip44.equals(expectedTooltip44);
            waitForElement(driver, 10, Topright);
            String actualTooltip45 = Topright.getAttribute("title");
            String expectedTooltip45 = "Standard: Blank, if Custom select the option and edit as needed";
            actualTooltip45.equals(expectedTooltip45);
            waitForElement(driver, 10, Bottomleft);
            String actualTooltip46 = Bottomleft.getAttribute("title");
            String expectedTooltip46 = "Bottom Left Branding";
            actualTooltip46.equals(expectedTooltip46);
            waitForElement(driver, 10, Bottommiddle);
            String actualTooltip47 = Bottommiddle.getAttribute("title");
            String expectedTooltip47 = "Standard: Blank, if Custom select the option and edit as needed";
            actualTooltip47.equals(expectedTooltip47);
            waitForElement(driver, 10, Bottomright);
            String actualTooltip48 = Bottomright.getAttribute("title");
            String expectedTooltip48 = "Bottom Right Branding";
            actualTooltip48.equals(expectedTooltip48);
            waitForElement(driver, 10, Conffieldname);
            String actualTooltip49 = Conffieldname.getAttribute("title");
            String expectedTooltip49 = "Confidentiality Field Name";
            actualTooltip49.equals(expectedTooltip49);
            waitForElement(driver, 10, workspace1);
            String actualTooltip50 = workspace1.getAttribute("title");
            String expectedTooltip50 = "Workspace Value 1";
            actualTooltip50.equals(expectedTooltip50);
            waitForElement(driver, 10, workspace2);
            String actualTooltip51 = workspace2.getAttribute("title");
            String expectedTooltip51 = "Workspace Value 2";
            actualTooltip51.equals(expectedTooltip51);
            waitForElement(driver, 10, workspace3);
            String actualTooltip52 = workspace3.getAttribute("title");
            String expectedTooltip52 = "Workspace Value 3";
            actualTooltip52.equals(expectedTooltip52);
            waitForElement(driver, 10, workspace4);
            String actualTooltip53 = workspace4.getAttribute("title");
            String expectedTooltip53 = "Workspace Value 4";
            actualTooltip53.equals(expectedTooltip53);
            waitForElement(driver, 10, workspace5);
            String actualTooltip54 = workspace5.getAttribute("title");
            String expectedTooltip54 = "Workspace Value 5";
            actualTooltip54.equals(expectedTooltip54);
            waitForElement(driver, 10, Brandingmessage1);
            String actualTooltip55 = Brandingmessage1.getAttribute("title");
            String expectedTooltip55 = "Branding Message 1:";
            actualTooltip55.equals(expectedTooltip55);
            waitForElement(driver, 10, Brandingmessage2);
            String actualTooltip56 = Brandingmessage2.getAttribute("title");
            String expectedTooltip56 = "Branding Message 2";
            actualTooltip56.equals(expectedTooltip56);
            waitForElement(driver, 10, Brandingmessage3);
            String actualTooltip57 = Brandingmessage3.getAttribute("title");
            String expectedTooltip57 = "Branding Message 3";
            actualTooltip57.equals(expectedTooltip57);
            waitForElement(driver, 10, Brandingmessage4);
            String actualTooltip58 = Brandingmessage4.getAttribute("title");
            String expectedTooltip58 = "Branding Message 4";
            actualTooltip58.equals(expectedTooltip58);
            waitForElement(driver, 10, Brandingmessage5);
            String actualTooltip59 = Brandingmessage5.getAttribute("title");
            String expectedTooltip59 = "Branding Message 5";
            actualTooltip59.equals(expectedTooltip59);
            waitForElement(driver, 10, Loadfiledelimiters);
            String actualTooltip60 = Loadfiledelimiters.getAttribute("title");
            String expectedTooltip60 = "Dat File Delimeters";
            actualTooltip60.equals(expectedTooltip60);
            waitForElement(driver, 10, Loadfileencoding);
            String actualTooltip61 = Loadfileencoding.getAttribute("title");
            String expectedTooltip61 = "Load File Encoding";
            actualTooltip61.equals(expectedTooltip61);
            waitForElement(driver, 10, Imagefiledeliveryformat);
            String actualTooltip62 = Imagefiledeliveryformat.getAttribute("title");
            String expectedTooltip62 = "Image File Delivery Format";
            actualTooltip62.equals(expectedTooltip62);
            waitForElement(driver, 10, Textfiledeliveryformat);
            String actualTooltip63 = Textfiledeliveryformat.getAttribute("title");
            String expectedTooltip63 = "Text File Delivery Format";
            actualTooltip63.equals(expectedTooltip63);
            waitForElement(driver, 10, Nativefiledeliveryformat);
            String actualTooltip64 = Nativefiledeliveryformat.getAttribute("title");
            String expectedTooltip64 = "Native File Delivery Format";
            actualTooltip64.equals(expectedTooltip64);
            waitForElement(driver, 10, Imagefolder);
            String actualTooltip65 = Imagefolder.getAttribute("title");
            String expectedTooltip65 = "Image Folder";
            actualTooltip65.equals(expectedTooltip65);
            waitForElement(driver, 10, Textfolder);
            String actualTooltip66 = Textfolder.getAttribute("title");
            String expectedTooltip66 = "Text Folder";
            actualTooltip66.equals(expectedTooltip66);
            waitForElement(driver, 10, Nativesfolder);
            String actualTooltip67 = Nativesfolder.getAttribute("title");
            String expectedTooltip67 = "Natives Folder";
            actualTooltip67.equals(expectedTooltip67);
            waitForElement(driver, 10, Loadfilesfolder);
            String actualTooltip68 = Loadfilesfolder.getAttribute("title");
            String expectedTooltip68 = "Load Files Folder";
            actualTooltip68.equals(expectedTooltip68);
            waitForElement(driver, 10, Pathprefix);
            String actualTooltip69 = Pathprefix.getAttribute("title");
            String expectedTooltip69 = "Map Load Files Relative Path";
            actualTooltip69.equals(expectedTooltip69);
            waitForElement(driver, 10, pdffilesfolder);
            String actualTooltip70 = pdffilesfolder.getAttribute("title");
            String expectedTooltip70 = "PDF Folder";
            actualTooltip70.equals(expectedTooltip70);

            return true;
        } catch (Exception e) {
            return false;
        }

    }
}



