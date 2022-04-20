import java.lang.Math;
import java.util.Scanner;

public class Triangulo implements Shape {

    protected double sideLength;

    public double getSideLength() {
        System.out.println();
        System.out.println("Ingresa la longitud del lado: ");
        Scanner lector = new Scanner(System.in);
        sideLength = lector.nextInt();
        return sideLength;
    }

    private double getHeightLength() {
        return (Math.sqrt(3.0) * sideLength) / 2.0;
    }

    public double getArea() {
        return (sideLength * getHeightLength() / 2.0);
    }

    public double getPerimeter() {
        return sideLength * 3.0;
    }

}