package com.choucairtes.ting.testCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.util.concurrent.TimeUnit;

import com.choucairtes.ting.empleoLoc.EmpleoLocalizadores;

public class EmpleadoTest {
	
	private WebDriver driver;
	EmpleoLocalizadores empleoLocal;
	private File scrFile;

	@Before
	public void setUp() throws Exception {	
		empleoLocal = new EmpleoLocalizadores(driver);
		driver = empleoLocal.chromeDriverConnection();
		driver.manage().window().maximize();
		empleoLocal.visit("https://www.choucairtesting.com/");
		scrFile = empleoLocal.capturaEvidencia();
	}

	@After
	public void tearDown() throws Exception {
		scrFile = empleoLocal.capturaEvidencia();
		driver.quit();
	}

	@Test
	public void empleado() throws Exception{
		empleoLocal.ingresoEmpleos();
		scrFile = empleoLocal.capturaEvidencia();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		empleoLocal.ingresarLinkChoucair();
		scrFile = empleoLocal.capturaEvidencia();
		empleoLocal.ingresoEmpleos();
		scrFile = empleoLocal.capturaEvidencia();
		empleoLocal.ingresoLinkEmpleosPrepararse();
		scrFile = empleoLocal.capturaEvidencia();
		empleoLocal.validarLinks();
		scrFile = empleoLocal.capturaEvidencia();
		empleoLocal.retornoImgChoycair();
	}
}
