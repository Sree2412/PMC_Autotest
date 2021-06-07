package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0128_DuplicateProdnameforHcode extends testBase {


        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void duplicateProdnameforHcode() {
            log.info("=======started duplicateProdnameforHcode Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.duplicateprodname_reluk();
            Assert.assertEquals(true, prodspecPageext.verifyduplicateprodname());
            log.info("=======Finished duplicateProdnameforHcode Test===========");
        }

        @AfterClass
        public void endTest() {

            //closeBrowser();
        }
    }

