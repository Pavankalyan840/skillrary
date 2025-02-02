package testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genaric.Baseclass;


public class AddtoCarteTest extends Baseclass{
	
@Test

public void AddtoCartTest() {
	SoftAssert soft =new SoftAssert();
	
	home.clickGearsTab();
	home.clickSkillraryDemoAppLink();
	web.switchtochildbrowser();
	
	soft.assertTrue(demoApp.getPageHeader().contains("Ecommerce"));
	
	demoApp.mouseHoverToCourse(web);
	demoApp.clickSeleniumTraining();
	soft.assertEquals(demoApp.getPageHeader(), "Selenium Training");
	int initialQuantity= Integer.parseInt(selenium.getQuantity());
	selenium.doubleClickPlusButton(web);
	int finalQuantity=Integer.parseInt(selenium.getQuantity());
	soft.assertEquals(finalQuantity, initialQuantity);
	
	selenium.clickAddToCart();
	web.handlealert("ok");
	soft.assertEquals(selenium.getItemAddedMessage(), "Item add to cart");
	
	soft.assertAll();
	
}
}
