
package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;

public class TC0034_Confirmationcheckboxcheck_brandinginfo extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }
    @Test
    public void brandinginfocheckboxeschecked() {
        log.info("=======started brandinginfocheckboxeschecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.brandinginfocheckboxchecked_reluk();
        Assert.assertEquals(true, prodspecpage.verifybrandinginfocheckboxchecked());
        log.info("=======Finished brandinginfocheckboxeschecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}