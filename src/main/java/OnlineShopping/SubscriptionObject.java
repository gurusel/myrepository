package OnlineShopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionObject extends HomePage{
	
	HomePage hp_obj;
	BasePage bp_obj;
	
	public SubscriptionObject()
	{
		hp_obj=new HomePage();
		bp_obj=new BasePage();
		
		
		PageFactory.initElements(driver, this);
	}
	
	//*[@id="newsletter-input"]
	
	
	
	@FindBy(xpath="//body//footer//form//input[@id='newsletter-input']")
	private WebElement emailid;
	
	@FindBy(xpath="//body//footer//form//button[@name='submitNewsletter']")
	private WebElement submitNewsletter;
	
	
	@FindBy(xpath="//*[@id=\"columns\"]/p")
	private WebElement newsalert;
	
	
	
	//*[@id="columns"]/p
	
	
	public WebElement get_emailid()
	{
		return emailid;
		
	}
	public void click_submitNewsletter()
	{
		submitNewsletter.click();
	}
	public WebElement get_newsalert()
	{
		return newsalert;
		
	}
	

}
