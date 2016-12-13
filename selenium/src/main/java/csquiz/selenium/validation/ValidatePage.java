package csquiz.selenium.validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import csquiz.selenium.navigation.Common;

public class ValidatePage extends Common{
		
	public ValidatePage (WebDriver myDriver){
		super (myDriver);
	}
	
	
	// Validate Assignment2
	// html/body/h1
	public boolean validateAssignmentText (){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath("html/body/h1"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Assignment 2";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}
	
	// Validate register a new user
	// html/body/a	
	public boolean validateRegisterAnewUser (){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath("html/body/a"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Register a new user";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}
	
	// Validate Not logged in
	// html/body/h2
	public boolean validateNotLoggedIn (){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath("html/body/h2"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Not logged in";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}
	
	// Validate Logged in
	// html/body/h2
	public boolean validateLoggedIn (){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath("html/body/h2"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Logged in";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}	
	
	// Validate login request
	// html/body/div[1]/form/fieldset/legend
	public boolean validateLoginRequest (){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath("html/body/div[1]/form/fieldset/legend"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Login - enter Username and password";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}		
	
	// Validate username
	// html/body/div[1]/form/fieldset/label[1]
	public boolean validateLoginRequest (String username){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath("html/body/div[1]/form/fieldset/label[1]"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = username;
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}	
	
	// Validate Password
	// html/body/div[1]/form/fieldset/label[2]
	public boolean validatePassword (String password){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath("html/body/div[1]/form/fieldset/label[2]"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = password;
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}	
	
	// Validate Keep me logged in
	// html/body/div[1]/form/fieldset/label[3]
	
	// Validate date
	// html/body/div[1]/p
	public boolean validateDate (){
		
		// TODO add validation but need a clarification of time limits etc.
		
		// locate the object 
		/*
		WebElement currentElement = findElement(By.xpath("html/body/div[1]/form/fieldset/label[3]"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Login - enter Username and password";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}*/
		
		return true;
		
	}	
	
	// Validate error Username - Username is missing
	// .//*[@id='LoginView::Message']
	public boolean validateUsername (){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath(".//*[@id='LoginView::Message']"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Username is missing";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}	
	
	// Validate error - Password is missing
	// .//*[@id='LoginView::Message']
	public boolean validatePassword (){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath(".//*[@id='LoginView::Message']"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Password is missing";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}	
	
	// Validate error - Wrong name or password
	// .//*[@id='LoginView::Message']
	public boolean validateWrongNameOrPassword (){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath(".//*[@id='LoginView::Message']"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Wrong name or password";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}	


	// Validate - Welcome
	// .//*[@id='LoginView::Message']
	public boolean validateWelcome (){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath(".//*[@id='LoginView::Message']"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Welcome";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}	

	// Validate - Bye bye!
	// .//*[@id='LoginView::Message']
	public boolean validateByebye (){
		
		// locate the object 
		
		WebElement currentElement = findElement(By.xpath(".//*[@id='LoginView::Message']"));
				
		if (currentElement != null){
			
			String elementIs = currentElement.getText();
			String elementShouldBe = "Bye bye!";
			
			if (elementIs.compareTo(elementShouldBe) == 0) return true;
			
		}
		
		return false;
		
	}	
	
	
}
