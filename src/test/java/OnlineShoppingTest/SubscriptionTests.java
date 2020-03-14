package OnlineShoppingTest;

import org.testng.annotations.Test;

//import OnlineShopping.BasePage;
//import OnlineShopping.HomePage;
import OnlineShopping.SubscriptionObject;

public class SubscriptionTests  {
	
	//HomePage hp_obj;
	//BasePage bp_obj;

	SubscriptionObject sb_obj;
	
	public SubscriptionTests()
	{
		//hp_obj=new HomePage();
		//bp_obj=new BasePage();
		
		sb_obj=new SubscriptionObject();
	
	}

	@Test
	public void Enter_emailid()
	{
		System.out.println("Testing Started.....");
		
				
		System.out.println(sb_obj.get_searchquery().getAttribute("id"));
		
		sb_obj.setText(sb_obj.get_emailid(), "gurushiv1@gmail.com");
		
		
		sb_obj.click_submitNewsletter();
		
		System.out.println(sb_obj.get_newsalert().getText());
		
	}

}
