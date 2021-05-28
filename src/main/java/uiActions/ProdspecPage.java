
package uiActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.testBase;

import java.util.concurrent.TimeUnit;


/* For every new class always extend from testBase*/
public class ProdspecPage  extends testBase {
    uiActions.HomePage Homepage;


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/
    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown > div > div.ui-dropdown-label-container.ng-tns-c80-8")
    WebElement HCodedropdown;





    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public ProdspecPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* Create all page action  methods here*/

    public void selecthcodefromdropdown() {

        waitForElement(driver, 10, HCodedropdown);
        log.info("Hcode value object found:-" + HCodedropdown.toString());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HCodedropdown.click();
        log.info("Click on Hcode :-" + HCodedropdown.toString());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement dialog = driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c80-8.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted"));
        WebElement wrapper = dialog.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c80-8.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div"));
        // find the listbox
        WebElement listbox = wrapper.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c80-8.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul"));
        WebElement pdropdown =listbox.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c80-8.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul > p-dropdownitem:nth-child(1)"));
        // find the 1st option
        WebElement option1 = pdropdown.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c80-8.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul > p-dropdownitem:nth-child(1) > li"));

        //click on the option1
        option1.click();
        // int x= option1.getLocation().getX();
        // int y = option1.getLocation().getY();
        //System.out.println("x cord" +x);
        //System.out.println("x cord" +y);
        log.info("Enter Hcode value object selected:-" + HCodedropdown.toString());

    }

    public void selecthcodefromdropdown_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        selecthcodefromdropdown();

    }

    public void selecthcodefromdropdown_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        selecthcodefromdropdown();

    }

    public void selecthcodefromdropdown_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        selecthcodefromdropdown();

    }
    public void selecthcodefromdropdown_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        selecthcodefromdropdown();

    }


    public void expandcollapsesections() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-0-label")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-label"))).click();
        log.info("clicked on minus button of production set details section:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-1-label")));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-label"))).click();
        log.info("clicked on minus button of general prod req info is:-" + driver.findElement(By.cssSelector("#ui-panel-1-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-2-label")));

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-2-label"))).click();
        log.info("clicked on minus button of Redaction and placeholder req is:-" + driver.findElement(By.cssSelector("#ui-panel-2-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-3-label")));

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-label"))).click();
        log.info("clicked on minus button of Native imaging option info is:-" + driver.findElement(By.cssSelector("#ui-panel-3-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-4-label")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-label"))).click();
        log.info("clicked on minus button of Branding info is:-" + driver.findElement(By.cssSelector("#ui-panel-4-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-5-label")));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-label"))).click();
        log.info("clicked on minus button of Prod file spec is:-" + driver.findElement(By.cssSelector("#ui-panel-5-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-6-label")));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-label"))).click();
        log.info("clicked on minus button of Prod location and foldering is:-" + driver.findElement(By.cssSelector("#ui-panel-6-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-7-label")));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-7-label"))).click();
        log.info("clicked on minus button of Special instruction is:-" + driver.findElement(By.cssSelector("#ui-panel-7-label")).toString());
    }

    public void expandcollapsesections_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        expandcollapsesections();

    }
    public void expandcollapsesections_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        expandcollapsesections();

    }
    public void expandcollapsesections_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        expandcollapsesections();

    }
    public void expandcollapsesections_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        expandcollapsesections();

    }

    public boolean verifyhcodedropdown() {
        try {
            waitForElement(driver, 5000, driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c80-8.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul > p-dropdownitem:nth-child(1) > li > span")));
            boolean b = driver.getPageSource().contains("H45678 - QA - H45678");

            return b;
        } catch (Exception e) {
            return false;
        }
    }



    public boolean verifyexpandcollapsebuttons() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-0-label")).getAttribute("class");
            className0.contains("ng-tns-c51-9 pi pi-plus");
            String className1 = driver.findElement(By.cssSelector("#ui-panel-1-label")).getAttribute("class");
            className1.contains("ng-tns-c51-9 pi pi-plus");
            String className2 = driver.findElement(By.cssSelector("#ui-panel-2-label")).getAttribute("class");
            className2.contains("ng-tns-c51-9 pi pi-plus");
            String className3 = driver.findElement(By.cssSelector("#ui-panel-3-label")).getAttribute("class");
            className3.contains("ng-tns-c51-9 pi pi-plus");
            String className4 = driver.findElement(By.cssSelector("#ui-panel-4-label")).getAttribute("class");
            className4.contains("ng-tns-c51-9 pi pi-plus");
            String className5 = driver.findElement(By.cssSelector("#ui-panel-5-label")).getAttribute("class");
            className5.contains("ng-tns-c51-9 pi pi-plus");
            String className6 = driver.findElement(By.cssSelector("#ui-panel-6-label")).getAttribute("class");
            className6.contains("ng-tns-c51-9 pi pi-plus");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
      public void Generalprodreqcheckboxchecked(){
          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
          log.info("opened prodspec page:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());
          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 1st checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 2nd checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 3rd checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 4th checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 5th checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 6th checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 7th checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > div > user-confirmation-checkbox > i")).toString());
      }

    public void Generalprodreqcheckboxchecked_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        Generalprodreqcheckboxchecked();
    }
    public void Generalprodreqcheckboxchecked_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        Generalprodreqcheckboxchecked();

    }

    public void Generalprodreqcheckboxchecked_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        Generalprodreqcheckboxchecked();

    }
    public void Generalprodreqcheckboxchecked_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        Generalprodreqcheckboxchecked();

    }

    public boolean verifygeneralprodreqcheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-1-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }



    public void generalprodreqcheckboxunchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("opened prodspec page:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

    }

    public void generalprodreqcheckboxunchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        generalprodreqcheckboxunchecked();

    }
    public void generalprodreqcheckboxunchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        generalprodreqcheckboxunchecked();


    }
    public void generalprodreqcheckboxunchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        generalprodreqcheckboxunchecked();

    }
    public void generalprodreqcheckboxunchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        generalprodreqcheckboxunchecked();

    }





    public boolean verifygeneralprodreqcheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-1-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void redactionandplaceholderreqcheckboxchecked()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       log.info("opened prodspec page:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st  redaction info checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on  checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on previously produced docs handling checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on family association checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(5) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(5) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-8-content > div > div.ui-g-9.ng-tns-c92-17 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-8-content > div > div.ui-g-9.ng-tns-c92-17 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-8-content > div > div.ui-g-9.ng-tns-c92-17 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-8-content > div > div.ui-g-9.ng-tns-c92-17 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

    }

    public void redactionandplaceholderreqcheckboxchecked_relus()  {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        redactionandplaceholderreqcheckboxchecked();

    }

    public void redactionandplaceholderreqcheckboxchecked_reluk()  {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        redactionandplaceholderreqcheckboxchecked();
    }
    public void redactionandplaceholderreqcheckboxchecked_slus()  {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        redactionandplaceholderreqcheckboxchecked();

    }
    public void redactionandplaceholderreqcheckboxchecked_sluk()  {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        redactionandplaceholderreqcheckboxchecked();

    }

    public boolean verifyredactionplaceholderreqcheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-2-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void redactionplaceholderreqcheckboxunchecked(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on production type checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on sort order checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on previously produced docs handling checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on family association checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

    }

    public void redactionplaceholderreqcheckboxunchecked_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        redactionplaceholderreqcheckboxunchecked();
    }

    public void redactionplaceholderreqcheckboxunchecked_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        redactionplaceholderreqcheckboxunchecked();

    }

    public void redactionplaceholderreqcheckboxunchecked_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        redactionplaceholderreqcheckboxunchecked();

    }

    public void redactionplaceholderreqcheckboxunchecked_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        redactionplaceholderreqcheckboxunchecked();

    }

    public boolean verifyredactionplaceholderreqcheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-2-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void nativeimagingoptionscheckboxchecked(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 3rd checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

    }

    public void nativeimagingoptionscheckboxchecked_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        nativeimagingoptionscheckboxchecked();


    }
    public void nativeimagingoptionscheckboxchecked_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        nativeimagingoptionscheckboxchecked();


    }
    public void nativeimagingoptionscheckboxchecked_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        nativeimagingoptionscheckboxchecked();


    }
    public void nativeimagingoptionscheckboxchecked_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        nativeimagingoptionscheckboxchecked();

    }

    public boolean verifynativeimagingoptionscheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-3-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void nativeimagingoptionscheckboxunchecked(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

    }

    public void nativeimagingoptionscheckboxunchecked_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        nativeimagingoptionscheckboxunchecked();

    }
    public void nativeimagingoptionscheckboxunchecked_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        nativeimagingoptionscheckboxunchecked();

    }
    public void nativeimagingoptionscheckboxunchecked_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        nativeimagingoptionscheckboxunchecked();

    }
    public void nativeimagingoptionscheckboxunchecked_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        nativeimagingoptionscheckboxunchecked();

    }

    public boolean verifynativeimagingoptionscheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-3-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void brandinginfocheckboxchecked(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on branding info section:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox on branding info section:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 3rd checkbox on branding info section:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > div > user-confirmation-checkbox > i")).toString());


    }
    public void brandinginfocheckboxchecked_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        brandinginfocheckboxchecked();

    }
    public void brandinginfocheckboxchecked_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        brandinginfocheckboxchecked();

    }
    public void brandinginfocheckboxchecked_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        brandinginfocheckboxchecked();

    }
    public void brandinginfocheckboxchecked_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        brandinginfocheckboxchecked();

    }

    public boolean verifybrandinginfocheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-4-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void brandinginfocheckboxunchecked(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i")).toString());

    }
    public void brandinginfocheckboxunchecked_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        brandinginfocheckboxunchecked();

    }
    public void brandinginfocheckboxunchecked_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        brandinginfocheckboxunchecked();
    }
    public void brandinginfocheckboxunchecked_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        brandinginfocheckboxunchecked();
    }
    public void brandinginfocheckboxunchecked_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        brandinginfocheckboxunchecked();
    }

    public boolean verifybrandinginfocheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-4-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void prodfilespeccheckboxchecked(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).toString());

    }

    public void prodfilespeccheckboxchecked_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        prodfilespeccheckboxchecked();

    }
    public void prodfilespeccheckboxchecked_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        prodfilespeccheckboxchecked();

    }
    public void prodfilespeccheckboxchecked_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        prodfilespeccheckboxchecked();

    }
    public void prodfilespeccheckboxchecked_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        prodfilespeccheckboxchecked();

    }

    public boolean verifyprodfilespeccheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-5-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void prodfilespeccheckboxunchecked(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());
    }

    public void prodfilespeccheckboxunchecked_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        prodfilespeccheckboxunchecked();

    }
    public void prodfilespeccheckboxunchecked_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        prodfilespeccheckboxunchecked();

    }
    public void prodfilespeccheckboxunchecked_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        prodfilespeccheckboxunchecked();

    }
    public void prodfilespeccheckboxunchecked_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        prodfilespeccheckboxunchecked();

    }

    public boolean verifyprodfilespeccheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-5-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void prodlocationcheckboxchecked(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i")).toString());
    }
    public void prodlocationcheckboxchecked_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        prodlocationcheckboxchecked();

    }
    public void prodlocationcheckboxchecked_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        prodlocationcheckboxchecked();

    }
    public void prodlocationcheckboxchecked_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        prodlocationcheckboxchecked();

    }
    public void prodlocationcheckboxchecked_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        prodlocationcheckboxchecked();

    }

    public boolean verifyprodlocationcheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-6-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void prodlocationcheckboxunchecked(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

    }
    public void prodlocationcheckboxunchecked_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        prodlocationcheckboxunchecked();

    }
    public void prodlocationcheckboxunchecked_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        prodlocationcheckboxunchecked();

    }
    public void prodlocationcheckboxunchecked_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        prodlocationcheckboxunchecked();

    }
    public void prodlocationcheckboxunchecked_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        prodlocationcheckboxunchecked();

    }

    public boolean verifyprodlocationcheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-6-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public void nondefaultconfirmationcheck(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select ProductionDAT = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        ProductionDAT.selectByVisibleText("Eastern Time (UTC -5:00)");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select ProductionDate = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        ProductionDate.selectByVisibleText("UK STANDARD: dd/MM/yyyy, Null dates will be blank");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select ProductionTime = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        ProductionTime.selectByVisibleText("CUSTOM: [insert custom instructions]");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Select ProductionType = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        ProductionType.selectByVisibleText("CUSTOM: [insert custom instructions]");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Select Sortorder = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Sortorder.selectByVisibleText("CUSTOM: [insert custom instructions]");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > span > editable-dropdown > div > select")));
        Select PreviouslyproducedDocs = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > span > editable-dropdown > div > select")));
        PreviouslyproducedDocs.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > span > editable-dropdown > div > select")));
        Select FamilyAssociation = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > span > editable-dropdown > div > select")));
        FamilyAssociation.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select MarkupsetorRedactionlayer = new Select(driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > span > editable-dropdown > div > select")));
        MarkupsetorRedactionlayer.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select Text = new Select(driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Text.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select Imageredactionlabel = new Select(driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Imageredactionlabel.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Select BlackoutredactionorAudio = new Select(driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > span > editable-dropdown > div > select")));
        BlackoutredactionorAudio.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Select RedactedwithFamily = new Select(driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(5) > span > editable-dropdown > div > select")));
        RedactedwithFamily.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select Unreadableplaceholder = new Select(driver.findElement(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Unreadableplaceholder.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select Unreadablewithfamily = new Select(driver.findElement(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Unreadablewithfamily.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select Privilegeplaceholder = new Select(driver.findElement(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Privilegeplaceholder.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select Privilegewithfamily = new Select(driver.findElement(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Privilegewithfamily.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select Emptyfileidentifier = new Select(driver.findElement(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Emptyfileidentifier.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select Emptyfiles = new Select(driver.findElement(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Emptyfiles.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-fieldset-8-content > div > div.ui-g-9.ng-tns-c92-17 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select Nativefiles = new Select(driver.findElement(By.cssSelector("#ui-fieldset-8-content > div > div.ui-g-9.ng-tns-c92-17 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Nativefiles.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-8-content > div > div.ui-g-9.ng-tns-c92-17 > div.form-height.margin-top-10.ng-star-inserted > span > editable-dropdown > div > select")));
        Select Tifffailurefiles = new Select(driver.findElement(By.cssSelector("#ui-fieldset-8-content > div > div.ui-g-9.ng-tns-c92-17 > div.form-height.margin-top-10.ng-star-inserted > span > editable-dropdown > div > select")));
        Tifffailurefiles.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select Spreadsheetfiles = new Select(driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Spreadsheetfiles.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select Presentationfiles = new Select(driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Presentationfiles.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select Otherfiles = new Select(driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Otherfiles.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select Productionnumbering = new Select(driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Productionnumbering.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > span > editable-dropdown > div > select")));
        Select Useexistingfields = new Select(driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > span > editable-dropdown > div > select")));
        Useexistingfields.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > span > editable-dropdown > div > select")));
        Select Brandingfont = new Select(driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > span > editable-dropdown > div > select")));
        Brandingfont.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-9-content > div > div:nth-child(3) > div:nth-child(4) > span > editable-dropdown > div > select")));
        Select Bottomright = new Select(driver.findElement(By.cssSelector("#ui-fieldset-9-content > div > div:nth-child(3) > div:nth-child(4) > span > editable-dropdown > div > select")));
        Bottomright.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select Loadfiledelimiters = new Select(driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Loadfiledelimiters.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select Loadfileencodin = new Select(driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Loadfileencodin.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select Imagefiledeliveryformat = new Select(driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Imagefiledeliveryformat.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Select Textfiledeliveryformat = new Select(driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Textfiledeliveryformat.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Select Nativefiledeliveryformat = new Select(driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Nativefiledeliveryformat.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select Imagefolder = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Imagefolder.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select Textfolder = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Textfolder.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select Nativefolder = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Nativefolder.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Select Loadfilefolder = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Loadfilefolder.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Select Pathprefix = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Pathprefix.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Select pdffilefolder = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        pdffilefolder.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-7-content > div > div > textarea")));
        WebElement Splinstructiontext = driver.findElement(By.cssSelector("#ui-panel-7-content > div > div > textarea"));
        Splinstructiontext.sendKeys("test");

    }

    public void nondefaultconfirmationcheck_relus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        nondefaultconfirmationcheck();

    }

    public void nondefaultconfirmationcheck_reluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        nondefaultconfirmationcheck();

    }
    public void nondefaultconfirmationcheck_slus(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        nondefaultconfirmationcheck();

    }
    public void nondefaultconfirmationcheck_sluk(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        nondefaultconfirmationcheck();

    }
    public boolean verifynondefaultvalueconfirmationchecked() {
        try {
            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className0 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className1 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className1.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className2 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className2.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")));
            String className3 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className3.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")));
            String className4 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className4.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i")));
            String className5 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className5.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > div > user-confirmation-checkbox > i")));
            String className6 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className6.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className7 = driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className7.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className8 = driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className8.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className9 = driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className9.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > div > user-confirmation-checkbox > i")));
            String className10 = driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className10.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(5) > div > user-confirmation-checkbox > i")));
            String className11 = driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(5) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className11.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className12 = driver.findElement(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className12.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className13 = driver.findElement(By.cssSelector("#ui-fieldset-5-content > div > div.ui-g-9.ng-tns-c92-14 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className13.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className14 = driver.findElement(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className14.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className15 = driver.findElement(By.cssSelector("#ui-fieldset-6-content > div > div.ui-g-9.ng-tns-c92-15 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className15.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className16 = driver.findElement(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className16.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className17 = driver.findElement(By.cssSelector("#ui-fieldset-7-content > div > div.ui-g-9.ng-tns-c92-16 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className17.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className18 = driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className18.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className19 = driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className19.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className20 = driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className20.contains("pi pi-check-circle default-option-check");

           waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className21 = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className21.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i")));
            String className22 = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className22.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > div > user-confirmation-checkbox > i")));
            String className23 = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className23.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className26 = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className26.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className27 = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className27.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className28 = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className28.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")));
            String className29 = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className29.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")));
            String className30 = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className30.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className31 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className31.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className32 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className32.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className33 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className33.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")));
            String className34 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className34.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")));
            String className35 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className35.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")));
            String className36 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className36.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-7-titlebar > p-header > div > user-confirmation-checkbox > i")));
            String className37 = driver.findElement(By.cssSelector("#ui-panel-7-titlebar > p-header > div > user-confirmation-checkbox > i")).getAttribute("class");
           className37.contains("pi pi-check-circle default-option-check");



            return true;
        } catch (Exception e) {
            return false;
        }
    }

}








