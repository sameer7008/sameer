package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

 
public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\webdriver\\webdriver of different browser\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
  //get URL
     driver.get("https://www.spicejet.com");
     driver.manage().window().maximize();
     
//to handle radio button0
     //1.count size of Radio button
	     /* int Count=driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
	        System.out.println(Count);
      //2.for display attribute value 
	      
	      for(int i=0;i<Count;i++) {
	         System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value")); 
		      
	             {
		        Thread.sleep(5000);
		           
		            	 String text=driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
		            	 if(text.equals("RoundTrip"))
		            	 {
					     System.out.println("true");
					     driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
		                 }
	             }
	      }*/
  //To Handle check box
    //1.Count Check box
         // int Check=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
         // System.out.println(Check);
    //2.validation of check box 
     Thread.sleep(5000);
         // driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
        //System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isDisplayed());
        // System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isEnabled());
         // System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
        //.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isDisplayed());
       //  System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
          
         
    //3.clicking check box
         // Thread.sleep(5000);
         //  for(int i=1;i<Check;i++) {
        	//    driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
          // }
         //System.out.println(driver.findElement(By.tagName("a")).getSize());
      int  Count=driver.findElements(By.tagName("a")).size(); 
      System.out.println(Count);
     Thread.sleep(5000);
       for(int i=0;i<Count;i++){
    	  //driver.findElements(By.tagName("a")).get(i).click();

   	    
    	   System.out.println(driver.findElements(By.xpath("//input[@name='group2']")).get(i).getText());
       }
      WebElement header=driver.findElement(By.id("ctl00_Head1"));
       System.out.println(header.findElements(By.tagName("a")).size());
     driver.close();
	}
       
	}

					 
					 