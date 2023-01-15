package ru.stqa.pft.sandbox;

public class PointsClass {
  public static void main (String[] args) {

    Points P = new Points(0, 1, 2, -2);
    System.out.println("Расстояние между точками =" + distance (P));
  }
  public static double distance (Points P) {
    return Math.sqrt((P.p3-P.p1)*(P.p3-P.p1)+(P.p4-P.p2)*(P.p4-P.p2));
  }
}
