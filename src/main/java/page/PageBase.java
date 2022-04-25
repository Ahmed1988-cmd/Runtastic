package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PageBase
{
    public PageBase(AppiumDriver<MobileElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void ClickOn(MobileElement element)
    {
        element.click();
    }

    public void SetElement(MobileElement element,String Value)
    {
        element.sendKeys(Value);
    }


}
