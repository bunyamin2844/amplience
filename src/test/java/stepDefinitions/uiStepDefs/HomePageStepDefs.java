package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePageStepDefs extends CommonPage {



    @Given("User navigate to the URL and provide userIDs {string}")
    public void userNavigateToTheURLAndProvideUserIDs(String userId) {

        //way 1 Configuration reader usage
        Driver.getDriver().get(ConfigurationReader.getProperty("login_Url_Ui") + userId);

        //way 2 ENUM usage

        //  Driver.getDriver().get(ENDPOINTS.GIT_URL.getEndPoint() + userId);
    }

    @Then("User request the GitHub user name {string}")
    public void userRequestTheGitHubUserName(String name) {
        Assert.assertEquals(getHome_page().name.getText(), name);
    }

    @And("User request the GitHub user location {string}")
    public void user_request_the_git_hub_user_location(String location) {
        Assert.assertTrue(getHome_page().location.isDisplayed());
        ReusableMethods.verifyElementDisplayed(getHome_page().location);

        ReusableMethods.assertText(getHome_page().location, location);

    }

    @And("User request the GitHub user public repos {int}")
    public void user_request_the_git_hub_user_public_repos(int repos) {
        Assert.assertEquals(getHome_page().repositories.get(0).getText(), String.valueOf(repos));

    }

    @And("User request the GitHub user followers {int}")
    public void user_request_the_git_hub_user_followers(int followers) {
        Assert.assertEquals(ReusableMethods.getDigit(getHome_page().followers.getText()), followers);

    }

    @And("User request the GitHub user following {int}")
    public void user_request_the_git_hub_user_following(int following) {
        Assert.assertEquals(ReusableMethods.getDigit(getHome_page().following.getText()), following);

    }


}
