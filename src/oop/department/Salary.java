package oop.department;

public class Salary {
    private double monthly;
    private double yearlyBonus;

    public Salary(double monthly, double yearlyBonus) {
        this.monthly = monthly;
        this.yearlyBonus = yearlyBonus;
    }

    public double getMonthly() {
        return monthly;
    }

    public void setMonthly(double monthly) {
        this.monthly = monthly;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public String toString() {
        return  "monthly=" + monthly +
                ", yearlyBonus=" + yearlyBonus +
                '}';
    }
}
