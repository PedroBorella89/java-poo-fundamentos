package secao08_poo.entities;

public class Student {

    // Atributos
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    // Métodos
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGrade() < 60) {
            return 60.0 - finalGrade();
        }
        else {
            return 0.00;
        }
    }
}
