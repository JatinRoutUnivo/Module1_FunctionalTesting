package Amity.Online;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module1_FunctionalTesting {

	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	@FindBy(xpath = "//img[@alt='amity-logo']")   //Amity Logo
	WebElement amitylogoElement;

	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]") //ProgramButton
	WebElement programButtonElement;

	@FindBy(xpath = "//span[@class='mr-1 uppercase laptop:font-medium header_menuText__KlhzO'][normalize-space()='CAREER SERVICES']") //Career Services
	WebElement careerServicesButttonElement;

	@FindBy(xpath = "//span[@class='mr-1 uppercase laptop:font-medium header_menuText__KlhzO'][normalize-space()='ADVANTAGES']") //Advantages
	WebElement advanragesButtonElement;

	@FindBy(xpath = "//div[@class='header_searchIcon__bLdgL header_searchIconNew__5aGyK']") //SearechButton
	WebElement SearchButtonElement;

	@FindBy(xpath = "//span[@class='font-bold mr-0']")  //Call us
	WebElement callUsElement;

	@FindBy(xpath = "//button[contains(@class,'button_root__RRK9v header_mr__77w6i header_studentLogin__AsDQf headFootSprite button_w__W8vEM button_o__u2jyu')]//span[contains(@class,'uppercase font-raleway')][normalize-space()='STUDENT LOGIN']") //Student login
	WebElement StudentLoginElement;

	@FindBy(xpath = "//a[contains(@class,'button_root__RRK9v header_mr__77w6i button_y__dAepQ')]//span[contains(@class,'uppercase font-raleway')][normalize-space()='ENROLL NOW']")  //Enroll Now
	WebElement enrollNowButtonElement;

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']//div[@class='HeroCarousel_HearoCarousel__gradient__oBG4Y']//div[@class='HeroCarousel_HearoCarousel__content__0LDqL']//div//span[@class='uppercase font-raleway'][normalize-space()='Apply Now']")  //Apply Now
	WebElement applyNoWebElement;

	@FindBy(xpath = "//img[@alt='call-button']")  //Callicon
	WebElement CalliconElement;

	@FindBy(xpath = "//img[@alt='whatsapp-link']")  //Whatsapp
	WebElement whatsappIconElement;

	@FindBy(xpath = "//div[@class='styles_ctaBtn__BqEmG']//a[@class='button_root__RRK9v button_b__2Obj5 button_o__u2jyu']")  //ViewAll
	WebElement viewAllElement;

	@FindBy(xpath = "//button[@class='button_root__RRK9v BannerCard_ctaBtn__FMctQ button_w__W8vEM button_o__u2jyu']")  //Request a call
	WebElement requestaCallElement;

	@FindBy(xpath = "//a[@href='/news']//span[@class='uppercase font-raleway'][normalize-space()='View all']")  //View all Stay
	WebElement viewallStayElement;

	@FindBy(xpath = "//a[@href='/blog']//span[@class='uppercase font-raleway'][normalize-space()='View all']")  //View all blog
	WebElement viewallBlogElement;

	@FindBy(xpath = "//span[normalize-space()='KNOW MORE']")  // Know more element
	WebElement knowMorElement;

	@FindBy(xpath = "//a[@class='button_root__RRK9v BannerCard_ctaBtn__FMctQ button_y__dAepQ']//span[@class='uppercase font-raleway'][normalize-space()='Apply Now']")  // Apply Now CTA
	WebElement apllyNowCTAlElement;

	@FindBy(xpath = "//span[normalize-space()='show more']")  // show more element
	WebElement showMorElement;

	@FindBy(xpath = "//a[normalize-space()='About us']")  // About us
	WebElement aboutusElement;

	@FindBy(xpath = "//a[normalize-space()='Career services']")  // Career Services
	WebElement careerServicesElement;

	@FindBy(xpath = "//a[normalize-space()='Student stories']")  // Student Stories 
	WebElement Studentstories;

	@FindBy(xpath = "//a[normalize-space()='Leadership']")  // Leadership 
	WebElement leadershipelement;

	@FindBy(xpath = "//a[normalize-space()='Corporate']")  // Corporate 
	WebElement corporate;

	@FindBy(xpath = "//a[normalize-space()='Contact us']")  // Contact-us 
	WebElement contactus;

	@FindBy(xpath = "//a[normalize-space()='T & C']")  // T&C 
	WebElement terms;

	@FindBy(xpath = "//a[normalize-space()='Student support']")  // Student Support 
	WebElement studentSupportElement;

	@FindBy(xpath = "/html[1]/body[1]/footer[1]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")  // Intellectual property 
	WebElement Intellectualproperty;

	@FindBy(xpath = "//a[normalize-space()='UGC Approvals']")  // UGC Approvals
	WebElement UGC;

	@FindBy(xpath = "//a[normalize-space()='Resources']")  // Resources
	WebElement resources;

	@FindBy(xpath = "//a[normalize-space()='Blog']")  // Blog
	WebElement Blog;

	@FindBy(xpath = "//a[normalize-space()='Media']")  // Media
	WebElement media;

	//////////--------------------------UG Programs------------------------------------//////////////////////////////////////////////////

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Computer Applications']")  // Bachelor of Computer Applications
	WebElement BCAprogram;

	@FindBy(xpath = "/html[1]/body[1]/footer[1]/div[1]/div[2]/div[1]/ul[2]/li[3]/a[1]")  // BCA with specialization in Cloud & Security
	WebElement BCASpec;

	@FindBy(xpath = "//a[normalize-space()='BCA with specialization in Data Analytics']")  // BCA with specialization in Data Analytics
	WebElement BCAdataAnalytics;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Business Administration']")  // Bachelor of Business Administration
	WebElement BBA;

	@FindBy(xpath = "//a[contains(text(),'Bachelor of Arts (Journalism and Mass communicatio')]")  // Bachelor of Arts (Journalism and Mass communication)
	WebElement BAJandM;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Commerce']")  // Bachelor of Commerce
	WebElement Bcom;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts']")  // Bachelor of Arts
	WebElement BA;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Art (Kannada Medium)']")  // Bachelor of Art (Kannada Medium)
	WebElement BAKannada;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Malayalam Medium)']")  // Bachelor of Arts (Malayalam Medium)
	WebElement BAMalayalam;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Tamil Medium)']")  // Bachelor of Arts (Tamil Medium)
	WebElement BATamil;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Telugu Medium)']")  // Bachelor of Arts (Telugu Medium)
	WebElement BATelugu;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Hindi Medium)']")  // Bachelor of Arts (Hindi Medium)
	WebElement BAHindi;

	@FindBy(xpath = "//a[contains(text(),'B.Com with Specialization in International Finance')]")  // B.Com with Specialization in International Finance & Accounting
	WebElement BcomFinance;

	@FindBy(xpath = "//a[normalize-space()='Bachelor Of Commerce (Honours)']")  // Bachelor Of Commerce (Honours)
	WebElement BcomHonours;

	@BeforeTest
	public void GenerateReport() {


		//reporter=new ExtentHtmlReporter("C:\\Users\\admin\\eclipse-workspace\\Report\\ExtentReport\\FunctionalTestReport.html");
		String jenkinsWorkspacePath = System.getProperty("user.dir") + "/ExtentReport/Module1_FunctionalTesting.html";
		reporter = new ExtentHtmlReporter(jenkinsWorkspacePath);


		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("Functional Test report");
		reporter.config().setTimeStampFormat("dd-MM-yyyy HH:mm");

		reports = new ExtentReports();
		reports.attachReporter(reporter);



	}

	@AfterTest
	public void CloseReport() {
		reports.flush();

	}



	@BeforeMethod
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();

		// Setup ChromeOptions to enable headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless"); 
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://amityonline.com/");
		// Add a wait to ensure the page is loaded
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));


		// Initialize WebElementss
		PageFactory.initElements(driver, this);


	}

/*	@Test (priority = 1)

	public void AmityLogo() {
		test=reports.createTest("Amity_Logo");
		if(amitylogoElement.isDisplayed()) {
			test.log(Status.PASS, "Amity logo Verified");
			System.out.println("Amity Logo displayed");
			Assert.assertTrue(true);

		}else {
			test.log(Status.FAIL, "Amity logo not Verified");
			System.out.println("Amity Logo is not Displayed");
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 2)
	public void ProgramsHeaderButton(){
		test=reports.createTest("Program_Button");
		//programButtonElement.click();
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", programButtonElement);
			Thread.sleep(2000);
			WebElement Allprograms = driver.findElement(By.xpath("//body/header[contains(@class,'container z-[1]')]/div[contains(@class,'mt-2 bg-primary-blue text-white mb-3 xl:mt-5 xl:flex xl:justify-between xl:items-center header_containerRadius__HLowV')]/div[contains(@class,'header_desktopMenu__TgI48')]/div[contains(@class,'header_menuContainer__00BgW')]/div[contains(@class,'flex items-center group w-max header_menuItem__2qruK')]/div[contains(@class,'container w-full fixed header_programMenu__D5RVR')]/div[contains(@class,'ProgramsMenu_container__RPdmP program-menu rounded-2xl relative')]/div[2]/div[1]"));
			if(Allprograms.getText().equals("All Programs")) {			
				test.log(Status.PASS, "Program button is working");
				System.out.println("Program button is working");
				Assert.assertTrue(true);

			}
			else {
				test.log(Status.FAIL, "Program button is not working");
				System.out.println("Program button is not working");
				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			test.log(Status.FAIL, "Search button element not found: " + e.getMessage());
			Assert.fail("Search button element not found: " + e.getMessage()); 
		}catch (Exception e) {
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			Assert.fail("An unexpected error occurred: " + e.getMessage()); 
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());
			driver.close();	
		}


	}


	@Test(priority = 3)
	public void CareerServicesHeaderButton() throws InterruptedException{
		test=reports.createTest("Career_Services");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", careerServicesButttonElement);
			Set<String> windowhandle1 = driver.getWindowHandles();
			List<String> handle6 = new ArrayList<String>();
			handle6.addAll(windowhandle1);
			Thread.sleep(2000);
			driver.switchTo().window(handle6.get(1));
			String CareerServicesURL = "https://amityonline.com/career-services";
			String ActualURL = driver.getCurrentUrl();
			if(ActualURL.equals(CareerServicesURL)) {
				test.log(Status.PASS, "Career Service Button is working");
				System.out.println("Career Service Button is working");
				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Career Service Button is not working");
				System.out.println("Career Service Button is not working");
				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			test.log(Status.FAIL, "Search button element not found: " + e.getMessage());
			Assert.fail("Search button element not found: " + e.getMessage()); 
		}catch (Exception e) {
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			Assert.fail("An unexpected error occurred: " + e.getMessage()); 
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());
			driver.close();	
		}
	}

	@Test(priority = 4)
	public void AdvantagesHeaderButton(){
		test=reports.createTest("Advantages_Button");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", advanragesButtonElement);
			String ExpadvanrageelementURL = "https://amityonline.com/amity-online-advantage";
			if(driver.getCurrentUrl().equals(ExpadvanrageelementURL)) {
				test.log(Status.PASS, "Advantages button is working");
				System.out.println("Advantages button is working");
				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Advantages button is not working");
				System.out.println("Advantages button is not working");
				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			test.log(Status.FAIL, "Search button element not found: " + e.getMessage());
			Assert.fail("Search button element not found: " + e.getMessage()); 
		}catch (Exception e) {
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			Assert.fail("An unexpected error occurred: " + e.getMessage()); 
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());
		}
	} 

	@Test(priority = 5)
	public void SearchHeaderButton(){
		test=reports.createTest("Search_Button");
		try {
			if(SearchButtonElement.isEnabled()) {
				System.out.println("Search button is working");
				test.log(Status.PASS, "Search button is working");
			} else {
				System.out.println("Search button is not working");
				test.log(Status.FAIL, "Search button is not working");
				Assert.fail("Search button is not working");
			}
		}catch (NoSuchElementException e) {
			test.log(Status.FAIL, "Search button element not found: " + e.getMessage());
			Assert.fail("Search button element not found: " + e.getMessage()); 
		}catch (Exception e) {
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			Assert.fail("An unexpected error occurred: " + e.getMessage()); 
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}


	}

	@Test(priority = 6)
	public void CallusHeaderButton() throws InterruptedException{
		test=reports.createTest("Call Us_Header button");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", callUsElement);
			Thread.sleep(2000);
			String handle2 = driver.getWindowHandle();
			driver.switchTo().window(handle2);
			driver.findElement(By.xpath("//div[@class='border border-blu bg-white padding-0-imp Modal_dialog__e3Pgf']//*[name()='svg']")).click();
			if(callUsElement.isEnabled()) {
				test.log(Status.PASS, "Call us button is working");
				System.out.println("Call us button is working");
				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Call us button is not working");
				System.out.println("Call us button is not working");
				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Call us button is not working: " + e.getMessage());
			System.out.println("Call us button is not working");
			Assert.fail(" Call us button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}



	@Test(priority = 7)
	public void StudentLoginHeaderButton() throws InterruptedException{
		test=reports.createTest("Student Login_Header Button");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", StudentLoginElement);
			String handle = driver.getWindowHandle();
			driver.switchTo().window(handle);
			Thread.sleep(2000);
			WebElement exptextStudentlogin = driver.findElement(By.xpath("//*[text()='Student Login']"));
			if(exptextStudentlogin.getText().equals("Student Login")) {
				test.log(Status.PASS, "Student login_button is working");
				System.out.println("Student login_button is working");
				Assert.assertTrue(true);


			}else {
				test.log(Status.FAIL, "Student login_button is not working");
				System.out.println("Student login_button is not working");
				Assert.assertTrue(false);

			}



		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Student login_button element not found: " + e.getMessage());
			System.out.println("Student login_button element not found");
			Assert.fail("Student login_button element not found.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}


	@Test(priority = 8)
	public void EnrollNowHeaderButton(){
		test=reports.createTest("Enroll Now_Header Button");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", enrollNowButtonElement);
			String Expectedurl = "https://application.amityonline.com/admission/home/signup";
			if(driver.getCurrentUrl().equals(Expectedurl)) {
				test.log(Status.PASS, "Enroll Now Button is working");
				System.out.println("Enroll Now Button is working");
				Assert.assertTrue(true);

			}else {
				test.log(Status.FAIL, "Enroll Now Button is not working");
				System.out.println("Enroll Now Button is not working");
				Assert.assertTrue(false);

			}

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Enroll Now Button is not working: " + e.getMessage());
			System.out.println("Enroll Now Button is not working");
			Assert.fail("Enroll Now Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		} catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}



	@Test(priority = 9)
	public void ApplyNowHerocardButton() throws InterruptedException{
		test=reports.createTest("Apply Now_button Herocard");
		Thread.sleep(2000);
		try {
			applyNoWebElement.click();
			String handle3 = driver.getWindowHandle();
			driver.switchTo().window(handle3);
			Thread.sleep(3000);
			WebElement apply = driver.findElement(By.xpath("//h2[normalize-space()='Connect with our counsellor']"));
			if(apply.getText().equals("Connect With Our Counsellor")) {
				test.log(Status.PASS, "Apply Now_button Herocard is working");
				System.out.println("Apply Now_button Herocard is working");
				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Apply Now_button Herocard is not working");		
				System.out.println("Apply Now_button Herocard is not working");
				Assert.assertTrue(false);

			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Apply Now_button Herocard is not working: " + e.getMessage());
			System.out.println("Apply Now_button Herocard is not working");
			Assert.fail("Apply Now_button Herocard is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}  



	@Test(priority = 10)
	public void Callusicon() throws InterruptedException{
		test=reports.createTest("Call us icon_button");
		try {
			Assert.assertTrue(CalliconElement.isEnabled(), "Call icon button not working");
			CalliconElement.click();
			Thread.sleep(2000);
			String handle4 = driver.getWindowHandle();
			driver.switchTo().window(handle4);
			Thread.sleep(4000);
			WebElement clickcloseusicon = driver.findElement(By.xpath("//div[@class='border border-blu bg-white padding-0-imp Modal_dialog__e3Pgf']//*[name()='svg']"));
			if(clickcloseusicon.isEnabled()) {
				test.log(Status.PASS, "Call-us icon POP-UP is working");
				System.out.println("Call-us icon POP-UP is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Call-us icon POP-UP is not working");
				System.out.println("Call-us icon POP-UP is not working");

				Assert.assertTrue(false);
			}
			clickcloseusicon.click();

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Call-us icon POP-UP is not working: " + e.getMessage());
			System.out.println("Call-us icon POP-UP is not working");
			Assert.fail("Call-us icon POP-UP is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}



	}  

	@Test(priority = 11)
	public void WhatsappIcon() throws InterruptedException{
		test=reports.createTest("Whatsapp Icon_button");
		try {
			Assert.assertTrue(whatsappIconElement.isEnabled(), "Whatsapp icon button not working");
			whatsappIconElement.click();
			Thread.sleep(2000);
			Set<String> windowhandle = driver.getWindowHandles();
			List<String> handle5 = new ArrayList<String>();
			handle5.addAll(windowhandle);
			Thread.sleep(1000);
			driver.switchTo().window(handle5.get(1));
			String ExpectedWhatsappurl = "https://api.whatsapp.com/send/?phone=%2B918527901901&text=Hi&type=phone_number&app_absent=0&utm_campaign=Bot&utm_source=Website";
			String ActualURL = driver.getCurrentUrl();
			if(ActualURL.equals(ExpectedWhatsappurl)) {
				test.log(Status.PASS, "Whatsapp icon is working");
				System.out.println("Whatsapp icon is working");

				Assert.assertTrue(true);

			}else {
				test.log(Status.FAIL, "Whatsapp icon is not working");
				System.out.println("Whatsapp icon is not working");

				Assert.assertTrue(false);

			}

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Whatsapp icon is not working: " + e.getMessage());
			System.out.println("Whatsapp icon is not working");
			Assert.fail("Whatsapp icon is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}


	@Test(priority = 12)
	public void ViewAllButton(){	
		test=reports.createTest("View All_Button");
		try {
			Assert.assertTrue(viewAllElement.isEnabled(), "View All button is not working");
			Actions act2=new Actions(driver);
			act2.moveToElement(viewAllElement).click().perform();
			String expextedURL = "https://amityonline.com/programs";
			if(driver.getCurrentUrl().equals(expextedURL)) {
				test.log(Status.PASS, "View All button is working");
				System.out.println("View all button url verified.");

				Assert.assertTrue(true);

			}
			else {
				test.log(Status.FAIL, "View All button is not working");
				System.out.println("View all button url not verified.");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "View All button is not working: " + e.getMessage());
			System.out.println("View All button is not working");
			Assert.fail("View All button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());

		}


	}


	@Test(priority = 13)
	public void RequestAcallButton() throws InterruptedException{
		test=reports.createTest("Request A call_Button");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", requestaCallElement);
			//		Actions act=new Actions(driver);
			//		act.moveToElement(requestaCallElement).click().perform();
			String handle6 = driver.getWindowHandle();
			driver.switchTo().window(handle6);
			Thread.sleep(3000);
			WebElement apply2 = driver.findElement(By.xpath("//h2[normalize-space()='Connect with our counsellor']"));
			if(apply2.getText().equals("Connect With Our Counsellor")) {
				test.log(Status.PASS, "Request A call_Button is working");
				System.out.println("Request A call_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Request A call_Button is not working");
				System.out.println("Request A call_Button is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Request A call_Button is not working: " + e.getMessage());
			System.out.println("Request A call_Button is not working");
			Assert.fail("Request A call_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}


	}



	@Test(priority = 14)
	public void ViewAllStayInformed() {
		try {
			test=reports.createTest("View All Stay_Button");
			Assert.assertTrue(viewallStayElement.isEnabled(), "View All Stay_Button is not working");
			Actions act3=new Actions(driver);
			act3.moveToElement(viewallStayElement).click().perform();
			String expectedurl2 = "https://amityonline.com/news";
			if(driver.getCurrentUrl().equals(expectedurl2)) {
				test.log(Status.PASS, "View All Stay_Button is working");
				System.out.println("View All Stay_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "View All Stay_Button is not working");
				System.out.println("View All Stay_Button is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "View All Stay_Button is not working: " + e.getMessage());
			System.out.println("View All Stay_Button is not working");
			Assert.fail("View All Stay_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}


	} 

	@Test(priority = 15)
	public void ViewAllLatestBlog() {
		test=reports.createTest("View All Blogs_Button");
		try {
			Assert.assertTrue(viewallBlogElement.isEnabled(), "View All blog button is not enabled");
			Actions act4=new Actions(driver);
			act4.moveToElement(viewallBlogElement).click().perform();
			String expurl = "https://amityonline.com/blog";
			if(driver.getCurrentUrl().equals(expurl)) {
				test.log(Status.PASS, "View All Blogs_Button is working");
				System.out.println("View All Blogs_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "View All Blogs_Button is not working");
				System.out.println("View All Blogs_Button is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "View All Blogs_Button is working: " + e.getMessage());
			System.out.println("View All Blogs_Button is working");
			Assert.fail("View All Blogs_Button is working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}


	@Test(priority = 16)
	public void KnowMore() throws InterruptedException {
		test=reports.createTest("Know More_Button");
		try {
			Assert.assertTrue(knowMorElement.isEnabled(), "Know More_Button is not working");
			Actions act5=new Actions(driver);
			act5.moveToElement(knowMorElement).click().perform();
			Thread.sleep(2000);
			String expectedknowmore = "https://amityonline.com/leadership";
			if(driver.getCurrentUrl().equals(expectedknowmore)) {
				test.log(Status.PASS, "Know More_Button is working");
				System.out.println("Know More_Button is working");

				Assert.assertTrue(true);

			}else {
				test.log(Status.FAIL, "Know More_Button is not working");
				System.out.println("Know More_Button is not working");

				Assert.assertTrue(false);

			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Know More_Button is not working: " + e.getMessage());
			System.out.println("Know More_Button is not working");
			Assert.fail("Know More_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 17)
	public void ApplyNowButtonCTAs() throws InterruptedException {
		test=reports.createTest("Apply Now Botton CTA_Button");
		try {
			Actions act6=new Actions(driver);
			act6.moveToElement(apllyNowCTAlElement).click().perform();
			Thread.sleep(4000);
			Set<String> windowhandle9 = driver.getWindowHandles();
			List<String> handle9 = new ArrayList<String>();
			handle9.addAll(windowhandle9);
			driver.switchTo().window(handle9.get(0));
			String applynowbottomexpectedURL = "https://application.amityonline.com/admission/home/signup";
			if(driver.getCurrentUrl().equals(applynowbottomexpectedURL)) {
				test.log(Status.PASS, "Apply Now Botton CTA is working");
				System.out.println("Apply Now Botton CTA is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Apply Now Botton CTA is not working");
				System.out.println("Apply Now Botton CTA is not working");
				Assert.assertTrue(false);

			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Apply Now Botton CTA is not working: " + e.getMessage());
			System.out.println("Apply Now Botton CTA is not working");
			Assert.fail("Apply Now Botton CTA is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
		driver.close();
	}  

	@Test(priority = 18)
	public void Aboutus() throws InterruptedException{
		Assert.assertTrue(showMorElement.isEnabled(), "Show more button is now enabled");
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		/////////---------------------------About-us-----------------------///////////////////////////////		

		test=reports.createTest("About us_Button");
		try {
			Assert.assertTrue(aboutusElement.isEnabled(), "About us Button is not working");
			Actions act8=new Actions(driver);
			act8.moveToElement(aboutusElement).click().perform();
			Thread.sleep(2000);

			String expabtus = "https://amityonline.com/about-us";
			if(driver.getCurrentUrl().equals(expabtus)) {
				test.log(Status.PASS, "About us Button is working");
				System.out.println("About us Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "About us Button is not working");
				System.out.println("About us Button is not working");

				Assert.assertTrue(false);
			}	

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "About us Button is not working: " + e.getMessage());
			System.out.println("About us Button is not working");
			Assert.fail("About us Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 19)
	public void CareerServices() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		test=reports.createTest("CareerServices_Button");
		try {
			Assert.assertTrue(careerServicesElement.isEnabled(), "CareerServices_Button is not working");
			Actions act9=new Actions(driver);
			act9.moveToElement(careerServicesElement).click().perform();
			Thread.sleep(2000);
			Set<String> windowhandlecareer = driver.getWindowHandles();
			List<String> handlecareer = new ArrayList<String>();
			handlecareer.addAll(windowhandlecareer);
			driver.switchTo().window(handlecareer.get(1));
			String careerserviceexpurl = "https://amityonline.com/career-services";
			if(driver.getCurrentUrl().equals(careerserviceexpurl)) {
				test.log(Status.PASS, "CareerServices_Button is working");
				System.out.println("CareerServices_Button is working");
				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "CareerServices_Button is not working");
				System.out.println("CareerServices_Button is not working");

				Assert.assertTrue(false);

			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "CareerServices_Button is not working: " + e.getMessage());
			System.out.println("CareerServices_Button is not working");
			Assert.fail("ACareerServices_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

		driver.close();
	}

	@Test(priority = 20)
	public void StudentStories() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		try {
			test=reports.createTest("Student Stories_Button");
			Assert.assertTrue(Studentstories.isEnabled(), "Student Stories_Button is not working");
			Actions act10=new Actions(driver);
			act10.moveToElement(Studentstories).click().perform();
			Thread.sleep(2000);
			String Studentstoriesexpurl = "https://amityonline.com/student-story";
			if(driver.getCurrentUrl().equals(Studentstoriesexpurl)) {
				test.log(Status.PASS, "StudentStories_Button is working");
				System.out.println("Student stories url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Student Stories_Button is not working");
				System.out.println("Student Stories_Button is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Student Stories_Button is not working: " + e.getMessage());
			System.out.println("Student Stories_Button is not working");
			Assert.fail("Student Stories_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 21)
	public void Leadership() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		test=reports.createTest("Leadership_Button");
		try {
			Assert.assertTrue(leadershipelement.isEnabled(), "Leadership is not enabled");
			Actions act11=new Actions(driver);
			act11.moveToElement(leadershipelement).click().perform();
			Thread.sleep(2000);
			String leadershipexpurl = "https://amityonline.com/leadership";
			if(driver.getCurrentUrl().equals(leadershipexpurl)) {
				test.log(Status.PASS, "Leadership is working");
				System.out.println("Leadership is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Leadership is not working");
				System.out.println("Leadership is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Leadership is not working: " + e.getMessage());
			System.out.println("Leadership is not working");
			Assert.fail("Leadership is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 22)
	public void Corporate() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform(); 
		Thread.sleep(2000);
		test=reports.createTest("Corporate_Button");
		try {
			Assert.assertTrue(corporate.isEnabled(), "Corporate option is not working");
			Actions act12=new Actions(driver);
			act12.moveToElement(corporate).click().perform();
			Thread.sleep(2000);
			String Corporateexpurl = "https://amityonline.com/corporates";
			if(driver.getCurrentUrl().equals(Corporateexpurl)) {
				test.log(Status.PASS, "Corporate_Button is working");
				System.out.println("Corporate_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Corporate_Button is not working");
				System.out.println("Corporate_Button is not working");

				Assert.assertTrue(false);
			} 
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Corporate_Button is not working: " + e.getMessage());
			System.out.println("Corporate_Button is not working");
			Assert.fail("Corporate_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 23)
	public void Contactus() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform(); 
		Thread.sleep(2000);
		test=reports.createTest("Contact us_Button");
		try {
			Assert.assertTrue(contactus.isEnabled(), "Contact us option is not enabled");
			Actions act13=new Actions(driver);
			act13.moveToElement(contactus).click().perform();
			Thread.sleep(2000);
			String contactusexpurl = "https://amityonline.com/contact-us";
			if(driver.getCurrentUrl().equals(contactusexpurl)) {
				test.log(Status.PASS, "Contact us_Button is working");
				System.out.println("Contact us_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Contact us_Button is not working");
				System.out.println("Contact us_Button is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Contact us_Button is not working: " + e.getMessage());
			System.out.println("Contact us_Button is not working");
			Assert.fail("Contact us_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 24)
	public void TermsandConditions() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		test=reports.createTest("TermsandConditions_Button");
		try {
			Assert.assertTrue(terms.isEnabled(), "Terms & Conditions option is not enabled");
			Actions act14=new Actions(driver);
			act14.moveToElement(terms).click().perform();
			Thread.sleep(2000);
			String termsexpurl = "https://amityonline.com/terms-and-conditions";
			if(driver.getCurrentUrl().equals(termsexpurl)) {
				test.log(Status.PASS, "TermsandConditions_Button is working");
				System.out.println("TermsandConditions_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "TermsandConditions_Button is not working");
				System.out.println("TermsandConditions_Button is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "TermsandConditions_Button is not working: " + e.getMessage());
			System.out.println("TermsandConditions_Button is not working");
			Assert.fail("TermsandConditions_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}   

	@Test(priority = 25)
	public void StudentSupport() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		test=reports.createTest("StudentSupport_Button");
		try {
			Assert.assertTrue(studentSupportElement.isEnabled(), "StudentSupport_Button is not enabled");
			Actions act15=new Actions(driver);
			act15.moveToElement(studentSupportElement).click().perform();
			Thread.sleep(2000);
			String studentexpurl = "https://amitysupport.freshdesk.com/support/home";
			if(driver.getCurrentUrl().equals(studentexpurl)) {
				test.log(Status.PASS, "StudentSupport_Button is working");
				System.out.println("StudentSupport_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "StudentSupport_Button is not working");
				System.out.println("StudentSupport_Button is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "StudentSupport_Button is not working: " + e.getMessage());
			System.out.println("StudentSupport_Button is not working");
			Assert.fail("StudentSupport_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}  

	@Test(priority = 26)
	public void IntellectualProperty() throws InterruptedException {
		Actions act7=new Actions(driver);
		Thread.sleep(2000);
		test=reports.createTest("IntellectualProperty_Button");
		try {
			act7.moveToElement(showMorElement).click().perform();
			Thread.sleep(1000);
			Assert.assertTrue(Intellectualproperty.isEnabled(), "IntellectualProperty_Button is not enabled");
			Actions act16=new Actions(driver);
			act16.moveToElement(Intellectualproperty).click().perform();
			Thread.sleep(2000);
			String intellectualexpurl = "https://amityonline.com/ip-listing";
			Thread.sleep(3000);
			if(driver.getCurrentUrl().equals(intellectualexpurl)) {
				test.log(Status.PASS, "IntellectualProperty_Button is working");
				System.out.println("IntellectualProperty_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "IntellectualProperty_Button is not working");
				System.out.println("IntellectualProperty_Button is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "IntellectualProperty_Button is not working: " + e.getMessage());
			System.out.println("IntellectualProperty_Button is not working");
			Assert.fail("IntellectualProperty_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 27)
	public void UGCApprovals() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		test=reports.createTest("UGCApprovals_Button");
		try {
			Assert.assertTrue(UGC.isEnabled(), "UGCApprovals_Button is not working");
			Actions act17=new Actions(driver);
			act17.moveToElement(UGC).click().perform();
			Thread.sleep(2000);
			String UGCexpurl = "https://amityonline.com/ugc_regulations/";
			if(driver.getCurrentUrl().equals(UGCexpurl)) {
				test.log(Status.PASS, "UGCApprovals_Button is working");
				System.out.println("UGCApprovals_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "UGCApprovals_Button is not working");
				System.out.println("UGCApprovals_Button is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "UGCApprovals_Button is not working: " + e.getMessage());
			System.out.println("UGCApprovals_Button is not working");
			Assert.fail("UGCApprovals_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}



	@Test(priority = 28)
	public void Resource() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		test=reports.createTest("Resource_Button");
		try {
			Assert.assertTrue(resources.isEnabled(), "Resource_Button is not enabled");
			Actions act18=new Actions(driver);
			act18.moveToElement(resources).click().perform();
			Thread.sleep(4000);
			String resourcesexpurl = "https://amityonline.com/";
			if(driver.getCurrentUrl().equals(resourcesexpurl)) {
				test.log(Status.PASS, "Resource_Button is working");
				System.out.println("Resource_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Resource_Button is not working");
				System.out.println("Resource_Button is not working");

				Assert.assertTrue(false);
			} 
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Resource_Button is not working: " + e.getMessage());
			System.out.println("Resource_Button is not working");
			Assert.fail("Resource_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}


	@Test(priority = 29)
	public void Blog() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		Thread.sleep(2000);
		test=reports.createTest("Blog_Button");
		try {
			Assert.assertTrue(Blog.isEnabled(), "Blog option is not enabled");
			Actions act19=new Actions(driver);
			act19.moveToElement(Blog).click().perform();
			Thread.sleep(2000);
			String Blogexpurl = "https://amityonline.com/blog";
			if(driver.getCurrentUrl().equals(Blogexpurl)) {
				test.log(Status.PASS, "Blog_Button is working");
				System.out.println("Blog_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Blog_Button is not working");
				System.out.println("Blog_Button is not working");

				Assert.assertTrue(false);
			}

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Blog_Button is not working: " + e.getMessage());
			System.out.println("Blog_Button is not working");
			Assert.fail("Blog_Button is not working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 30)
	public void Media() throws InterruptedException {
		Actions act7=new Actions(driver);
		Thread.sleep(2000);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("Media_Button");
		try {
			WebElement Media1 = driver.findElement(By.xpath("//a[normalize-space()='Media']"));
			Actions act21=new Actions(driver);
			Thread.sleep(2000);
			act21.moveToElement(Media1).click().perform();
			Thread.sleep(2000);
			String mediaexpurl = "https://amityonline.com/news";
			if(driver.getCurrentUrl().equals(mediaexpurl)) {
				test.log(Status.PASS, "Media_Button is working");
				System.out.println("Media_Button is working");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "Media_Button is not working");
				System.out.println("Media_Button is not working");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "Media_Button is working: " + e.getMessage());
			System.out.println("Media_Button is working");
			Assert.fail("Media_Button is working.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}


	@Test(priority = 31)
	// Bachelor of Computer Applications
	public void BachelorofComputerApplications() throws InterruptedException {

		//Bachelor of Computer Applications
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofComputerApplications_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BCAprogram);
			Thread.sleep(3000);
			String ExpBCAurl = "https://amityonline.com/bachelor-of-computer-applications-online";
			if(driver.getCurrentUrl().equals(ExpBCAurl)) {
				test.log(Status.PASS, "BachelorofComputerApplications_Program url is verified");
				System.out.println("BachelorofComputerApplications_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofComputerApplications_Program url is not verified");
				System.out.println("BachelorofComputerApplications_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofComputerApplications_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofComputerApplications_Program url is not verified");
			Assert.fail("BachelorofComputerApplications_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 32)
	//BCA with specialization in Cloud & Security
	public void BCAwithspecializationinCloudandSecurity() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BCAwithspecializationinCloudandSecurity_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BCASpec);
			Thread.sleep(3000);
			String ExpBCASpurl = "https://amityonline.com/bca-cloud-security-online";
			if(driver.getCurrentUrl().equals(ExpBCASpurl)) {
				test.log(Status.PASS, "BCAwithspecializationinCloudandSecurity_Program url is verified");
				System.out.println("BCAwithspecializationinCloudandSecurity_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BCAwithspecializationinCloudandSecurity_Program url is not verified");
				System.out.println("BCAwithspecializationinCloudandSecurity_Program url is not verified");

				Assert.assertTrue(false);
			}

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BCAwithspecializationinCloudandSecurity_Program url is not verified: " + e.getMessage());
			System.out.println("BCAwithspecializationinCloudandSecurity_Program url is not verified");
			Assert.fail("BCAwithspecializationinCloudandSecurity_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 33)
	//BCA with specialization in Data Analytics
	public void BCAwithspecializationinDataAnalytics() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BCAwithspecializationinDataAnalytics_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BCAdataAnalytics);
			Thread.sleep(3000);
			String ExpBCAdataAnalytics = "https://amityonline.com/bca-data-analytics-online";
			if(driver.getCurrentUrl().equals(ExpBCAdataAnalytics)) {
				test.log(Status.PASS, "BCAwithspecializationinDataAnalytics_Program url is verified");
				System.out.println("BCAwithspecializationinDataAnalytics_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BCAwithspecializationinDataAnalytics_Program url is not verified");
				System.out.println("BCAwithspecializationinDataAnalytics_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BCAwithspecializationinDataAnalytics_Program url is not verified: " + e.getMessage());
			System.out.println("BCAwithspecializationinDataAnalytics_Program url is not verified");
			Assert.fail("BCAwithspecializationinDataAnalytics_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 34)
	//Bachelor of Business Administration
	public void BachelorofBusinessAdministration() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofBusinessAdministration_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BBA);
			Thread.sleep(3000);
			String ExpBBA = "https://amityonline.com/bachelor-of-business-administration-online";
			if(driver.getCurrentUrl().equals(ExpBBA)) {

				test.log(Status.PASS, "BachelorofBusinessAdministration_Program url is verified");
				System.out.println("BachelorofBusinessAdministration_Program url is verified");

				Assert.assertTrue(true);
			}else {

				test.log(Status.FAIL, "BachelorofBusinessAdministration_Program url is not verified");
				System.out.println("BachelorofBusinessAdministration_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofBusinessAdministration_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofBusinessAdministration_Program url is not verified");
			Assert.fail("BachelorofBusinessAdministration_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 35)
	//Bachelor of Arts (Journalism and Mass communication)
	public void BachelorofArtsJournalismandMasscommunication() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtsJournalismandMasscommunication_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BAJandM);
			Thread.sleep(3000);
			String ExpBAJandM = "https://amityonline.com/bachelor-of-arts-journalism-and-mass-communication-online";
			if(driver.getCurrentUrl().equals(ExpBAJandM)) {
				test.log(Status.PASS, "BachelorofArtsJournalismandMasscommunication_Program url is verified");
				System.out.println("BachelorofArtsJournalismandMasscommunication_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofArtsJournalismandMasscommunication_Program url is not verified");
				System.out.println("BachelorofArtsJournalismandMasscommunication_Program url is not verified");

				Assert.assertTrue(false);
			}

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtsJournalismandMasscommunication_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtsJournalismandMasscommunication_Program url is not verified");
			Assert.fail("BachelorofArtsJournalismandMasscommunication_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 36)
	//Bachelor of Commerce

	public void BachelorofCommerce() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofCommerce_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", Bcom);
			Thread.sleep(3000);
			String ExpBcom = "https://amityonline.com/bachelor-of-commerce-online";
			if(driver.getCurrentUrl().equals(ExpBcom)) {
				test.log(Status.PASS, "BachelorofCommerce_Program url is verified");
				System.out.println("BachelorofCommerce_Program url is verified");
				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofCommerce_Program url is not verified");
				System.out.println("BachelorofCommerce_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofCommerce_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofCommerce_Program url is not verified");
			Assert.fail("BachelorofCommerce_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 37)
	//Bachelor of Arts
	public void BachelorofArts() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArts_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BA);
			Thread.sleep(3000);
			String ExpBA = "https://amityonline.com/bachelor-of-arts-online";
			if(driver.getCurrentUrl().equals(ExpBA)) {
				test.log(Status.PASS, "BachelorofArts_Program url is verified");
				System.out.println("BachelorofArts_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofArts_Program url is not verified");
				System.out.println("BachelorofArts_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArts_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArts_Program url is not verified");
			Assert.fail("BachelorofArts_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 38)
	//Bachelor of Art (Kannada Medium)
	public void BachelorofArtKannadaMedium() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtKannadaMedium_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BAKannada);
			Thread.sleep(3000);
			String ExpBAKannada = "https://amityonline.com/bachelor-of-arts-kannada-online";
			if(driver.getCurrentUrl().equals(ExpBAKannada)) {
				test.log(Status.PASS, "BachelorofArtKannadaMedium_Program url is verified");

				System.out.println("BachelorofArtKannadaMedium_Program url is verified");
				Assert.assertTrue(true);

			}else {
				test.log(Status.FAIL, "BachelorofArtKannadaMedium_Program url is not verified");
				System.out.println("BachelorofArtKannadaMedium_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtKannadaMedium_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtKannadaMedium_Program url is not verified");
			Assert.fail("BachelorofArtKannadaMedium_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 39)
	//Bachelor of Arts (Malayalam Medium)
	public void BachelorofArtsMalayalamMedium() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtsMalayalamMedium_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BAMalayalam);
			Thread.sleep(3000);
			String ExpBAMalayalam = "https://amityonline.com/bachelor-of-arts-malayalam-online";
			if(driver.getCurrentUrl().equals(ExpBAMalayalam)) {
				test.log(Status.PASS, "BachelorofArtsMalayalamMedium_Program url is verified");

				System.out.println("BachelorofArtsMalayalamMedium_Program url is verified");
				Assert.assertTrue(true);

			}else {
				test.log(Status.FAIL, "BachelorofArtsMalayalamMedium_Program url is not verified");
				System.out.println("BachelorofArtsMalayalamMedium_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtsMalayalamMedium_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtsMalayalamMedium_Program url is not verified");
			Assert.fail("BachelorofArtsMalayalamMedium_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	*/

	@Test(priority = 40)
	//Bachelor of Arts (Tamil Medium)
	public void BachelorofArtsTamilMedium() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtsTamilMedium_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BATamil);
			Thread.sleep(3000);
			String ExpBATamil = "https://amityonline.com/bachelor-of-arts-tamil-online";
			if(driver.getCurrentUrl().equals(ExpBATamil)) {
				test.log(Status.PASS, "BachelorofArtsTamilMedium_Program url is verified");
				System.out.println("BachelorofArtsTamilMedium_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofArtsTamilMedium_Program url is not verified");
				System.out.println("BachelorofArtsTamilMedium_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtsTamilMedium_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtsTamilMedium_Program url is not verified");
			Assert.fail("BachelorofArtsTamilMedium_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 41)
	public void BachelorofArtsTeluguMedium() throws InterruptedException {
		//Bachelor of Arts (TAssert.assertTrue(false);elugu Medium)
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtsTeluguMedium_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BATelugu);
			Thread.sleep(3000);
			String ExpBATelugu = "https://amityonline.com/bachelor-of-arts-telugu-online";
			if(driver.getCurrentUrl().equals(ExpBATelugu)) {
				test.log(Status.PASS, "BachelorofArtsTeluguMedium_Program url is verified");
				System.out.println("BachelorofArtsTeluguMedium_Program url is verified");

				Assert.assertTrue(true);
			}else {

				test.log(Status.FAIL, "BachelorofArtsTeluguMedium_Program url is not verified");
				System.out.println("BachelorofArtsTeluguMedium_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtsTeluguMedium_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtsTeluguMedium_Program url is not verified");
			Assert.fail("BachelorofArtsTeluguMedium_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 42)
	//Bachelor of Arts (Hindi Medium)
	public void BachelorofArtsHindiMedium() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtsHindiMedium_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BAHindi);
			Thread.sleep(3000);
			String ExpBAHindi = "https://amityonline.com/bachelor-of-arts-hindi-medium-online";
			if(driver.getCurrentUrl().equals(ExpBAHindi)) {
				test.log(Status.PASS, "BachelorofArtsHindiMedium_Program url is verified");
				System.out.println("BachelorofArtsHindiMedium_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofArtsHindiMedium_Program url is not verified");
				System.out.println("BachelorofArtsHindiMedium_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtsHindiMedium_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtsHindiMedium_Program url is not verified");
			Assert.fail("BachelorofArtsHindiMedium_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 43)
	//B.Com with Specialization in International Finance & Accounting
	public void BComwithSpecializationinInternationalFinanceandAccounting() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BComwithSpecializationinInternationalFinanceandAccounting_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BcomFinance);
			Thread.sleep(3000);
			String ExpBcomFinance = "https://amityonline.com/bcom-internationalfinanc";
			if(driver.getCurrentUrl().equals(ExpBcomFinance)) {
				test.log(Status.PASS, "BComwithSpecializationinInternationalFinanceandAccounting_Program url is verified");
				System.out.println("BComwithSpecializationinInternationalFinanceandAccounting_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BComwithSpecializationinInternationalFinanceandAccounting_Program url is not verified");
				System.out.println("BComwithSpecializationinInternationalFinanceandAccounting_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BComwithSpecializationinInternationalFinanceandAccounting_Program url is not verified: " + e.getMessage());
			System.out.println("BComwithSpecializationinInternationalFinanceandAccounting_Program url is not verified");
			Assert.fail("BComwithSpecializationinInternationalFinanceandAccounting_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 44)
	//Bachelor Of Commerce (Honours)
	public void BachelorOfCommerceHonours() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorOfCommerceHonours_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BcomHonour);
			Thread.sleep(3000);
			String ExpBcomHonours = "https://amityonline.com/bachelor-of-commerce-honours";
			if(driver.getCurrentUrl().equals(ExpBcomHonours)) {
				test.log(Status.PASS, "BachelorOfCommerceHonours_Program url is verified");
				System.out.println("BachelorOfCommerceHonours_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorOfCommerceHonours_Program url is not verified");
				System.out.println("BachelorOfCommerceHonours_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorOfCommerceHonours_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorOfCommerceHonours_Program url is not verified");
			Assert.fail("BachelorOfCommerceHonours_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}



	@AfterMethod

	public void CloseBrowser(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			// Get the name of the failed test method
			String testName = result.getName();
			// Capture screenshot and store with a unique name
			String myscreenshot = CaptureScreenshot.Screenshot(driver, testName);
			test.log(Status.FAIL, result.getThrowable());
			test.addScreenCaptureFromPath(myscreenshot);
		}
		driver.quit();

	}
}
