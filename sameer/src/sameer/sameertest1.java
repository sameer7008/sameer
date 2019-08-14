package sameer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sameertest1 {
	public class Testing {
		 
		   @Test(priority=1)
		    public void test()
		   {
		    	System.out.println("test");
		    }
		    @AfterClass
		    public void  Afterclass()
		    {
		    	System.out.println("afterclass");
		    }
		    @AfterTest
		    public void aftertest()
		    {
		    	System.out.println("after test");
		    }
		    @AfterMethod
		    public void aftersuit()
		    {
		    	System.out.println("aftermethod");
		    }
		    @BeforeClass
		    public void beforeclass()
		    {
		    	System.out.println("beforeclass");
		    }
		    @BeforeMethod
		    public void BeforeMethod()
		    {
		    	System.out.println("beforemethod");
		    }



	   
 public class Demo1 {
		        @Test
		        public void test1()
		        {
		        	System.out.println("Test1");
		        }
		        @AfterClass
		        public void  Afterclass()
		        {
		        	System.out.println("Afterclass");
		        }
		        @AfterTest
		        public void aftertest()
		        {
		        	System.out.println("After test");
		        	
		        }
		        @AfterMethod
		        public void aftersuit() 
		        {
		        	System.out.println("Aftermethod");
		        }
		        @BeforeClass
		        public void beforeclass()
		        {
		        	System.out.println("Beforeclass");
		        }
		        @BeforeMethod
		        public void BeforeMethod()
		        {
		        	System.out.println("Beforemethod");
		        }
  }
		    
		    
		    
     public class Sameer{
		        	@Test(priority=6)
		        	public void Sameer1() 
		        	{
		        		
		        	System.out.println("sameer");
		        	}
		        
		    }

     }





}
