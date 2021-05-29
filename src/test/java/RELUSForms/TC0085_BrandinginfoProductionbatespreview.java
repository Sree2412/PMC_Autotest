package RELUSForms;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;

    public class TC0085_BrandinginfoProductionbatespreview extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void brandinginfoProductionbatespreview() {
            log.info("=======started brandinginfoProductionbatespreview Test===========");
            ProdspecPage prodspecpage = new ProdspecPage(driver);
            prodspecpage.productionbatespreview_relus();
            Assert.assertEquals(true, prodspecpage.verifyproductionbatespreview());
            log.info("=======Finished brandinginfoProductionbatespreview Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }



