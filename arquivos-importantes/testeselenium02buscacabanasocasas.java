package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class testeselenium02buscacabanasocasas {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8080/UAN_-_Calidad_de_Software_-_Proyecto_Final/index.jsp";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testTesteselenium02buscacabanasocasas() throws Exception {
		selenium.open("/UAN_-_Calidad_de_Software_-_Proyecto_Final/index.jsp");
		selenium.click("link=Control Arrendatario");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Listar todas las Casas y/o Cabanas");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Más");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Realizar alquiler");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Cancelar");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Control Usuario");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Listar todas las Casas y/o Cabanas");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
