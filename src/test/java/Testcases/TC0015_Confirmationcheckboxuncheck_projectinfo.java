

package Testcases;

        import org.testng.Assert;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;
        import testBase.testBase;
        import uiActions.ProdspecPage;

        import java.io.IOException;



public class TC0015_Confirmationcheckboxuncheck_projectinfo  extends testBase {
    uiActions.ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }



    @Test
    public void projectinfocheckconfirmationcheckboxesunchecked() {
        log.info("=======started projectinfocheckconfirmationcheckboxesunchecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.projectinformationcheckboxunchecked();
        Assert.assertEquals(true, prodspecpage.verifyprojectinfomaincheckboxunchecked());
        log.info("=======Finished projectinfocheckconfirmationcheckboxesunchecked Test===========");
    }


    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}