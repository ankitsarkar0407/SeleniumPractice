package PracticeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		List<WebElement> rows =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		for(int i = 2; i <= rows.size() ; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element  = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
				if(element.getText().equalsIgnoreCase("Island Trading")) {
					System.out.println("company name: "+ element.getText() + " is found at : " +(i -1));
					break;
				}
		}
		System.out.println("* * * * * *");
		
		String afterXpathContact = "]/td[2]";
		for(int i = 2; i <= rows.size() ; i++) {
			String actualXpath = beforeXpath + i + afterXpathContact;
			WebElement element  = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
				if(element.getText().equalsIgnoreCase("Island Trading")) {
					System.out.println("company name: "+ element.getText() + " is found at : " +(i -1));
					break;
				}
		}
	System.out.println("* * * * * *");
		
		String afterXpathCountry = "]/td[3]";
		for(int i = 2; i <= rows.size() ; i++) {
			String actualXpath = beforeXpath + i + afterXpathCountry;
			WebElement element  = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
				if(element.getText().equalsIgnoreCase("Island Trading")) {
					System.out.println("company name: "+ element.getText() + " is found at : " +(i -1));
					break;
				}
		}
		
		System.out.println("* * * * * *");
		//Handle WebTable Columns
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		String colBeforeXpath = "//*[@id='customers']/tbody/tr[1]/th[";
		String colAfterXpath = "]";
		
		List<WebElement> cols =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		System.out.println("Total number of columns = "+cols.size());
		
		for(int i = 1; i <= cols.size() ; i++) {
			String actualXpath = colBeforeXpath + i + colAfterXpath;
			WebElement element  = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
				if(element.getText().equalsIgnoreCase("Island Trading")) {
					System.out.println("company name: "+ element.getText() + " is found at : " +(i -1));
					break;
				}
		}
		
		
	}
	
	
	
	
	

}
