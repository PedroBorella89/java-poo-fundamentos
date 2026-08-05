package secao10_arrays.application;

import secao10_arrays.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SalaryIncreaseExercise {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registred? ");
        int n = sc.nextInt();
        System.out.println();

        List<Employee> employees = new ArrayList<Employee>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee ID that will have the salary increase: ");
        int idsalary = sc.nextInt();

        Employee emp = employees.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("Employee with ID " + idsalary + " not found!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage  = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();

    }

}
