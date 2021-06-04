
package HomePage;

        import org.testng.Assert;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;
        import testBase.testBase;
        import uiActions.CopyexistingPage;
        import java.io.IOException;




public class


TC0011_Cancelcopyexistingform extends testBase {
    uiActions.CopyexistingPage copyexistingPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void cancelcopyexistingform() {
        log.info("=======started cancelcopyexistingform Test===========");
        CopyexistingPage copyexistingpage = new CopyexistingPage(driver);
        copyexistingpage.copyexistingcancelbutton();
        Assert.assertEquals(true, copyexistingpage.verifycopyexistingCloseButton());
        log.info("=======Finished cancelcopyexistingform Test===========");
    }

    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}







