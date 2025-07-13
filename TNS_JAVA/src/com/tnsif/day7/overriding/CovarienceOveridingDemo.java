package com.tnsif.day7.overriding;


import java.util.concurrent.Callable;

public class CovarienceOveridingDemo {
    public static void main(String[] args) {
    	Color red = new Red();
        Color blue = new Blue();

        System.out.println("Red object: " + red.getColor());
        System.out.println("Blue object: " + blue.getColor());

    }

}

// Parent class
class Color{
    protected Color getColor() {
        Color s = new Color();
        return s;
    }
}

// child class
class Red extends Color{
    protected Red getColor()
    {
        Red s = new Red();
        return s;
    }
}

// child class
class Blue extends Color{
    protected Blue getColor()
    {
        Blue s = new Blue();
        return s;
    }
}

