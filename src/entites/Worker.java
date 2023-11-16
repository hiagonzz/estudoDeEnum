package entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;
    private List<HourContrat> contrats = new ArrayList<>();

    Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {

        this.name = name;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public Worker(String valueOf, double baseSalary2, Departament departament2) {
    }

    public void addContract(HourContrat contrat) {
        contrats.add(contrat);
    }

    public void removeContrac(HourContrat contrat) {

        contrats.remove(contrat);
    }

        public Double income(int year , int month){
            Double sum = baseSalary;
            Calendar cal = Calendar.getInstance();
            for(HourContrat c : contrats){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();

            }
            }
            return sum;
        }





    // getter e setter
    public Double getBaseSalary() {
        return baseSalary;
    }

    public List<HourContrat> getContrats() {
        return contrats;
    }

    public Departament getDepartament() {
        return departament;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }
}
