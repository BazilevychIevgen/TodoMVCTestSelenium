package testconfigs;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import static core.ConciseAPI.getDriver;
import static core.ConciseAPI.setDriver;

/**
 * Created by barocko on 9/26/2016.
 */
public class BaseTest {

    @Before
    public void setUpDriver() {
        setDriver(new FirefoxDriver());
    }

    @After
    public void closeDriver() {
        getDriver().quit();
    }
}
