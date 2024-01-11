package Salary;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int id;
    private String position;
    private double basicSalary;
    private List<Double> paymentHistory = new ArrayList<>();

    public Employee(String name, int id, String position, double basicSalary) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.basicSalary = basicSalary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Method to add salary in Array(paymentHistory)

    // Method to calculate the total salary

    public double calculateTotal(double overtime, double bonus, double deductions) {
        overtime = 0.90 * basicSalary;
        bonus = 0.20 * basicSalary;
        deductions = 0.50 - basicSalary;

        double total = basicSalary + overtime + bonus - deductions;

        System.out.println("Basic Salary:\t" + basicSalary);

        System.out.println("Total Salary is: " + total);

        return total;
    }

    public void paymentHistory(double salary, String paymentMethod) {
        paymentHistory.add(salary);
        for (double payment : paymentHistory) {
            System.out.println(payment);
            System.out.println(paymentMethod);
        }
    }

}
