


package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0031_Confirmationcheckboxuncheck_redactionplaceholder extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void redactionplaceholderreqcheckboxesunchecked() {
        log.info("=======started redactionplaceholderreqcheckboxesunchecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.redactionplaceholderreqcheckboxunchecked_reluk();
        Assert.assertEquals(true, prodspecpage.verifyredactionplaceholderreqcheckboxunchecked());
        log.info("=======Finished redactionplaceholderreqcheckboxesunchecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}