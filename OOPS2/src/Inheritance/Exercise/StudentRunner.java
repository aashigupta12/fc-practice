package Inheritance.Exercise;

public class StudentRunner {
    public static void main(String[] args) {

        Employee employee = new Employee("Aashi Gupta", "Backend dev");
        employee.setEmail("aashi@12");
        employee.setPhoneNumber("1234-123-123");
        employee.setEmployeeGrade('A');
        employee.setTitle("Backend Developer");
        employee.setEmployeeName("employee");

        System.out.println(employee);
    }
}
