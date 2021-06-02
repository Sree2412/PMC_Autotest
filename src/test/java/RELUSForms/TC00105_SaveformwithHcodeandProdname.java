package RELUSForms;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC00105_SaveformwithHcodeandProdname extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void saveprodspecformwithhcodeandprodname() {
            log.info("=======started saveprodspecformwithhcodeandprodname Test===========");
            ProdspecPageext prodspecpageext = new ProdspecPageext(driver);
            prodspecpageext.saveform_relus();
            Assert.assertEquals(true, prodspecpageext.verifysavedform());
            log.info("=======Finished saveprodspecformwithhcodeandprodname Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }





