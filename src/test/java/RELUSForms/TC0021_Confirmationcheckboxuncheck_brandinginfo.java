
package RELUSForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;
public class TC0021_Confirmationcheckboxuncheck_brandinginfo extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }
    @Test
    public void brandinginfocheckboxesunchecked() {
        log.info("=======started brandinginfocheckboxesunchecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.brandinginfocheckboxunchecked_relus();
        Assert.assertEquals(true, prodspecpage.verifybrandinginfocheckboxunchecked());
        log.info("=======Finished brandinginfocheckboxesunchecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}