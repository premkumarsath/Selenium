import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Pineapple {
public static void main (String []args) throws Exception {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\Apple\\target\\driver\\msedgedriver.exe");
	
	WebDriver driver =  new EdgeDriver();
	String s = "https://www.facebook.com/"; 
	driver.get(s);
	driver.navigate().to(s);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//driver.manage().window().minimize();
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	driver.switchTo().newWindow(WindowType.TAB) ;
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	if (s.equals(currentUrl)) {
		System.out.println("given url is correct");
	}
	else {
		System.err.println("url is not correct");
	}
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String c = driver.getPageSource();
		System.out.println(c);
		
		
	
	
	driver.close();
	driver.quit();
	
	
}
}