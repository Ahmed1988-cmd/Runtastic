package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UserProfilePage extends PageBase

{
    public UserProfilePage(AppiumDriver<MobileElement> driver)
    {
        super(driver);
    }


    @AndroidFindBy(id ="com.runtastic.android:id/contentButton")
    MobileElement CaloriesCalculation_Button;

    @AndroidFindBy(id ="com.runtastic.android:id/contentButton")
    MobileElement Permissions_Button;

    @AndroidFindBy(xpath ="//*[@text='CONTINUE ANYWAYS']")
    MobileElement Allow_Button;

      @AndroidFindBy(xpath ="//*[@text='CONTINUE']")
      MobileElement SetAPersonalGoal_Button;

    @AndroidFindBy(xpath ="//*[@text='READY TO GO']")
       MobileElement ReadyToGo_Button;

    @AndroidFindBy(id ="com.runtastic.android:id/cta_close")
    MobileElement cta_Close;


     public void LoginPage()
     {
         ClickOn(CaloriesCalculation_Button);
        ClickOn(Permissions_Button);
         ClickOn(Allow_Button);
         ClickOn(SetAPersonalGoal_Button);
         ClickOn(ReadyToGo_Button);
         ClickOn(cta_Close);
     }


}
