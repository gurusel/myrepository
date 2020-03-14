package OnlineShoppingTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.testng.TestNGException;
//import org.xml.sax.SAXParseException;

import OnlineShopping.BasePage;
import OnlineShopping.HomePage;



public class HomePageTest {
	
	HomePage hp_obj;
	BasePage bp_obj;
	
	
	public HomePageTest()
	{
		
		hp_obj=new HomePage();
		bp_obj=new BasePage();
		
		 
		
	}
	
	@Test 
	public void verify_Fields()
	{
		
		//hp_obj.get_searchquery();
		//hp_obj.get_women();
		//hp_obj.get_Dresses();
		//hp_obj.get_Tshirt();
		//hp_obj.get_mtshirt();
		//hp_obj.get_women_Action();
		getTitle();
		
		
		
		bp_obj.elementFound(hp_obj.get_searchquery());
		
		
		
		bp_obj.elementFound(hp_obj.get_women());
		bp_obj.elementFound(hp_obj.get_Dresses());
		bp_obj.elementFound(hp_obj.get_Tshirt());
		//bp_obj.elementFound(hp_obj.get_mtshirt());
		

	}
	
	
	
	@Test 
	public void getTitle()
	{
		String str=bp_obj.getTitle();
			
		System.out.println("The string is "+str);
		
	}
	


}
