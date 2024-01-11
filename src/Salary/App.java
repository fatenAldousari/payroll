package Salary;

public class App {
    public static void main(String[] args) throws Exception {

        Employee fatenEmployee = new Employee("faten", 1234, "eng", 200);

        System.out.println(fatenEmployee);
        double salary1 = fatenEmployee.calculateTotal(0.1, 0.20, 0.3);

        // fatenEmployee.paymentHistory(salary1, "cash");
        fatenEmployee.paymentHistory(salary1);
    }

}
