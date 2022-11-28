package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
  @Test
  public void google() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com"); 
	  System.out.println("Title is: "+driver.getTitle());
	  }
}
