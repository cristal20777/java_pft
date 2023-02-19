package ru.stqa.pft.sandbox;

public class Point {
 public static void main(String[] args) {
  double x1 = 9;
  double y1 = 6;
  double x2 = 6;
  double y2 = 1;
  double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

  System.out.println("Расстояние между точками = " + distance);
 }
}
