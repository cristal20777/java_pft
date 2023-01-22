package ru.stqa.pft.sandbox;

public class PointsClass {
  public static void main(String[] args) {
    Points p1 = new Points().p1(10, 11);
    Points p2 = new Points().p2(19, 15);

    System.out.println("Рассточние между точками = " + distance(Points p1, Points p2));
  }

  public static double distance(Points p1, Points p2) {
    return Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1) * (p2.y2 - p1.y1));
  }
}
