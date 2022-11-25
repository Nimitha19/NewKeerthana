package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Whishlist_DWS extends Base_test {
	@Test
	public void WishlistTest() throws InterruptedException {
		DWS_WhishList whish=new DWS_WhishList(driver);
		Thread.sleep(2000);
	whish.click_wishlist();
	}

}

