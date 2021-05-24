


package SLUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0066_Confirmationcheckboxcheck_prodlocationfoldering extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }
    @Test
    public void prodlocationcheckboxeschecked() {
        log.info("=======started prodlocationcheckboxeschecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.prodlocationcheckboxchecked_sluk();
        Assert.assertEquals(true, prodspecpage.verifyprodlocationcheckboxchecked());
        log.info("=======Finished prodlocationcheckboxeschecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}