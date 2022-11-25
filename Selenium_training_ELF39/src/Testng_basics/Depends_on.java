package Testng_basics;

import org.testng.annotations.Test;

public class Depends_on {
	
	@Test(dependsOnMethods="Register")
	
	public void LoginDemowebshop() {
		System.out.println("logged in");
	}
	@Test
	public void Register() {
		System.out.println("Registered");
	}
	@Test(dependsOnMethods="LoginDemowebshop")
	public void Search() {
		System.out.println("nimmi");
	}
	@Test(dependsOnMethods="LoginDemowebshop")
	public void Wishlist() {
		System.out.println("fvrt");
	}
	@Test(dependsOnMethods="Wishlist")
	public void Logout() {
		System.out.println("logged out");
	}
}
