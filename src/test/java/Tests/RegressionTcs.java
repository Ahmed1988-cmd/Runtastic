package Tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CommunityPage;
import page.UserProfilePage;
import page.ProfilePage;


public class RegressionTcs extends TestBase
{

    UserProfilePage logObj;
    ProfilePage profileObj;
    CommunityPage communityObj;
/*
- in login credentials username and password (Ahmedhafez888@gmail.com- )
 */

    @Test(priority = 1, alwaysRun = true)
    @Severity(SeverityLevel.CRITICAL)
    @Description("User Can Edit His Location")

    public void UserCanCheckHisUpdated() throws InterruptedException
    {
        logObj = new UserProfilePage(driver);
        logObj.LoginPage();

        profileObj = new ProfilePage(driver);
        profileObj.UserProfile();
        Assert.assertTrue(profileObj.CheckCountry_Message.getText().contains("United Kingdom"));

    }


    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("User Can Join new Challenges")
    public void UserCanJoinChallenges()
    {
        logObj = new UserProfilePage(driver);
       logObj.LoginPage();

        communityObj = new CommunityPage(driver);
        communityObj.Challenges();
        Assert.assertTrue(communityObj.Welcome_Message.getText().contains("WELCOME, AHMED."));
    }

}
