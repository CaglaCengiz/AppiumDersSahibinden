package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ButtonsPage {

    ElementHelper elementHelper;

    By title = By.className("android.widget.TextView");
    By normal = By.id("io.appium.android.apis:id/button_normal");
    By small = By.id("io.appium.android.apis:id/button_small");
    By switchBut = By.className("android.widget.ToggleButton");


    public  ButtonsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public String getTitle() {

        return elementHelper.getText(title);


    }


    public void ckeckButtonPage() {
        elementHelper.checkElement(title);
    }

    public String getTextNormalButton() {
        return elementHelper.getText(normal);
    }

    public String getTextSmallButton() {
        return elementHelper.getText(small);
    }

    public String getTextSwitchButton() {
        return elementHelper.getText(switchBut);
    }

    public void clickSwitchButton() {
        elementHelper.click(switchBut);
    }
}
