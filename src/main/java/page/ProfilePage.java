package page;

import Utilities.utilites;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;




public class ProfilePage extends PageBase
{
    AndroidDriver driver;
    public ProfilePage(AppiumDriver<MobileElement> driver)
    {
        super(driver);
        this.driver = (AndroidDriver) driver;
    }


    @AndroidFindBy(xpath ="//android.widget.TextView[@text='GET STARTED']")
    MobileElement Close_Button;

    @AndroidFindBy(xpath ="//android.widget.FrameLayout[@content-desc='Profile']")
    MobileElement Profile2_Button;

    @AndroidFindBy(xpath ="//android.widget.TextView[@content-desc='Settings']")
    MobileElement Settings_Button;

    @AndroidFindBy(id ="android:id/title")
    MobileElement EditProfile_Button;

    @AndroidFindBy(id ="com.runtastic.android:id/view_spinner_country_name")
    MobileElement LocationList_DropDwn;

    @AndroidFindBy(xpath ="//android.widget.ImageButton[@content-desc='Navigate up']")
    MobileElement NavigateUp_Button;

    @AndroidFindBy(xpath ="//android.widget.Button[@text='DISMISS']")
    MobileElement Dismiss_Button;

    @AndroidFindBy(xpath ="//android.widget.ImageButton[@index='0']")
    MobileElement Back_Button;

     @AndroidFindBy(xpath ="//android.widget.TextView[@text='United Kingdom']")
      public MobileElement CheckCountry_Message;


    public void UserProfile()

    {
        ClickOn(Close_Button);
        ClickOn(Profile2_Button);
        ClickOn(Settings_Button);
        ClickOn(EditProfile_Button);
        ClickOn(LocationList_DropDwn);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"United Kingdom\"));").click();
        ClickOn(NavigateUp_Button);
        ClickOn(Dismiss_Button);
        ClickOn(Back_Button);
        utilites.performRefersh(driver);

    }

}
