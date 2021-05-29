package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;

    public class TC0092_LoadfileNoneoption extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void loadfileoptions() {
            log.info("=======started loadfileoptions Test===========");
            ProdspecPage prodspecpage = new ProdspecPage(driver);
            prodspecpage.loadfileNoneoption_reluk();
            Assert.assertEquals(true, prodspecpage.verifyloadfileNoneoption());
            log.info("=======Finished loadfileoptions Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }

