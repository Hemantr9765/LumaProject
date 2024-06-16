package keywordDrivenFramework;

public interface LocatorsLuma {
String MAINLINK="https://magento.softwaretestingboard.com/";
String CREATACCOUNT="//div[@class='panel header']//a[normalize-space()='Create an Account']";
String FIRSTNAME="//input[@id='firstname']";
String LASTNAME="//input[@id='lastname']";
String EMAIL="//input[@id='email_address']";
String PASSWORD="//input[@id='password']";
String REPASSWORD="//input[@id='password-confirmation']";
String CREATBUTTON="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]";
//////////////////SIGN IN///////////////////////////////////
String SIGNIN ="//div[@class='panel header']//a[contains(text(),'Sign In')]";
String PASSWORDSIGN="(//input[@type=\"password\"])[1]";
String EMAILSIGN="//input[@title=\"Email\"]";
String SIGNINBUTTON="(//button[@id=\"send2\"])[1]";
///////////Order Placed/////////////////////
String MEN="//span[normalize-space()='Men']";
String JACKETS="//a[contains(text(),'Jackets')]";
String PRODUCT="//img[@alt='Proteus Fitness Jackshirt']";
String SIZE= "//div[@aria-label=\"L\"]";
String COLOUR="//div[@id='option-label-color-93-item-49']";
String QTY="//input[@id='qty']";
String ADDCART="//button[@id='product-addtocart-button']";
String HIDDEN="//div[@class='ea-stickybox-hide']";
}
