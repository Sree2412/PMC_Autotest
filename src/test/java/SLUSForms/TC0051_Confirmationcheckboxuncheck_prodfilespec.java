


package SLUSForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0051_Confirmationcheckboxuncheck_prodfilespec extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }
    @Test
    public void prodfilespeccheckboxesunchecked() {
        log.info("=======started prodfilespeccheckboxesunchecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.prodfilespeccheckboxunchecked_slus();
        Assert.assertEquals(true, prodspecpage.verifyprodfilespeccheckboxunchecked());
        log.info("=======Finished prodfilespeccheckboxesunchecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}