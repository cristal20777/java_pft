package ru.stqa.pft.javapft;

import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Square;
import org.testng.Assert;
public class SquareTests {
  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
