package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class CommonPage {

    public CommonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    private Home_Page getHome_page;



    public Home_Page getHome_page() {
        if(getHome_page ==null){
            getHome_page =new Home_Page();
        }

        return getHome_page;
    }



}
