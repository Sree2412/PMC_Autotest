
package uiActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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


}







