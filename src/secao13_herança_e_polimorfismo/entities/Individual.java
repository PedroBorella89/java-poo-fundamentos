package secao13_herança_e_polimorfismo.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double taxesPay() {
        double taxesPay = 0;
        if (getAnualIncome() < 20000.0) {
            taxesPay = (getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.50);
        }
        else if (getAnualIncome() >= 20000.0) {
            taxesPay = (getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.50);
        }
        return taxesPay;
    }
}
