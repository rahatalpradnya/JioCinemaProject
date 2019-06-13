package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//span[@class='icon-Menu']")
	public WebElement Hamburger;
	
	@FindBy(xpath="//a/h1[text()='JioCinema']")
	public WebElement JioCinemaHeader;
	
	@FindBy(xpath="//a/h2[text()='Movies']")
	public WebElement MoviesHeader;
	
	@FindBy(xpath="//a/h2[text()='TV']")
	public WebElement TVHeader;
	
	@FindBy(xpath="//a/h2[text()='Music']")
	public WebElement MusicHeader;
	
	@FindBy(xpath="//a/h2[text()='Clips']")
	public WebElement ClipsHeader;
	
	@FindBy(xpath="//a/i[@class='icon-Search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath="//a[@class='icon-login-user_liner user-icon']")
	public WebElement AccountIcon;
	
	@FindBy(xpath="//a/span[text()='Home']")
	public WebElement HamburgerHome;
	
	@FindBy(xpath="//a/span[text()='Movies']")
	public WebElement HamburgerMovies;
	
	@FindBy(xpath="//a/span[text()='TV']")
	public WebElement HamburgerTv;
	
	@FindBy(xpath="//a/span[text()='Music']")
	public WebElement HamburgerMusic;
	
	@FindBy(xpath="//a/span[text()='Clips']")
	public WebElement HamburgerClips;
	
	@FindBy(xpath="//a/span[text()='previous']")
	public WebElement CarousalPrevious;
	
	@FindBy(xpath="//a/span[text()='next']")
	public WebElement CarousalNext;
	
	@FindBy(xpath="(//div/div/span[@class='see-all pull-right see-all'])[1]")
	public WebElement SeeAllFirstcategory;
	
	@FindBy(xpath="(//div/div[@class='owl-prev'])[1]")
	public WebElement FirstCategoryScrollPrevious;
	
	@FindBy(xpath="(//div/div[@class='owl-next'])[1]")
	public WebElement FirstCategoryScrollNext;
	
	@FindBy(xpath="((//h1[@class='see-all-title see-all-title-home']/..//following-sibling::data-owl-carousel/div[@class='owl-wrapper-outer']/div[@class='owl-wrapper']/div[@class='owl-item'])[1]")
	public WebElement CategoryFirstContent;
	
	@FindBy(xpath="(//div/div/div/div/div/div[@class='carousel-image item'])[1]")
	public WebElement CarousalFirstElement;
	
	@FindBy(xpath="//div/div/h1[text()='Languages']")
	public WebElement LanguageCategory;
	
	@FindBy(xpath="//div/div/div/div/a/div/img[@itemname='Hindi']")
	public WebElement LanguageHindi;
	
	@FindBy(xpath="//div/div/h1[text()='Genres']")
	public WebElement GenreCategory;
	
	@FindBy(xpath="//div/div/div/div/a/div/img[@itemname='Action']")
	public WebElement GenreAction;
	
	@FindBy(xpath="(//footer//a[@class='facebook'])[1]")
	public WebElement FacebookFooter;
	
	@FindBy(xpath="(//footer//a[@class='twitter'])[1]")
	public WebElement TwitterFooter;
	
	@FindBy(xpath="(//div/a/img[@alt='playstore'])[1]")
	public WebElement googlePlayFooter;
	
	@FindBy(xpath="(//div/a/img[@alt='appstore'])[1]")
	public WebElement AppstoreFooter;
	
	@FindBy(xpath="(//div/div/a[text()='About JioCinema '])[1]")
	public WebElement AboutJioCinemaFooter;
	
	@FindBy(xpath="(//div/div/a[text()=' Terms of Use '])[1]")
	public WebElement TermsOfUseFooter;
	
	@FindBy(xpath="(//div/div/a[text()=' Privacy Policy '])[1]")
	public WebElement PrivacyPolicyFooter;
	
	@FindBy(xpath="(//div/div/a[text()=' FAQ '])[1]")
	public WebElement FAQFooter;
	
	@FindBy(xpath="(//div/div/a[text()=' Feedback'])[1]")
	public WebElement FeedbackFooter;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	
	}


	
}
