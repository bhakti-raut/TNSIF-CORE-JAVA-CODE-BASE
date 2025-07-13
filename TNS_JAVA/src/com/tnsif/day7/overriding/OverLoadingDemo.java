package com.tnsif.day7.overriding;

public class OverLoadingDemo {
    public static void main(String[] args) {
        Point p = new Point();  // default
        System.out.println(p);

        Point p1 = new Point(20.0f, 23.4f);
        System.out.println(p1);

        System.out.println("--Method Overloading--");
        System.out.println(MethodOverLoading.addition(3.14f, 23.67f));
        System.out.println(MethodOverLoading.addition(3.24f, 45.1f));
        System.out.println(MethodOverLoading.addition(2, 5, 20));
        System.out.println(MethodOverLoading.addition(10, 20));
    }
}
