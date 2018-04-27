package selTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class VerifyPageTitle {

	public static void main(String[] args) {
		
		
		//Instantiate Firefox Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches", "--disable-extensions --disable-extensions-file-access-check --disable-extensions-http-throttling");
		
		WebDriver driver = new ChromeDriver(options);
				
				//Open url for application under test
				driver.get("http://www.amazon.com");
				
				//Mention the Expected Page title of application url
				String ExpectedPageTitle ="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
						
				//Find the actual page title using gettitle command
				String ActualPageTitle=driver.getTitle();
				
				//Print the actualPageTitle
				System.out.println("Actual Page title is:"+ ActualPageTitle);
				
				//Verify if the actual page title matches with the expected page title
				
				if(ActualPageTitle.equals(ExpectedPageTitle))
				{
					System.out.println("Verification - Passed");
				}
				else
				{
					System.out.println("Verification - Failed");
				}
				
				driver.close();
				
	}

}
