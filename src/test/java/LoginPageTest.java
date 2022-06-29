import objectInfo.RediffHomepage;
import objectInfo.RediffLoginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
    @Test
    public void Login()
    {
        System.setProperty("webdriver.chrome.driver", "/home/umaS/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginpage rd=new RediffLoginpage(driver);
        rd.EmailId().sendKeys("hello");
        rd.Password().sendKeys("hello");
        //rd.submit().click();
        rd.Home().click();
        RediffHomepage rh=new RediffHomepage(driver);
        rh.Search().sendKeys("rediff");
        rh.Submit().click();




    }


}
