
package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0028_Confirmationcheckboxes_GeneralProdreq extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void generalprodreqcheckboxes() {
        log.info("=======started generalprodreqcheckboxes Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.Generalprodreqcheckboxchecked_reluk();
        Assert.assertEquals(true, prodspecpage.verifygeneralprodreqcheckboxchecked());
        log.info("=======Finished generalprodreqcheckboxes Test===========");
    }


    @AfterClass
    public void endTest() {

        //closeBrowser();
    }
}