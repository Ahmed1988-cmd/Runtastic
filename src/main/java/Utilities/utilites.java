package Utilities;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class utilites
{
    public static void performRefersh(AndroidDriver driver){
        //get device height and width
        int deviceWidth = driver.manage().window().getSize().getWidth();
        int deviceHeight = driver.manage().window().getSize().getHeight();
        //calculate midX and midY
        int midX = (deviceWidth / 2);
        int midY = (deviceHeight / 2);
        //calculate bottom edge
        int bottomEdge = (int) (deviceHeight * 0.85f);
        //perform a pull to refresh using TouchAction class
        new TouchAction((PerformsTouchActions) driver)
                .press(point(midX,midY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(midX, bottomEdge))
                .release().perform();
    }
}
