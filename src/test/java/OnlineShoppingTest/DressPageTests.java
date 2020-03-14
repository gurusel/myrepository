package OnlineShoppingTest;

//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import org.testng.annotations.Test;

//import OnlineShopping.BasePage;
import OnlineShopping.DressesPageObject;
//import OnlineShopping.HomePage;

public class DressPageTests{
	
	
	//HomePage hp_obj;
	//BasePage bp_obj;
	
	DressesPageObject dp_obj;
	
	public DressPageTests()
	{
		
		//hp_obj=new HomePage();
		//bp_obj=new BasePage();
		
		dp_obj=new DressesPageObject();
		
		
		
	}
	
	
	
	@Test
	public void verify_count()
	{
		
		
		System.out.println("Dresspage Started");
		
		System.out.println(dp_obj.get_Dresses().getText());
		
		
		//HomePage.dresses.click();
		dp_obj.clickDresses();
		
		
		System.out.println("Dresses Page Clicked");
		
		//Printing the count details
		System.out.println(dp_obj.getProductCountFromHeader());
		System.out.println(dp_obj.getProductsCount().size());
		
		//using if statement
		if(dp_obj.getProductCountFromHeader()==dp_obj.getProductsCount().size())
		{
			System.out.println("The count is equal");
		}
		
		//using assert method
		System.out.println(dp_obj.getCount());
		
		
		//System.out.println(dp_obj.get_checkbox_s());
		
		dp_obj.clickDresses();
		dp_obj.clickcasu_Dresses();
		//System.out.println(dp_obj.getProductCountFromHeader());
		//System.out.println(dp_obj.getProductsCount().size());
		
		//System.out.println(dp_obj.getCount());
		
		//System.out.println(dp_obj.get_list().size());
	}

}
