package org.simple.form;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Simple_Form {
	static WebDriver driver;

	@Given("The user is in seleniumeasy.com page")
	public void the_user_is_in_seleniumeasy_com_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Customer_Practise\\Form_Practise\\src\\main\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.seleniumeasy.com/test/");
	    driver.manage().window().maximize();
	}
	
	@Given("User navigates selects Simple Form Demo")
	public void user_navigates_selects_Simple_Form_Demo() throws Throwable{
		WebElement InputForms=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		InputForms.click();
		Thread.sleep(2000);
		WebElement SimpleFormDemo=driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[1]"));
		SimpleFormDemo.click();
		Thread.sleep(3000);
		
	   
	}
	@When("User enters details in Single Input Field")
	public void user_enters_details_in_Single_Input_Field(DataTable Datatable) throws Throwable {
		List <String> Msg= Datatable.asList();
		WebElement UserMsg=driver.findElement(By.xpath("//input[@id='user-message']"));
		UserMsg.sendKeys(Msg.get(0));
		Thread.sleep(2000);
		WebElement ShowMsg=driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]"));
		ShowMsg.click();
		
		
	}
	
	@When("User eenters details in Two Input Fields")
	public void user_eenters_details_in_Two_Input_Fields(DataTable Datatable) throws Throwable {
		Map <String,String> InputValue=Datatable.asMap(String.class,String.class);
		WebElement Value1=driver.findElement(By.xpath("//input[@id='sum1']"));
		Value1.sendKeys(InputValue.get("a"));
		Thread.sleep(2000);
		WebElement Value2=driver.findElement(By.xpath("//input[@id='sum2']"));
		Value2.sendKeys(InputValue.get("b"));
		Thread.sleep(2000);
		WebElement GetTotal=driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]"));
		GetTotal.click();
		
	}
	
	
	@Then("The user entered message should be displayed")
	public void the_user_entered_message_should_be_displayed() {
		String Text1=driver.findElement(By.xpath("//span[@id='display']")).getText();
		System.out.println("Text Entered is " + Text1);
		String Text2=driver.findElement(By.xpath("//span[@id='//span[@id='displayvalue']']")).getText();
		System.out.println("Total is " + Text2);
		
	}
	@Given("User navigates to CheckBox Demo")
	public void user_navigates_to_CheckBox_Demo() throws Throwable {
		WebElement InputForms=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		InputForms.click();
		Thread.sleep(2000);
		WebElement CheckBoxDemo=driver.findElement(By.xpath("(//a[text()='Checkbox Demo'])[1]"));
		CheckBoxDemo.click();
		Thread.sleep(3000);
	}
	
	@When("User enters Seingle Check Box Demo")
	public void user_enters_Seingle_Check_Box_Demo() throws Throwable{
		WebElement SingleChkBox=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		SingleChkBox.click();
		
		
	}
	
	@When("User enters Multiple check Box Demo")
	public void user_enters_Multiple_check_Box_Demo() {
		WebElement ChkBox1=driver.findElement(By.xpath("(//input[@class='cb1-element'])[1]"));
		ChkBox1.click();
		WebElement ChkBox2=driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
		ChkBox2.click();
		WebElement ChkBox3=driver.findElement(By.xpath("(//input[@class='cb1-element'])[3]"));
		ChkBox3.click();
		WebElement ChkBox4=driver.findElement(By.xpath("(//input[@class='cb1-element'])[4]"));
		ChkBox4.click();
		
		
	}
	
	@Then("User selects UncheckAll")
	public void user_selects_UncheckAll() throws Throwable {
		Thread.sleep(4000);
		//WebElement UncheckAll=driver.findElement(By.xpath("//input[@id='check1']"));
		WebElement UncheckAll=driver.findElement(By.xpath("//input[@value='Uncheck All']"));
		
		//input[@value='Uncheck All']
		UncheckAll.click();
		
		
	}
	
	@Given("User navigates to Select DropDown List")
	public void user_navigates_to_Select_DropDown_List() throws Throwable {
		WebElement InputForms=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		InputForms.click();
		Thread.sleep(2000);
		WebElement DropDown=driver.findElement(By.xpath("(//a[text()='Select Dropdown List'])[1]"));
		DropDown.click();
		Thread.sleep(2000);
		
	   
	}
	
	@When("User selects List demo")
	public void user_selects_List_demo() {
		WebElement InputForms=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s=new Select(InputForms);
		s.selectByValue("Sunday");
		

	}
	
	@When("User selects MultiList demo")
	public void user_selects_MultiList_demo() throws Throwable {
		
		WebElement InputForms=driver.findElement(By.xpath("//select[@name='States']"));
		Select s=new Select(InputForms);
		s.selectByIndex(1);
		
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		WebElement SelectAll=driver.findElement(By.xpath("//button[@id='printAll']"));
		SelectAll.click();
		
	}

}
