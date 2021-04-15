

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Demo_Tour22 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		WebDriverManager.chromedriver().browserPath(" 89.0.4389.82").setup();
		  WebDriverManager.chromedriver().setup();
		  WebDriver w= new ChromeDriver();
		  
		  w.get("http://demo.guru99.com/test/newtours/register.php");
		  w.manage().window().maximize();
		  
		  
		  System.out.println(w.getCurrentUrl());
		  
		  
			w.findElement(By.linkText("REGISTER")).click();
			
			w.findElement(By.name("firstName")).sendKeys("Rohini");
				w.findElement(By.name("lastName")).sendKeys("Thakare");
				w.findElement(By.name("phone")).sendKeys("123456");
				w.findElement(By.id("userName")).sendKeys("rohini@gmail.com");
				w.findElement(By.name("address1")).sendKeys("abcd");
				w.findElement(By.name("city")).sendKeys("Chandrapur");
				w.findElement(By.name("state")).sendKeys("MH");
				w.findElement(By.name("postalCode")).sendKeys("442401");
				
				Select s= new Select(w.findElement(By.name("country")));
				s.selectByValue("INDIA");
				
				w.findElement(By.id("email")).sendKeys("rohini@gmail.com");
				w.findElement(By.name("password")).sendKeys("1234");
				w.findElement(By.name("confirmPassword")).sendKeys("1234");
				w.findElement(By.name("submit")).click();
				
				System.out.println("Register Successful Done with valid UserName and Password");
				w.navigate().back();
				
				w.findElement(By.className("dropdown-toggle")).click();
				   w.findElement(By.linkText("Accessing Link")).click();
				   w.findElement(By.linkText("click here")).click();
				   w.navigate().back();
				   
				   w.findElement(By.linkText("Insurance Project")).click();
				   w.findElement(By.linkText("Register")).click();
				   
				   Select s9= new Select(w.findElement(By.id("user_title")));
				   s9.selectByVisibleText("Mrs");
				   
				   w.findElement(By.id("user_firstname")).sendKeys("Shruti");
				   w.findElement(By.id("user_surname")).sendKeys("Sharma");
				   w.findElement(By.id("user_phone")).sendKeys("9876543210");
				   
				   Select s10= new Select(w.findElement(By.id("user_dateofbirth_1i")));
				   s10.selectByVisibleText("1954");
				   
				   Select s11= new Select(w.findElement(By.name("month")));
				   s11.selectByVisibleText("December");
				   
				   Select s12= new Select(w.findElement(By.name("date")));
				   s12.selectByVisibleText("21");
				   
				   w.findElement(By.name("licencetype")).click();
				   
				   Select s13= new Select(w.findElement(By.name("licenceperiod")));
				   s13.selectByVisibleText("2");
				   
				   Select s14= new Select(w.findElement(By.name("occupation")));
				   s14.selectByVisibleText("Actor");
				   
				   w.findElement(By.name("street")).sendKeys("Tukum");
				   w.findElement(By.name("city")).sendKeys("Nagpur");
				   w.findElement(By.name("county")).sendKeys("India");
				   w.findElement(By.name("county")).clear();
				   w.findElement(By.name("post_code")).sendKeys("43267");
				   w.findElement(By.name("email")).clear();
				   w.findElement(By.name("email")).sendKeys("shruti@gmail.com");
				   w.findElement(By.name("password")).sendKeys("12334");
				   w.findElement(By.name("c_password")).sendKeys("12334");
				   
				   w.findElement(By.name("submit")).click();

				   w.findElement(By.name("email")).sendKeys("shruti@gmail.com");
				   w.findElement(By.name("password")).sendKeys("12334");
				   w.findElement(By.name("submit")).click();
				   w.findElement(By.className("button_to")).click();
                                                                              w.navigate().to("http://demo.guru99.com/test/newtours/");  
				w.findElement(By.name("userName")).sendKeys("Rohini");
				  w.findElement(By.name("password")).sendKeys("rohini");
				  w.findElement(By.name("submit")).click();
				  
				  TakesScreenshot t= (TakesScreenshot) w;
				  File src= t.getScreenshotAs(OutputType.FILE);
				Files.copy(src,new File("C:\\Users\\VAIBHAV\\Desktop\\ScreenShot_Floder\\p7.png"));
				
				Thread.sleep(3000);
				
				w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a\r\n"));

				  
				  List<WebElement> lists= w.findElements(By.tagName("a"));
				  int total= lists.size();
				  System.out.println("Total link are= "+total);
				  
				  for(int i=0; i<total; i++)
				  {
					  lists=w.findElements(By.tagName("a"));
					  System.out.println(" "+lists.get(i).getText());
					  lists.get(i).click();
					  
					  Thread.sleep(2000);
					  if(w.getTitle().contains("Under"))
					  {
						  System.out.println("Link is under construction");
					  }
					  else
					  {
						  System.out.println("Link is working");
					  }
					  
				   w.findElement(By.linkText("Home")).click();
				  w.findElement(By.linkText("Flights")).click();
				  
				  w.findElement(By.name("tripType")).click();
				  
				  Select s1= new Select(w.findElement(By.name("passCount")));
				  s1.selectByVisibleText("2");
				  
				  Select s2= new Select(w.findElement(By.name("fromPort")));
				  s2.selectByVisibleText("London");
				  
				  Select s3= new Select(w.findElement(By.name("fromMonth")));
				  s3.selectByVisibleText("May");
				  
				  Select s4= new Select(w.findElement(By.name("fromDay")));
				  s4.selectByVisibleText("1");
				  
				  Select s5= new Select(w.findElement(By.name("toPort")));
				  s5.selectByVisibleText("Seattle");
				  
				  Select s6= new Select(w.findElement(By.name("toMonth")));
				  s6.selectByVisibleText("June");
				  
				  w.findElement(By.name("servClass")).click();
				  
				 Select s7= new Select(w.findElement(By.name("airline")));
				 s7.selectByVisibleText("Blue Skies Airlines");
				 
				 w.findElement(By.name("findFlights")).click();
				 
				  w.findElement(By.linkText("Home")).click();

				  w.findElement(By.linkText("Hotels")).click();
					 w.navigate().to("http://demo.guru99.com/test/newtours/");
					 
					  w.findElement(By.linkText("Car Rentals")).click();
					  w.findElement(By.linkText("Home")).click();
					  
					  w.findElement(By.linkText("Cruises")).click();
					  
					  w.findElement(By.linkText("Destinations")).click();
					  w.findElement(By.linkText("Home")).click();
					  
					  w.findElement(By.linkText("Vacations")).click();
					  
					  w.findElement(By.className("dropdown-toggle")).click();
					  
					  w.findElement(By.linkText("Login")).click();
					  
					  JavascriptExecutor js= (JavascriptExecutor) w;
					  js.executeScript("arguments[0].value='rohini@gmail.com'", w.findElement(By.id("email")));
					  js.executeScript("arguments[0].value='1234'", w.findElement(By.id("passwd")));
					  w.findElement(By.id("SubmitLogin")).click();
					  w.navigate().back();
					  
					 
					  
					  w.getTitle();
					  System.out.println(w.getTitle());

					  
					  
					  if(w.getTitle().equals("Welcome: Mercury Tours"))
						{
							w.findElement(By.name("userName")).sendKeys("Rohini");
							w.findElement(By.name("password")).sendKeys("rohini");
							w.findElement(By.name("submit")).click();
							System.out.println("Login Successfully Done after getting correct title");
						}
						
						else
						{
							System.out.println("Login Failed after getting incorrect title");

						}
				  }
				  
				   
				   
				   


				   
				  
				  w.close();
	}
}

