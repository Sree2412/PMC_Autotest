


package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0030_Confirmationcheckbox_redactionplaceholder extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }



    @Test
    public void redactionandplaceholderreqcheckboxes() {
        log.info("=======started redactionandplaceholderreqcheckboxes Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.redactionandplaceholderreqcheckboxchecked_reluk();
        Assert.assertEquals(true, prodspecpage.verifyredactionplaceholderreqcheckboxchecked()


        );
        log.info("=======Finished redactionandplaceholderreqcheckboxes Test===========");
    }


    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}