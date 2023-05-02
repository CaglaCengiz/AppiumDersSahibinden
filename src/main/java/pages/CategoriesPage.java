package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CategoriesPage {

    ElementHelper elementHelper;

    By title = By.id("android:id/action_bar");
    By categories = By.id("android:id/text1");

    public CategoriesPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void clickCategoriesPage() {
        elementHelper.checkElement(title);
    }

    public void clickCategory(String category) {
        elementHelper.clickElementWithText(categories,category);
    }
}
