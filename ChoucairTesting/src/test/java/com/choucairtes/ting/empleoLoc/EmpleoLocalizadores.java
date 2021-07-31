package com.choucairtes.ting.empleoLoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.choucairtes.ting.base.Base;

public class EmpleoLocalizadores extends Base {

	// COnstructor por defecto
	public EmpleoLocalizadores(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Localizadores a utilizar
	// Localizador pantalla Empleo
	By empleoLinkLocation = By.linkText("Empleos");
	// Localizador ¿Qué es ser Choucair?
	By ChoucairLinkLocation = By.linkText("¿Qué es ser Choucair?");
	// Localizador Prepararse para aplicar
	By prepararseLinkLocation = By.linkText("Prepararse para aplicar");
	// Links que se muestran al ingresar a "Prepararse para aplicar"
	By generalidadesLink1Location = By.linkText("Modelo de calidad de software");
	By generalidadesLink2Location = By.linkText("Diferencia entre calidad de software y pruebas");
	By generalidadesLink3Location = By.linkText("Papel de los ingenieros");
	By generalidadesLink4Location = By.linkText("El software en la economía actual");
	By generalidadesLink5Location = By.linkText("Los errores del software");
	By generalidadesLink6Location = By.linkText("Calidad de software");
	// Links Sobre las pruebas de software en el contexto del desarrollo de software
	By generalidadesLink7Location = By.linkText("Marcos de trabajo de pruebas");
	By generalidadesLink8Location = By.linkText("¿Qué son los riesgos del proyecto y de producto?");
	By generalidadesLink9Location = By.linkText("Técnicas de caja negra");
	By generalidadesLink10Location = By.linkText("Foundation Level – Técnicas");
	//Links sobre la Ingeniería de Software
	By generalidadesLink11Location = By.linkText("Fundamentos ingeniería de software");
	By generalidadesLink12Location = By.linkText("Marcos de trabajo de software: ágiles/tradicionales");
	By generalidadesLink13Location = By.linkText("Principios de programación");
	By generalidadesLink14Location = By.linkText("Algoritmos de software");
	By generalidadesLink15Location = By.linkText("¿Qué es programación por Ncapas?");
	By generalidadesLink16Location = By.linkText("Manual práctico de SQL");
	//Links Sobre la Gerencia de Proyectos
	By generalidadesLink18Location = By.linkText("Fundamentos de la gerencia de proyectos en desarrollo de software");
	By generalidadesLink19Location = By.linkText("¿Cuáles son las actividades de la Gestión de Proyectos?");
	//clisk logo choucair
	By logoxpathLocation = By.xpath("//*[@id=\"masthead\"]/div/div/div/div[1]/a/img"); 

	public void ingresoEmpleos() throws InterruptedException {
		click(empleoLinkLocation);
		Thread.sleep(10000);

	}

	public void ingresarLinkChoucair() throws InterruptedException {
		click(ChoucairLinkLocation);
		Thread.sleep(10000);
	}

	public void ingresoLinkEmpleosPrepararse() throws InterruptedException {
		click(prepararseLinkLocation);
		Thread.sleep(10000);
	}

	public void validarLinks() throws InterruptedException {
		// Se validan que los link se encuentren habilitados de Generalidades de la
		// Calidad del Software
		if (isDisplayed(generalidadesLink1Location) && (isDisplayed(generalidadesLink2Location)
				&& isDisplayed(generalidadesLink3Location) && isDisplayed(generalidadesLink4Location)
				&& isDisplayed(generalidadesLink5Location) && isDisplayed(generalidadesLink6Location))) {
			System.out.println(
					"Todos los link sobre Generalidades de la Calidad del Software se encuentran habilitados de forma correcta");
		} else {
			System.out.println(
					"No todos los link sobre Generalidades de la Calidad del Software se encuentran habilitados de forma correcta ");

		}
		// Se validan que los link se encuentren habilitados de
		if (isDisplayed(generalidadesLink7Location) && (isDisplayed(generalidadesLink8Location))
				&& (isDisplayed(generalidadesLink9Location)) && (isDisplayed(generalidadesLink10Location))) {
			System.out.println(
					"Todos los link sobre Sobre las pruebas de software en el contexto del desarrollo de software se encuentran habilitados de forma correcta ");
		} else {
			System.out.println(
					"No todos los link sobre Sobre las pruebas de software en el contexto del desarrollo de software se encuentran habilitados de forma correcta ");
		}
		//Se validan los likns Sobre la Ingeniería de Software
		if (isDisplayed(generalidadesLink11Location) && (isDisplayed(generalidadesLink12Location)
				&& isDisplayed(generalidadesLink13Location) && isDisplayed(generalidadesLink14Location)
				&& isDisplayed(generalidadesLink15Location) && isDisplayed(generalidadesLink16Location))) {
			System.out.println(
					"Todos los link Sobre la Ingeniería de Software");
		} else {
			System.out.println(
					"No todos los link sobre la Ingeniería de Software");

		}
		
	}
	public void retornoImgChoycair() throws InterruptedException{
		click(logoxpathLocation);
		Thread.sleep(10000);
	}

}
