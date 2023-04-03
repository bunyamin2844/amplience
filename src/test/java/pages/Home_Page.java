package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Home_Page extends CommonPage{

    public Home_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css = "[itemprop='name']")
    public WebElement name;

    @FindBy(css = "[href$='followers']")
    public WebElement followers;

    @FindBy(css = "[href$='following']")
    public WebElement following;


    @FindBy(css = ".p-label")
    public  WebElement location;

    @FindBy(css = "[data-tab-item='repositories']>span.Counter")
    public List<WebElement> repositories;


}
