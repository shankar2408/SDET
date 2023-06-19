package Selenium.mandatoryHomeWork.week6.day4;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createLeadLeafTaps {
	
	//Locators
	public static By usrNm_txtBx = By.id("username");
	public static String userName = "demosalesmanager";
	public static By pswd_txtBx = By.id("password");
	public static String password = "crmsfa";
	public static By lgn_btn = By.className("decorativeSubmit");
	public static By crmsfa_link = By.cssSelector(".crmsfa div#label a");
	public static By leads_tab = By.xpath("//div[@class = 'x-panel-header']//a[text() = 'Leads']");
	public static By createleads_tab = By.xpath("//a[text() = 'Create Lead']");
	public static By companyName_txt = By.id("createLeadForm_companyName");
	public static By frstNm_txtBx = By.id("createLeadForm_firstName");
	public static By lstNm_txtBx = By.id("createLeadForm_lastName");
	public static By frstNmLcl_txtBx = By.id("createLeadForm_firstNameLocal");
	public static By dprtmnt_txtBx = By.id("createLeadForm_departmentName");
	public static By dscrption_txtBx = By.id("createLeadForm_description");
	public static By emlAdrs_txtBx = By.id("createLeadForm_primaryEmail");
	public static By stat_r_Prvoinc_drpdwn = By.id("createLeadForm_generalStateProvinceGeoId");
	public static By crtLead_btn = By.className("smallSubmit");
	public static By page_Title = By.tagName("title");
		
	
	public static void clckEle(WebDriverWait wait, Actions act, WebDriver driver, By locator) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		}
		catch (Exception e) {
			act.click(driver.findElement(locator)).build().perform();
		}
	}
	
	public static void sndTxt2Ele(WebDriverWait wait, Actions act, WebDriver driver, By locator, String input) throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
			Thread.sleep(2000);
			act.sendKeys(Keys.END).perform();
			act.sendKeys(Keys.LEFT_SHIFT, Keys.HOME, Keys.BACK_SPACE).perform();
			act.sendKeys(input).build().perform();
		}
		catch (Exception e) {
			act.click(driver.findElement(locator)).build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.END).perform();
			act.sendKeys(Keys.LEFT_SHIFT, Keys.HOME, Keys.BACK_SPACE).perform();
			act.sendKeys(input).build().perform();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");

		ChromeDriver dr = new ChromeDriver(opt);
		Actions act = new Actions(dr);
		
		//Launch URL http://leaftaps.com/opentaps/control/login
		dr.get("http://leaftaps.com/opentaps/control/login");
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(30));
		/*---------------------------------------------------------------*/
		
		//Enter UserName and Password Using Id Locator
		sndTxt2Ele(wait, act, dr, usrNm_txtBx, userName);

		sndTxt2Ele(wait, act, dr, pswd_txtBx, password);
		
		//Click on Login Button using Class Locator
		clckEle(wait, act, dr, lgn_btn);
		
		//Click on CRM/SFA Link
		clckEle(wait, act, dr, crmsfa_link);
		
		//Click on Leads Button
		clckEle(wait, act, dr, leads_tab);
		
		//Click on Create Lead
		clckEle(wait, act, dr, createleads_tab);
		
		//Enter CompanyName Field Using id Locator
		sndTxt2Ele(wait, act, dr, companyName_txt, "KBS Fire");
		
		//Enter FirstName Field Using id Locator
		sndTxt2Ele(wait, act, dr, frstNm_txtBx, "Shankar");
		
		//Enter LastName Field Using id Locator
		sndTxt2Ele(wait, act, dr, lstNm_txtBx, "Mgs");
		
		//Enter FirstName(Local) Field Using id Locator
		sndTxt2Ele(wait, act, dr, frstNmLcl_txtBx, "Thambi");
		
		//Enter Department Field Using any Locator of Your Choice
		sndTxt2Ele(wait, act, dr, dprtmnt_txtBx, "QA/ SDET");
		
		//Enter Description Field Using any Locator of your choice
		sndTxt2Ele(wait, act, dr, dscrption_txtBx, "Work as an SDET");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		sndTxt2Ele(wait, act, dr, emlAdrs_txtBx, "shankarsharks@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(stat_r_Prvoinc_drpdwn));
		Select slct = new Select(dr.findElement(stat_r_Prvoinc_drpdwn));
		slct.selectByVisibleText("New York");
		
		//Click on Create Button
		clckEle(wait, act, dr, crtLead_btn);
		
		//Validate the Title of Resulting Page
		String title = dr.getTitle();
		assertTrue(title.equals("View Lead | opentaps CRM"), "page title is not matching");
		
		//Quit the browser.
		dr.quit();		
	}

}
