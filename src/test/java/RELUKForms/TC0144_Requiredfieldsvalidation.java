package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0144_Requiredfieldsvalidation extends testBase {

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void requiredfieldsvalidation() {
            log.info("=======started requiredfieldsvalidation Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.requiredfields_reluk();
            Assert.assertEquals(true, prodspecPageext.verifyrequiredfields_rel());
            log.info("=======Finished requiredfieldsvalidation Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }







