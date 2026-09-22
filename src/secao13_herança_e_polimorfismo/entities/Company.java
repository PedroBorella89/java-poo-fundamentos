package secao13_herança_e_polimorfismo.entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double taxesPay() {
        double taxesPay = 0;
        if (getNumberOfEmployees() < 10.0) {
            taxesPay = (getAnualIncome() * 0.16);
        }
        else if (getNumberOfEmployees() >= 10.0) {
            taxesPay = (getAnualIncome() * 0.14);
        }
        return taxesPay;
    }
}
