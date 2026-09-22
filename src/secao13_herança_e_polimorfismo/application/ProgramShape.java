package secao13_herança_e_polimorfismo.application;

import secao13_herança_e_polimorfismo.entities.Circle;
import secao13_herança_e_polimorfismo.entities.Rectangle;
import secao13_herança_e_polimorfismo.entities.Shape;
import secao13_herança_e_polimorfismo.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramShape {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or circle (r/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED)? ");
            Color color = Color.valueOf(sc.nextLine());

            if (ch == 'r' || ch == 'R') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(color, width, height));
            }
            else if (ch == 'c' || ch == 'C') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }
            else {
                System.out.println("Invalid input");
            }
        }

        System.out.println();
        System.out.println("=== SHAPE AREAS ===");
        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
