package Testng_basics;

import org.testng.annotations.Test;

public class Depends_onpriority {
@Test(priority=7)
	
	public void LoginDemowebshop() {
		System.out.println("logged in4");
	}
	@Test(priority=6)
	public void Register() {
		System.out.println("Registered4");
	}
	@Test(priority=8)
	public void Search() {
		System.out.println("nimmi4");
	}
	@Test(priority=9)
	public void Wishlist() {
		System.out.println("fvrt4");
	}
	@Test(priority=10)
	public void Logout() {
		System.out.println("logged out4");

}
}
