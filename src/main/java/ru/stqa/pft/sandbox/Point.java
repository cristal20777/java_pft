package ru.stqa.pft.sandbox;

public class Point {
 public static void main(String[] args) {
  distance();
  double x1 = 15;
  double y1 = 14;
  double x2 = 3;
  double y2 = 2;
  System.out.println("Расстояние между точками = " + distance(double x1,double y1,double x2,double y2));
 }

 public static void distance(double x1,double y1,double x2,double y2) {

  double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));


 }
}
