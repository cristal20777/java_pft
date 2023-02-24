package ru.stqa.pft.sandbox;

public class Point2 {
  public static void main(String[] args) {
    Point p1 = new Point(15, 5);
    Point p2 = new Point(11, 1);
    System.out.println("Расстояние между точками = " + p1.distance(p2));

    //Для функции:
    //System.out.println("Расстояние между точками = " + distance(p1,p2));
  }

  //Вызов Функции
  //public static  double distance(Point p1,Point p2){
    //return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));

  }

