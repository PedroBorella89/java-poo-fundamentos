package secao08_poo.entities;

public class Employee {

    // Atributos
    public String name;
    public double salary;
    public double tax;

    // Métodos
    public double netSalary() {
        return salary - tax;
    }

    public void increasySalary(double percentage) {
        salary += salary * percentage /  100;
    }

    public String toString() {
        return name + " - $ " + String.format("%.2f", netSalary());
    }
}
