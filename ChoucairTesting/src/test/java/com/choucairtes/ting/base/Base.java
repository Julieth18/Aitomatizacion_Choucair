package com.choucairtes.ting.base;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	private WebDriver driver;
	public File scrFile;
	

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver chromeDriverConnection() {
		// Permite crear una instancia del navegador chrome para trabajar
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public File capturaEvidencia() throws Exception{
		Path path = Paths.get("src/test/resources/Evidencias/");
		if (!Files.exists(path)) {
			Files.createDirectories(path);
		}
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,
				new File("src/test/resources/Evidencias/" + System.currentTimeMillis() + "evidencia.png"));
		return scrFile;
	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);

	}

	public List<WebElement> findElements(By locator) {

		return driver.findElements(locator);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return false;
		}
	}

	public void visit(String url) {
		driver.get(url);

	}

}