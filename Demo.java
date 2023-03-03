package sai;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		//selinium webdriver code 
		
		System.setProperty("webdriver.chrome.driver","D:\\seliniumjavatraining\\DemoProj\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		
		
	}

}
