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
}
