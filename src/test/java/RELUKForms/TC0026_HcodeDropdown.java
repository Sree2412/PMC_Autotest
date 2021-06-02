
package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0026_HcodeDropdown extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void hcodedropdown() {
        log.info("=======started hcodedropdown Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.selecthcodefromdropdown_reluk();
        Assert.assertEquals(true, prodspecpage.verifyhcodedropdown());
        log.info("=======Finished hcodedropdown Test===========");
    }

    @AfterClass
    public void endTest() {

       // closeBrowser();
    }
}






