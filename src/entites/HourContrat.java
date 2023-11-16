package entites;

import java.util.Date;

public class HourContrat {
    private Date date;
    private Double valuePerHour;
    private int hours;

    HourContrat() {

    }

    HourContrat(Date date, Double valuePerHour, int hours) {

        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;

    }

    public Double totalValue() {
        return valuePerHour * hours;
    }

    // getter and setter

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }
}
