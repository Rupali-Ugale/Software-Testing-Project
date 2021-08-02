package Seleniumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Automation_MiniProject {

	public static void main(String[] args) throws InterruptedException 
	{
		

	     ////TC01- To Launch the browser & check the functionality Guru99 demo tour website 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium JAR\\chromedriver.exe");
		 WebDriver w = new ChromeDriver();
		

		w.get("http://demo.guru99.com/test/newtours/register.php "); 
		System.out.println("Title of Page is"  + w.getTitle());
		
		//TC02- To Check Functionality of Register button
		w.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();  
		System.out.println("Register button is working ");



	    w.findElement(By.name("firstName")).sendKeys("Rupali");
		
	    w.findElement(By.name("lastName")).sendKeys("Ugale");
	    w.findElement(By.name("phone")).sendKeys("9497823450");
	    w.findElement(By.id("userName")).sendKeys("rupaliugale61@gmail.com");
		
	
        Thread.sleep(3000);
        w.findElement(By.name("address1")).sendKeys("Mahalakshmi Bunglow, flat no.5 ");
        w.findElement(By.name("city")).sendKeys("Pune");
        w.findElement(By.name("state")).sendKeys("Maharashtra");
        w.findElement(By.name("postalCode")).sendKeys("422306");
        Thread.sleep(3000);
        
        
        Select s= new Select(w.findElement(By.name("country")));                                            
        s.selectByIndex(6);
  
        w.findElement(By.id("email")).sendKeys("rupaliugale61@gmail.com");
        w.findElement(By.name("password")).sendKeys("Rupali@1996");
        w.findElement(By.name("confirmPassword")).sendKeys("Rupali@1996");
        Thread.sleep(2000);
        w.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();
        
        
  
        System.out.println("Registration done succesfully");

         //TC03- To Check Functionality of Sign-OFF  button
        w.findElement(By.linkText("SIGN-OFF")).click();        
        System.out.println("Sign-Off button is working properly");
        
         //TC04- To Check Functionality of Sign-ON  button
         w.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();                                                    
        System.out.println("Sign -ON Button is working");
        w.findElement(By.name("userName")).sendKeys("rupaliugale61@gmail.com");
        w.findElement(By.name("password")).sendKeys("Rupali@1996");
        
        w.findElement(By.name("submit")).click();
        System.out.println("Submit Button is working");
        
        
        String S = w.findElement(By.xpath("//tbody//tr//td//h3")).getText();
        System.out.println("Show Message "    +S);                                                                                                     
         
        Thread.sleep(3000);
        w.findElement(By.linkText("SIGN-OFF")).click();      //TC05: To Check functionality of Sign OFF  Button                                                                 
    
       
        Thread.sleep(3000);
         
        w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/b[1]")).click(); 	                
       
        //TC06- To check the functionality of Drag & Drop button from Selenium tab 
        w.findElement(By.xpath("//a[contains(text(),'Drag and Drop Action')]")).click();                                        
          
        
        ////TC07- To check the functionality of Drag (Bank) button from Selenium tab                         
       WebElement Drag1 = w.findElement(By.xpath("//a[contains(text(),'BANK')]"));                                                           
       
       ////TC08- To check the functionality of Drop (Account) button from Selenium tab  
       WebElement Drop1 =w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));    
       Actions act=new Actions(w);
       act.dragAndDrop(Drag1, Drop1).build().perform();
          
       Thread.sleep(3000);
       
       //TC09- To check the functionality of Drag (5000) button from Selenium tab 
       WebElement Drag2 = w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
       //TC10- To check the functionality of Drop (Amount) button from Selenium tab 
       WebElement Drop2 =w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
       act.dragAndDrop(Drag2, Drop2).build().perform();
       Thread.sleep(3000);
         
        //TC11- To check the functionality of Drag (sales) button from Selenium tab 
       WebElement Drag3= w.findElement(By.xpath("//a[contains(text(),'SALES')]"));
       //TC12- To check the functionality of Drop (Account ) button from Selenium tab
       WebElement Drop3 =w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
       act.dragAndDrop(Drag3, Drop3).build().perform();
       Thread.sleep(3000);
       
        //TC13- To check the functionality of Drag (5000 ) button from Selenium tab
       WebElement Drag4 =w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
        //TC14- To check the functionality of Drop (Account ) button from Selenium tab
       WebElement Drop4 =w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
       act.dragAndDrop(Drag4, Drop4).build().perform();	 
        
       System.out.println("Drag & drop option is opened");
      
		w.navigate().back();
		  
		//TC15- To check the functionality of Horizontal scroll Bar  from Selenium tab                                                                                                    // for scrolling operation
		
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/b[1]")).click();                               
		   
		w.findElement(By.linkText("Scrollbar Demo")).click();
		w.manage().window().maximize();
			
		//For horizontal scrolling upto mobile testing element  ////scrolling from left that is start point naming as argument 0.e index value0 to the element which we want to open
				
		WebElement Element= w.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		JavascriptExecutor js= (JavascriptExecutor ) w;                                                                //
		
		js.executeScript("arguments[0].scrollIntoView()", Element);                                                   
		Element.click();      
        
        w.navigate().back();
        w.navigate().back();
     
        Thread.sleep(2000);
        
        w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/b[1]")).click(); 
       
        //TC016:  To check the functionality of Tool Tip buttton  from Selenium tab  
        w.findElement(By.linkText("Tooltip")).click();
         
        Thread.sleep(3000);
           
        //TC17- To check the functionality of Insurance Project Tab  
		 w.findElement(By.linkText("Insurance Project")).click();                                                    //To Check Functionality of Insurance Project tab
          
		//TC18- To check the functionality of Register button from Insurance Project Tab  
		
		w.findElement(By.xpath("//a[contains(text(),'Register')]")).click();                          //To Check Functionality of Register button in  Insurance Project tab
		  
                                                                                                        //Test case to  To check Functionality of create Button
		Select s1=new Select(w.findElement(By.id("user_title"))); 
		s1.selectByIndex(2);
		
		
		w.findElement(By.id("user_firstname")).sendKeys("Snehal");
		w.findElement(By.id("user_surname")).sendKeys("Patil");
		w.findElement(By.name("phone")).sendKeys("9050607089");
		
		Select s2=new Select(w.findElement(By.id("user_dateofbirth_1i")));
		s2.selectByIndex(3);
		
		Select s3=new Select(w.findElement(By.id("user_dateofbirth_2i")));
		s3.selectByIndex(4);
		
		
		Select s4=new Select(w.findElement(By.id("user_dateofbirth_3i")));
		s4.selectByValue("15");
		
		 
		w.findElement(By.xpath("//input[@id='licencetype_f']")).click();
		Select s5=new Select(w.findElement(By.id("user_licenceperiod")));
        s5.selectByIndex(3);
		
		Select s6=new Select(w.findElement(By.name("occupation")));
		s6.selectByVisibleText("Student");
		
		w.findElement(By.name("street")).sendKeys("Bhagwati Bunglow, Blue Colony");
		w.findElement(By.name("city")).sendKeys("Mumbai");
		w.findElement(By.name("county")).sendKeys("India");                                                             //Non-Functional defect ....country spell is wrongly spelled...as county
		w.findElement(By.name("post_code")).sendKeys("443567");
		w.findElement(By.name("email")).sendKeys("senhalpatil14@gmail.com");
		w.findElement(By.name("password")).sendKeys("43210");
		w.findElement(By.name("c_password")).sendKeys("43210");
	
		// Tc19 - To check Functionality of create Button
		w.findElement(By.xpath("//body/div[3]/form[1]/div[5]/input[2]")).click();                           
	        
		Thread.sleep(2000);
		//Tc20To Check Functionality of login button                                                                    //Scenario: Login button
        w.findElement(By.name("email")).sendKeys("senhalpatil14@gmail.com");
		w.findElement(By.name("password")).sendKeys("43210");
		 
		w.findElement(By.xpath("//body/div[3]/form[1]/div[3]/input[1]")).click();
      
		System.out.println("Logged in succesfully for insurance project");                                     
	    
		 
		//Tc21 To Check Functionality of Logout button	
		w.findElement(By.xpath("//body/div[3]/form[1]/input[1]")).click();                                                //Scenario : logout Button
		System.out.println("Logout done Successfully");

		//Tc22 To Check Functionality of SEO button	
        w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[11]/a[1]")).click();
        Thread.sleep(2000);
        //Tc23 To Check Functionality of Page-1 of SEO button	
        w.findElement(By.linkText("Page-1")).click();
        JavascriptExecutor Js= (JavascriptExecutor ) w;                                            //It is interface to convert webdriver object to javascript object
		
		Js.executeScript("window.scrollTo(0,document.body.scrollHeight)", ""); 
		w.findElement(By.linkText("Java")).click();
		System.out.println("Title of page is"  + w.getTitle());
		
     	w.navigate().to("http://demo.guru99.com/test/newtours/register.php");
 
    
     	
     	//Tc24 To Check Functionality of radio button & check box
     	w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/b[1]")).click();   
     	w.findElement(By.linkText("Radio & Checkbox Demo")).click();
     	System.out.println("Radio & checkbox button is working");
     	Thread.sleep(2000);
     	w.findElement(By.id("vfb-7-2")).click();
     	Thread.sleep(2000);
     	w.findElement(By.id("vfb-6-2")).click();
     	
     	System.out.println("Radio button & checkbox is working");
     	w.navigate().back();
     	
     	//Tc25 To Check Functionality of "Agile project tab"
     	w.findElement(By.linkText("Agile Project")).click();
     	System.out.println("Agile project tab is opend");
  
     	
        
         w.close();
}
    	

	}


