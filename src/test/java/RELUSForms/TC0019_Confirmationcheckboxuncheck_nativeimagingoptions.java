
package RELUSForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;
public class TC0019_Confirmationcheckboxuncheck_nativeimagingoptions extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void nativeimagingoptionscheckboxesunchecked() {
        log.info("=======started nativeimagingoptionscheckboxesunchecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.nativeimagingoptionscheckboxunchecked_relus();
        Assert.assertEquals(true, prodspecpage.verifynativeimagingoptionscheckboxunchecked());
        log.info("=======Finished nativeimagingoptionscheckboxesunchecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}