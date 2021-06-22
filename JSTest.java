package com.sel.JavaScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSTest {

	public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.twoplugs.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement joinButton=driver.findElement(By.xpath("(//a[@class='btn green' and @href='/signup'])[1]"));
//			JSUtility.flash(joinButton, driver);
//			
//			JSUtility.drawBorder(driver, joinButton);
//			
//			JSUtility.scrnsht(driver);
//			
//			String title=JSUtility.getTitleOfPageUsingJS(driver);
//			System.out.println(title);
//			
//			JSUtility.clickOnWebElementUsingJS(driver,joinButton);
			
//			JSUtility.clickOnWebElementUsingJS(driver,joinButton);
//			JSUtility.generateAlert(driver, "You have clicked on Join Button");
//			Thread.sleep(2000);
//			driver.switchTo().alert().accept();
			
//			JSUtility.refreshThePage(driver);
//			Thread.sleep(2000);
			
//			WebElement elementToBeBroughtIntoView=driver.findElement(By.xpath("//span[@class='w-icons-slide5']"));
//			JSUtility.scrollIntoView(driver, elementToBeBroughtIntoView);
//			Thread.sleep(3000);
			
			JSUtility.scrollDown(driver);
				
			driver.close();
			
		}
}
