package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class SampleFrameWorkPage extends BasePage implements AutoConstant 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement fastnametextfaild;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastnametextfaild;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement usernametextfaild;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordtextfaild;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement emailidtextfaild;
	
	@FindBy(xpath="(//input[@name='gender'])[1]")
	private WebElement maleradiobutton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement keepmeloginbutton;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement contrycodedroupdownlist;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobilenumbertextfaild;
	
	public SampleFrameWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void submitDetaild() throws IOException
	{
		fastnametextfaild.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
		lastnametextfaild.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		usernametextfaild.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 2));
		passwordtextfaild.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 3));
		emailidtextfaild.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 4));
		maleradiobutton.click();
		keepmeloginbutton.click();
		/*Select sel=new Select(contrycodedroupdownlist);
		sel.selectByVisibleText("+33");*/
		selectbyvisivaltext(contrycodedroupdownlist, "+33");
		mobilenumbertextfaild.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 5));
	}
}
