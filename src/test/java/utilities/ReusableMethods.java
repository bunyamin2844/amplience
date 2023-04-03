package utilities;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class ReusableMethods {

    /**
     * we took int from string with regex method
     *
     * @param str we provide String and get digit of it
     * @return
     */
    public static int getDigit(String str) {

        return Integer.parseInt(str.replaceAll("[^0-9]", ""));

    }

    /**
     *
     * @param el webElement to be located
     * @param text text to be aseerted
     */
    public static void assertText(WebElement el, String text){

         Assert.assertTrue(el.isDisplayed());
        Assert.assertEquals(el.getText(),text);


    }
    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element is not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);
        }
    }
}
