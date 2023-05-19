package testPract;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionPrac {
String name="Ducky";
Boolean value=true;
Boolean value1=false;
@Test
public void checkEqual()
{
//Assert.assertEquals(name,"Duck");
Assert.assertNotEquals(name,"Duck");
Assert.assertTrue(value,"display nothing when value both same");
Assert.assertFalse(value1,"display this when value not equal");

}
}