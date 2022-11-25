package Testng_basics;

import org.testng.annotations.Test;

public class Working_groups {
  @Test(groups ="Smoke Test",priority=21)
	
	public void LoginDemowebshop() {
		System.out.println("logged in");
	}
	@Test(groups ="Smoke Test",priority=1)
	public void Register() {
		System.out.println("Registered");
	}
	@Test(priority=3)
	public void Search() {
		System.out.println("nimmi");
	}
	@Test(priority=4)
	public void Wishlist() {
		System.out.println("fvrt");
	}
	@Test(groups ="Smoke Test",priority=5)
	public void Logout() {
		System.out.println("logged out");

}
}
