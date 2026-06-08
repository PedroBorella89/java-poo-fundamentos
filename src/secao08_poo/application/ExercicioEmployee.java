package secao08_poo.application;


import secao08_poo.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        System.out.print("Name: ");
        e1.name = sc.nextLine();
        System.out.print("Salary: ");
        e1.salary = sc.nextDouble();
        System.out.print("Tax: ");
        e1.tax = sc.nextDouble();
        System.out.println(e1);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        e1.increasySalary(percentage);
        System.out.println("Update: " + e1);

        sc.close();

    }
}
