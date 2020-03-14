package OnlineShopping;

//import java.util.ArrayList;
//import java.util.List;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;



public class HomePage extends BasePage {
	
	
	@FindBy(id="search_query_top")
	private WebElement search_query;
		
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a")
	private WebElement dresses;
	
	@FindBy(xpath="//a[@title='T-shirts']")
	private WebElement t_shirt;
	
	
	@FindBy(xpath="//*[@id='block_top_menu']//a[@title='Casual Dresses']")
	private WebElement casu_Dresses;

	
	
	//dresses variable already declared
	//@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	//private WebElement tabDresses;
	
	
	
	//@FindBy(xpath="//li[@class='sfHoverForce']//a[@title='T-shirts']")
	
	//*[@id="block_top_menu"]//ul//li[1]//li[1]
	//*[@id="block_top_menu"]/ul/li[1]//a[@title="T-shirts"]
	
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement mtshirt;
	
	
	
	public WebElement get_searchquery()
	{
		//Assert.assertTrue(hp_obj.search_query.isDisplayed(),"Failed to login");
				//Assert.assertTrue(search_query.isDisplayed(),"Failed to find Search field");
				//System.out.println("SearchField found:"+search_query.isDisplayed());
				
		return search_query;
		
		
		
	}
	
	public WebElement get_women()
	{
		//System.out.println("Testing Started");
		//Assert.assertTrue(women.isDisplayed(),"Failed to find women tab");
		//System.out.println("Women Tab:"+women.isDisplayed());
		return women;
	}
	
	public WebElement get_Dresses()
	
	{
		//Assert.assertTrue(dresses.isDisplayed(),"Failed to find Dresses tab");
	    //System.out.println("Dresses Tab:"+dresses.isDisplayed());
		
		return dresses;
	}
public WebElement get_casu_Dresses()
	
	{
		
		return casu_Dresses;
	}
	public WebElement get_Tshirt()
	{
		//Assert.assertTrue(t_shirt.isDisplayed(),"Failed to find Tshirt tab");
		//System.out.println("T-shirt Tab:"+t_shirt.isDisplayed());
		return t_shirt;
	}
	
	public WebElement get_mtshirt()
	{
		return mtshirt;
	}
	
	public void clickDresses()
	{
		dresses.click();
	}
	public void clickcasu_Dresses()
	{
		casu_Dresses.click();
	}
	
	/*
	
	public void get_women_Action()
	{
		
        Actions ac=new Actions(driver);
		ac.moveToElement(women).build().perform();
				
		Boolean Ts_bool=mtshirt.isDisplayed();
		
		System.out.println("Menu T-shirt displayed:"+Ts_bool);
		
		ac.doubleClick().build().perform();
		ac.contextClick().build().perform();
		
		
	}
	*/
	
	/*
	@FindBy(xpath = "//h3[text()='Registration']")
	private WebElement registration;

	
	@FindBy(xpath = "//h3[text()='interaction']")
	private WebElement interaction;

	@FindBy(xpath = "//h3[text()='Widget']")
	private WebElement widget;

	@FindBy(xpath = "//h3[text()='Frames and Windows']")
	private WebElement framesAndWindows;

	@FindBys(@FindBy(xpath = "//div/aside[contains(@class,'widget_nav_menu')]//h3"))
	private List<WebElement> navPanelHeading;

	@FindBy(xpath = "//div[./h5[text()='Customer Support']]//img")
	private WebElement imgCustomerSupport;

	@FindBy(className = "entry-titl")
	private WebElement titleHome;

	@FindBy(xpath = ".//a[text()='About us']")
	private WebElement lnkAbousUs;

	@FindBy(xpath = ".//a[text()='Services']")
	private WebElement lnkServices;

	@FindBy(xpath = ".//a[text()='Blog']")
	private WebElement lnkBlog;

	@FindBy(xpath = ".//a[text()='Contact']")
	private WebElement lnkContact;
	
	*/

	public HomePage() {
		PageFactory.initElements(driver, this);     //Page Factory created here
	}

	/*
	public WebElement getRegistrationFromPanel() {
		return registration;
	}
	
	public List<String> getnavPanelHeading() {
		ArrayList<String> list = new ArrayList<String>();
		for (WebElement element : navPanelHeading) {
			list.add(element.getText());
		}
		return list;
	}

	public WebElement getImgCustomerSupport() {
		return imgCustomerSupport;
	}

	public WebElement getTitleHome() {
		return titleHome;
	}
	
	public WebElement getlnkAboutUs() {
		return lnkAbousUs;
	}
	
	public WebElement getlnkServices() {
		return lnkServices;
	}
	
	public WebElement getlnkBlog() {
		return lnkBlog;
	}
	
	public WebElement getlnkContact() {
		return lnkContact;
	}	
   */

}
