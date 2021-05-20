
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
    public void createnewform(){
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /* Create all page action  methods here*/
    public void selecthcodefromdropdown() {
        createnewform();
        waitForElement(driver, 10, HCodedropdown);
        log.info("Hcode value object found:-" + HCodedropdown.toString());
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

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

    public void expandcollapsesections() {
        createnewform();
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-0-label")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-label"))).click();
        log.info("clicked on minus button of project info section:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());

        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-1-label")));

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-label"))).click();
        log.info("clicked on minus button of production info is:-" + driver.findElement(By.cssSelector("#ui-panel-1-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-2-label")));

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-2-label"))).click();
        log.info("clicked on minus button of Native imaging option is:-" + driver.findElement(By.cssSelector("#ui-panel-2-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-3-label")));

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-label"))).click();
        log.info("clicked on minus button of Branding info is:-" + driver.findElement(By.cssSelector("#ui-panel-3-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-4-label")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-label"))).click();
        log.info("clicked on minus button of production file spec is:-" + driver.findElement(By.cssSelector("#ui-panel-4-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-5-label")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-label"))).click();
        log.info("clicked on minus button of production location foldering is:-" + driver.findElement(By.cssSelector("#ui-panel-5-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-6-label")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-label"))).click();
        log.info("clicked on minus button of Special instruction is:-" + driver.findElement(By.cssSelector("#ui-panel-6-label")).toString());
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
          createnewform();
          waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
          log.info("opened prodspec page:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());
          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 1st checkbox project info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 1st checkbox project info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 1st checkbox project info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 1st checkbox project info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 1st checkbox project info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 1st checkbox project info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i")).toString());

          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > div > user-confirmation-checkbox > i"))).click();
          log.info("clicked on 1st checkbox project info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > div > user-confirmation-checkbox > i")).toString());
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
        createnewform();
        log.info("opened prodspec page:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox project info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox project info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

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
        createnewform();;
       log.info("opened prodspec page:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on production type checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on sort order checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on previously produced docs handling checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on family association checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(5) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(5) > div > user-confirmation-checkbox > i")).toString());


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
        createnewform();;
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on production type checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on sort order checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on previously produced docs handling checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on family association checkbox  info section:-" + driver.findElement(By.cssSelector("#ui-fieldset-4-content > div > div.ui-g-9.ng-tns-c92-13 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

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

}






