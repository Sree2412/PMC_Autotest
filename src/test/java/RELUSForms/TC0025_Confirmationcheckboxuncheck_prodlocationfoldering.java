


package RELUSForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0025_Confirmationcheckboxuncheck_prodlocationfoldering extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }
    @Test
    public void prodlocationcheckboxesunchecked() {
        log.info("=======started prodlocationcheckboxesunchecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.prodlocationcheckboxunchecked_relus();
        Assert.assertEquals(true, prodspecpage.verifyprodlocationcheckboxunchecked());
        log.info("=======Finished prodlocationcheckboxesunchecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}