package secao12_enumeracao.entities;

import secao12_enumeracao.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    // Atributos básicos
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Associações com outras classes
    private Department department;
    private List<HourContract> contracts =  new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        for(HourContract contract : contracts){
            int contractYear = contract.getDate().getYear();
            int contractMonth = contract.getDate().getMonthValue();
            if(year == contractYear && month == contractMonth){
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
