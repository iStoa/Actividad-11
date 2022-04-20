import java.util.Scanner;

public class Cuadrado implements Shape {
    protected double length;

    public double getLength() {
        System.out.println();
        System.out.println("Ingresa la longitud del lado: ");
        Scanner lector = new Scanner(System.in);
        length = lector.nextInt();
        return length;
    }

    public double getArea() {
        return length*length;
    }

    public double getPerimeter() {
        return length*4;
    }

}