package Testcases_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configuration {
	@Test
	public void firt() {
		System.out.println("ghi");
	}
	@Test
	public void second() {
		System.out.println("mno");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("jkl");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("pqr");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("stuv");
	}
	@BeforeSuite

	public void beforeclass() {
		System.out.println("abc");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("def");
	}

}
