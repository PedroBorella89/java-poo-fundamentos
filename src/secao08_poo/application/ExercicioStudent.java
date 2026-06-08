package secao08_poo.application;

import secao08_poo.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioStudent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Student name: ");
        student.name = sc.nextLine();
        System.out.print("Type the first note: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Type the second note: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Type the third note: ");
        student.grade3 = sc.nextDouble();
        System.out.println();

        System.out.printf("Final Grade: %.2f%n", student.finalGrade());

        if (student.finalGrade() >= 60) {
            System.out.println("PASS");
        }
        else if (student.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }

        sc.close();

    }
}
