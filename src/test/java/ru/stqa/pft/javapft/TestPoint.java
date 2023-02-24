package ru.stqa.pft.javapft;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class TestPoint {
  @Test
  public void DistanceTest() {
    Point p1 = new Point(16, 6);
    Point p2 = new Point(12, 3);
    Assert.assertEquals(p1.distance(p2),5.0);
  }
  @Test
  public void DistanceTest2() {
    Point p1 = new Point(10, 6);
    Point p2 = new Point(2, 2);
    Assert.assertEquals(p1.distance(p2),8.94427190999916);
    Assert.assertFalse(p1.distance(p2) < 1);
  }

}
