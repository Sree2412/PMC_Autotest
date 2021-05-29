package RELUSForms;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;

    public class TC0089_SuffixonProductionBatesPreview extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void addingsuffixtoProductionbatespreview() {
            log.info("=======started addingsuffixtoProductionbatespreview Test===========");
            ProdspecPage prodspecpage = new ProdspecPage(driver);
            prodspecpage.suffixdisplayonprodbatespreview_relus();
            Assert.assertEquals(true, prodspecpage.verifysuffixonproductionbatespreview());
            log.info("=======Finished addingsuffixtoProductionbatespreview Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }


