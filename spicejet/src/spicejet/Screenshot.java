package spicejet;

//import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Screenshot {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\webdriver\\webdriver of different browser\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	  //pass the URL
	     driver.get("https://www.spicejet.com");
	  // maximize the window   <a href="http://corporate.spicejet.com/Content/pdf/GSA-RFP.pdf" target="_blank" xpath="1">RFP</a>
	     driver.manage().window().maximize();
	
	    TakesScreenshot ts=(TakesScreenshot)driver;
   //take a screenshot and store as a file format   
	     File Source = ts.getScreenshotAs(OutputType.FILE);
  //now copy the Screenshot to desired location    
	     FileUtils.copyFile(Source,new File("./sameer/spicejethome.png"));
	    // System.out.println("Screenshot take succesfully");
	     //Actions sameer=new Actions(driver);
	     //Thread.sleep(5000);
  //scrool.down    
	     //sameer.sendKeys(Keys.PAGE_DOWN).build().perform();
 //Scrool.up	
	     //sameer.sendKeys(Keys.PAGE_UP).build().perform();
	   JavascriptExecutor je=( JavascriptExecutor) driver;
	 //   WebElement element=driver.findElement(By.className("footer-subheadings"));
//using pixel
	       (je).executeScript("scroll(0,800)") ; 
	       Thread.sleep(5000);
	    ( je).executeScript("scroll(800,0)");
	      
	     
  // driver.close();
	     
	}
}
	 
 