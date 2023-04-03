package hooks;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {
    public static WebDriver driver;
    public static CommonPage commonPage;
    public static boolean isHeadless = false;
    public static String browserType = "chrome";
    public static boolean isFullScreen = true;
    public static int width;
    public static int height;

    public static RequestSpecification spec;




   @Before
    public  void setup(){




       System.out.println("hooks");
       spec=new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("login_Url")).build();


    }

    @After
    public void tearDown() {
        System.out.println("Close The Driver");
        Driver.closeDriver();
    }

}

