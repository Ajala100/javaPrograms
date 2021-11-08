package chapterThree;

public class Employee {
    private String firstName;
    private String lastName;
    double monthlySalary;
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthlySalary < 0)
            throw new IllegalArgumentException("Monthly salary cannot be less than zero");
        else {this.monthlySalary = monthlySalary;}
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary < 0)
            throw new IllegalArgumentException("monthly salary cannot be less than zero");
        else{ this.monthlySalary = monthlySalary;}
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }

    public double yearlySalary(){
        return getMonthlySalary() * 12;
    }
    public double tenPercentRaise(){
        double tenPercent = getMonthlySalary() / 10;
        return monthlySalary + tenPercent;
    }
}
