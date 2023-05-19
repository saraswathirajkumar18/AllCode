package testPract;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterInput {
@Test
@Parameters({"FirstName","LastName"})
public void display(String fname,String lname)
{
	System.out.println("user full name:"+fname+""+lname);
	
}
}
