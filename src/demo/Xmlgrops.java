package demo;

import org.testng.annotations.Test;

public class Xmlgrops {

	 @Test(groups = { "@smoke , @sanity" })
	public void m1() {
		System.out.println("mahesh");
	}
	
	@Test(groups = "sanity")
	public void m2() {
		System.out.println("mahesh1");
	}
	@Test(groups = "smoke")
	public void m3() {
		System.out.println("mahesh2");
	}
	@Test(groups = "sanity")
	public void m4() {
		System.out.println("mahesh3");
	}
	@Test(groups = "smoke")
	public void m5() {
		System.out.println("mahesh4");
	}
}
