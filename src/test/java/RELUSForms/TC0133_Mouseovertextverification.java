package RELUSForms;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0133_Mouseovertextverification extends testBase {

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void mouseovertextverification() {
            log.info("=======started mouseovertextverification Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.mouseovertext_relus();
            Assert.assertEquals(true, prodspecPageext.verifymouseovertext());
            log.info("=======Finished mouseovertextverification Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }

