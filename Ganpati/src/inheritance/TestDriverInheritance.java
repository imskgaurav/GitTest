package inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestDriverInheritance {

	public static void main(String[] args) {


 WebDriver driver = new ChromeDriver();

 driver = new FirefoxDriver();


 driver = new EdgeDriver();

 RemoteWebDriver  remoteDriver = new ChromeDriver();
   System.out.println();


   Actions act = new Actions(remoteDriver);





	}

}
