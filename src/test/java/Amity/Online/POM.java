package Amity.Online;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class POM {
	
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

	@FindBy(xpath = "//button[@class='header_login__wzVUA']") //Student login
	WebElement StudentLoginElement;

	@FindBy(xpath = "//button[@class='button_root__RRK9v header_mr__77w6i button_y__dAepQ']//span[@class='uppercase font-raleway'][normalize-space()='Apply Now']")  //Apply Now
	WebElement applyNowButtonElementHeaderbutton;

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']//div[@class='HeroCarousel_HearoCarousel__gradient__oBG4Y']//div[@class='carousel-caption']//div[@class='banner-content']//div//span[contains(text(),'APPLY NOW')]")  //Apply Now
	WebElement applyNoWebElement;

	@FindBy(xpath = "//img[@id='call-icon']")  //Callicon
	WebElement CalliconElement;

	@FindBy(xpath = "//img[@alt='whatsapp-link']")  //Whatsapp
	WebElement whatsappIconElement;

	@FindBy(xpath = "//div[@class='styles_ctaBtn__BqEmG']//a[@class='button_root__RRK9v button_b__2Obj5 button_o__u2jyu']")  //ViewAll
	WebElement viewAllElement;

	@FindBy(xpath = "//body/main/section[8]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")  //Request a call
	WebElement requestaCallElementNowApplyNow;

	@FindBy(xpath = "//a[@href='/news']//span[@class='uppercase font-raleway'][normalize-space()='View all']")  //View all Stay
	WebElement viewallStayElement;

	@FindBy(xpath = "//a[@href='/blog']//span[@class='uppercase font-raleway'][normalize-space()='View all']")  //View all blog
	WebElement viewallBlogElement;

	@FindBy(xpath = "//span[normalize-space()='KNOW MORE']")  // Know more element
	WebElement knowMorElement;

	@FindBy(xpath = "//body/main/section[12]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")  // Apply Now CTA, Blue Banner
	WebElement apllyNowButtonBlueBanner;

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

	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")  // T&C 
	WebElement privacyElement;

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

}
