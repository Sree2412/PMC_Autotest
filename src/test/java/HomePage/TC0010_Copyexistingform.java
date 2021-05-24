

package HomePage;

        import org.testng.Assert;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;
        import testBase.testBase;
        import uiActions.CopyexistingPage;
        import java.io.IOException;




public class TC0010_Copyexistingform extends testBase {
    uiActions.CopyexistingPage copyexistingPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void copyexistingform() {
        log.info("=======started copyexistingform Test===========");
        CopyexistingPage copyexistingpage = new CopyexistingPage(driver);
        copyexistingpage.copyexistingProdspecforms();
        Assert.assertEquals(true, copyexistingpage.verifycopyexistingformsopens());
        log.info("=======Finished copyexistingform Test===========");
    }

    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}






