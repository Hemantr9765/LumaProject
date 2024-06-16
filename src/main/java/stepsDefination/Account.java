package stepsDefination;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import keywordDrivenFramework.Keywords;
import keywordDrivenFramework.LocatorsLuma;

public class Account {
Keywords key= new Keywords();
/**
 * Verify Error message when first name is blank.
 */




@Given ("Chrome Broser open")
public void BrowserOpen() {
	key.OpenBrowser("Chrome");
}
//@Before
@And  ("Browser should Maximize")
public void maximize() {
	key.Maximize();
}
//@Before
@And  ("Application url should enter and application should open")
public void LAunchURL() {
	key.UrlLaunch("https://magento.softwaretestingboard.com/");	
}
//@Before
@And ("User should click on Create a account button")
public void Click() {
	key.Click(LocatorsLuma.CREATACCOUNT);
}

@When ("User files the entire information in Account create page but blank the first name field")
public void EnterInfo() {
	key.SendKeys(LocatorsLuma.LASTNAME, "Mahajan");
	key.SendKeys(LocatorsLuma.EMAIL, "abcd@gmail.com");
	key.SendKeys(LocatorsLuma.PASSWORD, "Hemant@9765");
	key.SendKeys(LocatorsLuma.REPASSWORD, "Hemant@9765");
}
//@Before
@And  ("Click on Create a account button")
public void createButton() {
	key.Click(LocatorsLuma.CREATBUTTON);
}
@Then ("User should wait for getting Screen shot")
public void time() {
key.Wait();
}

@Then ("User should get error message for first name field")
public void getText() {
    String err=	key.GetText("//div[@id=\"firstname-error\"]");	
	Assert.assertEquals(err, "This is a required field.");
	System.out.println(err);
	System.out.println("Test Case is passed");
}


@Then ("User should get Screen shot")
public void Takescreen() throws IOException {

	key.Screenshot("LoginPage");
}
//@Before
@Then ("Broswser should closed")
public void TearDown() {
	key.TearDown();
}

///////Verify Error message when first name is blank.////////////////////

@When ("User files the entire information in Account create page but blank the last name field")
public void EnterInfoLastName() {
	key.SendKeys(LocatorsLuma.FIRSTNAME, "Hemant");
	key.SendKeys(LocatorsLuma.EMAIL, "abcd@gmail.com");
	key.SendKeys(LocatorsLuma.PASSWORD, "Hemant@9765");
	key.SendKeys(LocatorsLuma.REPASSWORD, "Hemant@9765");
}

@Then ("User should get error message for last name field")
public void getText1() {
    String err1=key.GetText("//div[@id=\"lastname-error\"]");	
	Assert.assertEquals(err1,"This is a required field.");
	System.out.println(err1);
	System.out.println("Test Case is passed");
}


/////////Verify Error message when Email field is blank.///////////////////

@When ("User files the entire information in Account create page but blank the Email field")
public void EnterInfoEmailField() {
	key.SendKeys(LocatorsLuma.FIRSTNAME, "Hemant");
	key.SendKeys(LocatorsLuma.LASTNAME, "Mahajan");
	key.SendKeys(LocatorsLuma.PASSWORD, "Hemant@9765");
	key.SendKeys(LocatorsLuma.REPASSWORD, "Hemant@9765");
}

@Then ("User should get error message for Email field")
public void getText2() {
    String err2=key.GetText("//div[@id='email_address-error']");	
	Assert.assertEquals(err2,"This is a required field.");
	System.out.println(err2);
	System.out.println("Test Case is passed");
}


////////Verify Error message when Password field is blank./////////////////

@When ("User files the entire information in Account create page but blank the Password field")
public void EnterInfoPassword() {
	key.SendKeys(LocatorsLuma.FIRSTNAME, "Hemant");
	key.SendKeys(LocatorsLuma.LASTNAME, "Mahajan");
	key.SendKeys(LocatorsLuma.EMAIL, "abcd@gmail.com");
	key.SendKeys(LocatorsLuma.REPASSWORD, "Hemant@9765");
}

@Then ("User should get error message for Password field")
public void getText3() {
    String err3=key.GetText("//div[@id='password-error']");	
	Assert.assertEquals(err3,"This is a required field.");
	System.out.println(err3);
	System.out.println("Test Case is passed");
}

/////////Verify Error message when Confirm Password field is blank.///////////
	
@When ("User files the entire information in Account create page but blank the Confirm Password field")
public void EnterInfoConfPassword() {
	key.SendKeys(LocatorsLuma.FIRSTNAME, "Hemant");
	key.SendKeys(LocatorsLuma.LASTNAME, "Mahajan");
	key.SendKeys(LocatorsLuma.EMAIL, "abcd@gmail.com");
	key.SendKeys(LocatorsLuma.PASSWORD, "Hemant@9765");
}

@Then ("User should get error message for Confirm Password field")
public void getText4() {
    String err4=key.GetText("//div[@id='password-confirmation-error']");	
	Assert.assertEquals(err4,"This is a required field.");
	System.out.println(err4);
	System.out.println("Test Case is passed");
}

//////////////Verify Error message if user enter password in password and confirm password is not same.///////////////

@When ("User files the entire information in Account create page but mismatch paswword in password and confirm password field")
public void EnterInfoConfPasswordErr() {
	key.SendKeys(LocatorsLuma.FIRSTNAME, "Hemant");
	key.SendKeys(LocatorsLuma.LASTNAME, "Mahajan");
	key.SendKeys(LocatorsLuma.EMAIL, "abcd@gmail.com");
	key.SendKeys(LocatorsLuma.PASSWORD, "Hemant@9765");
	key.SendKeys(LocatorsLuma.REPASSWORD, "Hemant@65");

}

@Then ("User should get error message for Confirm Password text field")
public void getText5() {
    String err5=key.GetText("//div[@id='password-confirmation-error']");	
	Assert.assertEquals(err5,"Please enter the same value again.");
	System.out.println(err5);
	System.out.println("Test Case is passed");
}

//////////Verify application behaviour when user enter all information in create account field.///////////////
	

@When ("User files the entire information in Account create page application navigate in my account page")
public void EnterallInfo() {
	key.SendKeys(LocatorsLuma.FIRSTNAME, "Hemant");
	key.SendKeys(LocatorsLuma.LASTNAME, "Mahajan");
	key.SendKeys(LocatorsLuma.EMAIL, "a273@gmail.com");
	key.SendKeys(LocatorsLuma.PASSWORD, "Hemant@9765");
	key.SendKeys(LocatorsLuma.REPASSWORD, "Hemant@9765");
	
	}
//@Then ("User should get Successfull message when all fields are enters in create account page")
//public void Successfullmsg() {
//    String Successmsg=key.GetText("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");	
//	Assert.assertEquals(Successmsg,"Thank you for registering with Main Website Store.");
//	System.out.println(Successmsg);
//	System.out.println("Test Case is passed");
//
//}
	/////////////////////////SignIn Module////////////////////////////////////////////
/////////Verify Error message when email field is blank.//////////////////////////


//@Given ("Chrome Broser open")
//public void BrowserOpenEmail() {
//	key.OpenBrowser("Chrome");
//}
//@Before
//@And  ("Browser should Maximize")
//public void maximizeEmail() {
//	key.Maximize();
//}
//@Before
//@And  ("Application url should enter and application should open")
//public void LAunchURLEmail() {
//	key.UrlLaunch("https://magento.softwaretestingboard.com/");	
//
//	
//}
@And  ("User should click on Create a sign in button")
public void ClickSign() {
	key.Click(LocatorsLuma.SIGNIN);

}
@When ("User files the entire information in Sign in page but blank the email field")
public void EnterSigninInfo() {
	key.SendKeys(LocatorsLuma.PASSWORDSIGN, "Hemant@9765");	
}
@And  ("Click on Sign in button")
public void Signin() {
	key.Click(LocatorsLuma.SIGNINBUTTON);
}
//@Then ("User should wait for getting Screen shot")
//public void timeSignin() {
//key.Wait();
//}

@Then ("User should get error message for email field")
public void getTextsign() {
    String errE=key.GetText("//div[@id=\"email-error\"]");	
	Assert.assertEquals(errE, "This is a required field.");
	System.out.println(errE);
	System.out.println("Test Case is passed");
}


//@Then ("User should get Screen shot")
//public void TakescreenSign() throws IOException {
//
//	key.Screenshot();
//}
//@Before
//@Then ("Broswser should closed")
//public void TearDownSign() {
//	key.TearDown();
//}
//}
///////////Verify Error message when password field is blank.////////////////////

@When ("User files the entire information in Sign in  page but blank the password field")
public void EnterSigninInfoPass() {
	key.SendKeys(LocatorsLuma.EMAILSIGN, "a273@gmail.com");	
}
@Then ("User should get error message for password field")
public void getTextsignpass() {
    String errp=key.GetText("//div[@id=\"pass-error\"]");	
	Assert.assertEquals(errp, "This is a required field.");
	System.out.println(errp);
	System.out.println("Test Case is passed");
}

///////////Verify Error message when email & password field is blank.///////////////

@When ("User files the entire information in Sign in page but blank the email & password field")
		
public void EnterSigninInfoPassEmail() {
	key.SendKeys(LocatorsLuma.EMAILSIGN, "");	
	key.SendKeys(LocatorsLuma.PASSWORDSIGN, "");	

}
@Then ("User should get error message for email & password field")
public void getTextsignpassEmail() {
	
	 String errEmail=key.GetText("//div[@id=\"email-error\"]");	
		Assert.assertEquals(errEmail, "This is a required field.");
		System.out.println(errEmail);
		System.out.println("Test Case is passed");
	
        String errPass=key.GetText("//div[@id=\"pass-error\"]");	
	    Assert.assertEquals(errPass, "This is a required field.");
	    System.out.println(errPass);
	    System.out.println("Test Case is passed");
}
////////////Verify application behaviour when user enter correct email and password////////////////////

@When ("User files the entire information in Sign in page")
public void EnterSignAAllinInfo() {
	key.SendKeys(LocatorsLuma.EMAILSIGN, "a273@gmail.com");	
	key.SendKeys(LocatorsLuma.PASSWORDSIGN, "Hemant@9765");	

}
@Then ("Application should navigate to home page")
public void getTextsignAll() {
    String errN=key.GetText("//p[contains(text(),'This is a demo store to test your test automaiton ')]");	
	Assert.assertEquals(errN, "This is a demo store to test your test automaiton scripts. No orders will be fulfilled. If you are facing any issue, email us at hello@softwaretestingboard.com.");
	System.out.println(errN);
	System.out.println("Test Case is passed");
}
//////////////Place order Module/////////////////////////////////////////////
/////////Verify that the cart icon updates when user click on add to cart button with the item count./////////////////

@And ("User should click on men category")
public void ClickCat() {
	key.Click(LocatorsLuma.MEN);
}
@And  ("User should click on Jacket category")
public void ClickJackets() {
key.Click(LocatorsLuma.JACKETS);
}

@And  ("User should click on product image")
public void ClickProduct() {
key.Click(LocatorsLuma.PRODUCT);
}
@And  ("User should select size,colur and quntity")
public void ClickSizeColourQty() {
	key.Click(LocatorsLuma.SIZE);
	key.Click(LocatorsLuma.COLOUR);
	key.SendKeys(LocatorsLuma.QTY, "005");
}
@And  ("Click on Add to cart button on product page")

public void ClickCart() {
	key.Click(LocatorsLuma.ADDCART);	
}
////Verify Error message when user not selected Size.///////////
//@And  ("User should click on hidden button")
//public void ClickHidden() {
//		key.Click(LocatorsLuma.HIDDEN);
//}

@And  ("User should select colur and quntity but not select size")
public void ClickColourQty() {
	key.Click(LocatorsLuma.COLOUR);
	key.SendKeys(LocatorsLuma.QTY, "05");
}
@Then ("User should get error message for size field")
public void errormsg() {
	 String errS=key.GetText("//div[@id=\"super_attribute[143]-error\"]");	
		Assert.assertEquals(errS, "This is a required field.");
		System.out.println(errS);
		System.out.println("Test Case is passed");
}
////////////Verify Error message when user not selected Colour.///////////
@And  ("User should select size and quntity but not select colour")
public void ClicksizeQty() {
	key.Click(LocatorsLuma.SIZE);
	key.SendKeys(LocatorsLuma.QTY, "05");
}
@Then ("User should get error message for colour field")
public void errorcolour() {
	 String errC=key.GetText("//div[contains(@id,'super_attribute')]");	
		Assert.assertEquals(errC, "This is a required field.");
		System.out.println(errC);
		System.out.println("Test Case is passed");
}

}


