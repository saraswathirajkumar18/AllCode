package testPract;

import org.testng.annotations.Test;

public class Groupttestcase {
	@Test(groups={"Apple"})	
	public void apple1()
	{
		System.out.println("Apple1");
	}
	@Test(groups={"Apple"})
	public void apple2()
	{
		System.out.println("Apple2");
	}
	@Test(groups={"Moto"})	
	public void moto1()
	{
		System.out.println("Moto1");
	}
	@Test(groups={"Moto"})	
	public void moto2()
	{
		System.out.println("Moto2");
	}
	@Test(groups={"Vivo"})
	public void vivo1()
	{
		System.out.println("Vivo1");
	}
	@Test(groups={"Vivo"})	
	public void vivo2()
	{

		System.out.println("Vivo2");
	}
	@Test(groups={"Lenovo"})	
	public void Lenovo1()
	{
		System.out.println("Lenovo1");
	}
	@Test(groups={"Lenovo"})
	public void Lenovo2()
	{

		System.out.println("Lenovo2");
	}

}
