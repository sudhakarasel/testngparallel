import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessTC {


    @Test
    public void TestOne(){
        HtmlUnitDriver unitDriver = new HtmlUnitDriver();

        // open demo site webpage
        unitDriver.get("https://demoqa.com/");

        //Print the title of the page
        System.out.println("Title of the page is -> " + unitDriver.getTitle());
    }

}
