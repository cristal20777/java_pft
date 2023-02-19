package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("Kris");
    hello("red");

    Square s = new Square(5);
    double x1 = 9;
    double y1 = 6;
    double x2 = 6;
    double y2 = 1;
    double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));


    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
    Rectangle r = new Rectangle(4, 6);

    System.out.println("Площадь прямоугольника со сторонами  " + r.a + " и " + r.b + " = " + r.area());

    System.out.println("Расстояние между точками = " + distance);
  }


  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }



}