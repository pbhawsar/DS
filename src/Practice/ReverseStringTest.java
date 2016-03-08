package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringTest {

  @Test
  public void revStr() {
    String str = "pranay";
    Assert.assertEquals(ReverseString.recRevStr(str), "yanasrp");
  }
}
