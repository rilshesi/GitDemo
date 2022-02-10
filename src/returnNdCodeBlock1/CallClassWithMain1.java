package returnNdCodeBlock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CallClassWithMain1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int sum = 0;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Test\\Browser\\chromedriver(76).exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21680/ess-vs-kent-county-div-1-county-championship-division-one-2019");
		
		WebElement tabl = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'] "));
		
		int rowcounts = tabl.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).size();
		
		for(int i=0; i<rowcounts-2; i++) {
			String value1 = tabl.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
			int  totalsum = Integer.parseInt(value1);
			
			System.out.println(sum = sum + totalsum);
			
		}
		
		

	}


}
