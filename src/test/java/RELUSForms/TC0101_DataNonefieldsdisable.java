package RELUSForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;

    public class TC0101_DataNonefieldsdisable extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void datanonefielddisable() {
            log.info("=======started datanonefielddisable Test===========");
            ProdspecPage prodspecpage = new ProdspecPage(driver);
            prodspecpage.datanonefieldsdisable_relus();
            Assert.assertEquals(true, prodspecpage.verifydatanonefieldsdisable());
            log.info("=======Finished datanonefielddisable Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }

