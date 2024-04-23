package CodingExcercise.Cylinder;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(-5.0);
        System.out.println("Circle.radius = " + circle.getRadius());
        System.out.println("Circle.Area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 1.0);
        System.out.println("Cylinder.Radius = " + cylinder.getRadius());
        System.out.println("Cylinder.Height = " + cylinder.getHeight());
        System.out.println("Cylinder.are = " + cylinder.getArea());
        System.out.println("Cylinder.Volume = " + cylinder.getVolume());

    }
}
