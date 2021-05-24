

package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0029_Confirmationcheckboxuncheck_Generalprodreq extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }



    @Test
    public void generalprodreqcheckboxesunchecked() {
        log.info("=======started generalprodreqcheckboxesunchecked Test===========");


        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.generalprodreqcheckboxunchecked_reluk();
        Assert.assertEquals(true, prodspecpage.verifygeneralprodreqcheckboxunchecked());
        log.info("=======Finished generalprodreqcheckboxesunchecked Test===========");
    }


    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}