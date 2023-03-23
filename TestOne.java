package com.selenium.test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestOne {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/");
		WebElement searchbar=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		searchbar.click();
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"search\"]/button/i"));
		btn.click();
		Thread.sleep(3000);
		driver.navigate().back();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1300)","");
		Thread.sleep(5000);
		WebElement returns=driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a"));
		returns.click();
		driver.navigate().back();
		WebElement gf=driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a"));
		gf.click();
		Thread.sleep(3000);
		driver.close();
		
		
		
        
	}

}