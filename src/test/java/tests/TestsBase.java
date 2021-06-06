package tests;

import application.AppiumListener;
import application.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class TestsBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
     public void setUp() throws MalformedURLException {
        app.start();
    }

    @AfterSuite
    public void tearDown(){
        app.stop();
    }
}
