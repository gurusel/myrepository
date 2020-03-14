package OnlineShopping;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DressesPageObject extends HomePage {
	
	HomePage hp_obj;
	BasePage bp_obj;
	
	public DressesPageObject(){
	
		hp_obj=new HomePage();
		bp_obj=new BasePage();
		
		PageFactory.initElements(driver, this); 
		
	}
	
	
	//To find dresses tab element if cant find by @title
	//body//div[@id="block_top_menu"]//ul//li//a[@title="Dresses"]
	
	//@FindBy(xpath="//body[@id=\"category\"]//div[@id=\"center_column\"]//span[2]")
	
	
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
	private WebElement txtHeader;
	
	
	//*[@id="center_column"]/ul
	//@FindBys(@FindBy(xpath="//h1[@class=\"page-heading product-listing\"]/span[2]"))
	
	
	
	//@FindBys(@FindBy(xpath="//*[@id='center_column']/ul"))
	
	//@FindBys(@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a/img"))
	
	
	@FindBys(@FindBy(xpath="//*[@id=\"center_column\"]/ul/li"))
	private List<WebElement> lstproducts;
	
	@FindBys(@FindBy(xpath="//li[@class=\'sfHoverForce\']"))
	private List<WebElement> caustproducts;
	
	
	
	@FindBy(xpath="//body//form//span/input[@id=\"layered_id_attribute_group_1\"]")
	private WebElement checkbox_S;
	
	//@FindBy(xpath="//submenu-container clearfix first-in-line-xs")
	
	//*[@id="ul_layered_id_attribute_group_1"]/li[1]/label/a
	
	
	
	
	public int getProductCountFromHeader()
	{
		//to split the string and take the count details. 
		return Integer.parseInt(txtHeader.getText().split(" ")[2]);
	}
	
	public List<WebElement> getProductsCount()
	{
		//to return the list of products
		return lstproducts;
	}
	
	public boolean getCount()
	{
		//To check the header count and the products count in Dresses page
		Assert.assertEquals(getProductCountFromHeader(), getProductsCount().size());
		return true;
		
	}
	
	public boolean get_checkbox_s()
	{
		checkbox_S.isSelected();
		Assert.assertTrue(checkbox_S.isEnabled());
		return true;
	}
	public void get_list()
	
	{
		
		Actions ac=new Actions(driver);
		ac.moveToElement(hp_obj.get_Dresses()).build().perform();
		ac.contextClick(get_casu_Dresses()).build().perform();
		
	
		
		
		
	}
	
	
}
