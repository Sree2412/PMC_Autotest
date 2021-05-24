package RELUSForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;



public class TC0013_Expand_Collapsesections  extends testBase {
    uiActions.ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void expandcollapsesections() {
        log.info("=======started expandcollapsesections Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.expandcollapsesections_relus();
        Assert.assertEquals(true, prodspecpage.verifyexpandcollapsebuttons());
        log.info("=======Finished expandcollapsesections Test===========");
    }

    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}