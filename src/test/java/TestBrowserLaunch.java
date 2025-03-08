import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBrowserLaunch {
    private WebDriver driver;

    @BeforeTest
    public void init(){
        System.out.println("beforeTest get executed.........");
    }

    @AfterTest
    public void finished(){
        System.out.println("afterTest got executed..........");
    }


}
