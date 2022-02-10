package returnNdCodeBlock1;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;




public class GridTest {


@Test
public void grid() throws InterruptedException, MalformedURLException  {
		
		
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.4:4455/wd/hub"), dc);
		
driver.get("https://www.spicejet.com/");
		
		
		//currency select
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		
		//select passenger
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000L);
		driver.findElement(By.cssSelector("#hrefIncChd")).click();
	for(int x=1; x<4; x++) {
			
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
	for(int y=1; y<3; y++) {
		
		driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
	}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		
		//select From/To city
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		//Select current/future dates. we need to select oneWay
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		
		
		//enable/disable UI
		
		//driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its disable");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		//search button
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();

		
		
		
		}

}

