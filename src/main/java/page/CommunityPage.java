package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CommunityPage extends PageBase

{
    public CommunityPage(AppiumDriver<MobileElement> driver)
    {
        super(driver);
    }


    @AndroidFindBy(xpath ="//android.widget.TextView[@text='GET STARTED']")
    MobileElement Close_Button;

    @AndroidFindBy(xpath ="//android.widget.FrameLayout[@content-desc='Community']")
    MobileElement Community_Button;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='ENDS IN 5 DAYS']")
    MobileElement Challenges_Button;

    @AndroidFindBy(id ="com.runtastic.android:id/detailsJoinButton")
    MobileElement GetStarted_Button;

    @AndroidFindBy(id ="com.runtastic.android:id/marketingSwitch")
    MobileElement Switch_Button;

    @AndroidFindBy(id ="com.runtastic.android:id/acceptButton")
    MobileElement Accept_Button;

    @AndroidFindBy(id ="com.runtastic.android:id/welcomeMessage")
   public MobileElement Welcome_Message;



    public void Challenges()
    {
        ClickOn(Close_Button);
        ClickOn(Community_Button);
        ClickOn(Challenges_Button);
        ClickOn(GetStarted_Button);
        ClickOn(Switch_Button);
        ClickOn(Accept_Button);


    }

}
