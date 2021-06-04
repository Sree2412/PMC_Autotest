package RELUKForms;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0104_SaveformwithHcodeandProdname extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void saveprodspecformwithhcodeandprodname() {
            log.info("=======started saveprodspecformwithhcodeandprodname Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.saveform_reluk();
            Assert.assertEquals(true, prodspecPageext.verifysavedform());
            log.info("=======Finished saveprodspecformwithhcodeandprodname Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }



