package com.sel.JavaScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtility {
	
	public static void flash(WebElement element, WebDriver driver) {
		String backgroundcolor=element.getCssValue("background-color");
		
		for(int i=0;i<20;i++) {
			changeColor("#000000", element, driver);
			changeColor(backgroundcolor, element, driver);
		}
		
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		
		try {
			Thread.sleep(20);			
		}catch(InterruptedException e) {
			
		}
	}
	
	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static void scrnsht(WebDriver driver) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Admin\\Desktop\\KRN\\Practice\\screenshotprac.png"));		
	}
	public static String getTitleOfPageUsingJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title;").toString();
		return title;
		//We can achieve the same using driver.getTitle(). 
		//Internally driver.getTitle() is implementing Javascript and returning the title.
		//Here, we wrote the JS code itself. No difference
	}
	public static void clickOnWebElementUsingJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
	}
	public static void refreshThePage(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	//Two kinds of page scrolls-1)Scrolling down until we reach certain element 2)Just scrolling based on pixels
	public static void scrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
	}

}
