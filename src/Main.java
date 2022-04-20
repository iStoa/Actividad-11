import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Bienvenido(a), este programa te permite calcular el área y perímetro
                de tres figuras geométricas:
                                
                1 - Círculo
                2 - Cuadrado
                3 - Triángulo equilatero
                                
                Cualquier otro número - Salir del programa
                                
                Selecciona la opción que desees: """);

        Scanner lector = new Scanner(System.in);
        int figura;
        figura = lector.nextInt();
        switch (figura) {
            case 1:
                Circulo circle = new Circulo();
                circle.getRadius();
                System.out.println("""
                            
                            ¿Deseas calcular el área o el perímetro?
                            1 - Área
                            2 - Perímetro
                                                    
                            Cualquier otro número - Salir del programa
                            
                            Selecciona la opción que desees: """);

                int metodo;
                metodo = lector.nextInt();

                switch (metodo) {
                    case 1:
                        System.out.println();
                        System.out.println(circle.getArea());
                        break;

                    case 2:
                        System.out.println();
                        System.out.println(circle.getPerimeter());
                        break;

                    default:
                        break;
                }
                break;

            case 2:
                Cuadrado square = new Cuadrado();
                square.getLength();
                System.out.println("""
                            
                            ¿Deseas calcular el área o el perímetro?
                            1 - Área
                            2 - Perímetro
                                                    
                            Cualquier otro número - Salir del programa
                            
                            Selecciona la opción que desees: """);

                metodo = lector.nextInt();

                switch (metodo) {
                    case 1:
                        System.out.println();
                        System.out.println(square.getArea());
                        break;

                    case 2:
                        System.out.println();
                        System.out.println(square.getPerimeter());
                        break;

                    default:
                        break;
                }
                break;
            case 3:
                Triangulo triangle = new Triangulo();
                triangle.getSideLength();
                System.out.println("""
                            
                            ¿Deseas calcular el área o el perímetro?
                            1 - Área
                            2 - Perímetro
                                                    
                            Cualquier otro número - Salir del programa
                            
                            Selecciona la opción que desees: 
                            """);

                metodo = lector.nextInt();

                switch (metodo) {
                    case 1:
                        System.out.println();
                        System.out.println(triangle.getArea());
                        break;

                    case 2:
                        System.out.println();
                        System.out.println(triangle.getPerimeter());
                        break;

                    default:
                        break;
                }
                break;

            default:
                break;
        }

    }

}