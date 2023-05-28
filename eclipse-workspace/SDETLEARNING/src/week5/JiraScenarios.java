package week5;

import java.awt.Window;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.SessionId;

public class JiraScenarios {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		  options.addArguments("--incognito");
		  ChromeDriver driver = new ChromeDriver(options);
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://id.atlassian.com/login");
		  driver.findElement(By.id("username")).sendKeys("sgangadaran06@gmail.com");
		  driver.findElement(By.id("login-submit")).click();
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ganga@123");
		  driver.findElement(By.id("login-submit")).click();
		  driver.findElement(By.xpath("//div[text()='Jira Software']")).click();
		  driver.findElement(By.xpath("//input[@name='search']")).sendKeys("test");
		  String expected = driver.findElement(By.xpath("//div[@class='css-131e90u']/h4")).getText();
		  if (expected.equals("You don't have any software projects")) {
			System.out.println("pass");
		  }else {
			System.out.println("fail");
          };
          
          driver.findElement(By.xpath("//span[@aria-label='Clear']")).click();
          driver.findElement(By.xpath("//input[@name='search']")).sendKeys("SDET23");
          driver.findElement(By.xpath("//span[text()='SDET23']")).click();
          List<WebElement> listOfIssues = driver.findElements(By.xpath("//*[contains(text(),'SDET-')]"));
          System.out.println(listOfIssues);
          driver.switchTo().newWindow(WindowType.TAB);
          Set<String> windowHandles = driver.getWindowHandles();
          for (String handle : windowHandles) {
              
              driver.switchTo().window(handle);
          }
          driver.get("https://gangasdet.atlassian.net/jira/software/projects/SDET/boards/1");
          driver.findElement(By.xpath("//span[text()='Create']")).click();
		  driver.findElement(By.xpath("//input[@name='summary']")).sendKeys("AutomateJira");
		  driver.findElement(By.xpath("//span[text()='Automatic']")).click();
		  driver.findElement(By.xpath("//span[text()='Assign to me']")).click();
		  driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
		  driver.close();
		  driver.switchTo().window(windowHandles.iterator().next());
		  driver.navigate().refresh();
		  WebElement element = driver.findElement(By.xpath("//*[text()='AutomateJira']"));
		  if (element.isDisplayed()) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		 
		  driver.findElement(By.xpath("//span[text()='Create']")).click();
		  driver.findElement(By.xpath("//*[text()='Story']")).click();
	      driver.findElement(By.xpath("//*[text()='Bug']")).click();
	      driver.findElement(By.xpath("//input[@name='summary']")).sendKeys("linkedIssue");
	      driver.findElement(By.xpath("//*[text()='blocks']")).click();
	      driver.findElement(By.xpath("//*[text()='is blocked by']")).click();
	      driver.findElement(By.xpath("//*[text()='Select Issue']")).sendKeys("AutomateJira");
	      driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
	      driver.findElement(By.xpath("//*[text()='linkedIssue']")).click();
	      driver.findElement(By.xpath("//*[text()='To Do']")).click();
	      driver.findElement(By.xpath("//*[text()='Done']")).click();
	      driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
	      WebElement element2 = driver.findElement(By.xpath("//span[text()='tes']/following::span[2]"));
	      if (element2.isDisplayed()) {
			System.out.println("testcasePass");
		}
	      System.out.println("testcaseFail");
	      
	      
	      
          driver.close();
          
          
          
		
	}

}
