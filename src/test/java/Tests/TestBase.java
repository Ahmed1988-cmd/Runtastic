package Tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase
{
    public static AndroidDriver driver;

/*

- Capabilities for Android mobile Version 11
 */

    @BeforeMethod
    public void StartTesting() throws MalformedURLException

    {

        DesiredCapabilities cap = new DesiredCapabilities();

        File app = new File("App/Running__12-17-1.apk");

        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Ahmed");
        cap.setCapability("platformName","Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        cap.setCapability("appPackage", "com.runtastic.android");
        cap.setCapability("appActivity", "com.runtastic.android.activities.StartActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void stopdriver()
    {
        driver.quit();
    }

}


