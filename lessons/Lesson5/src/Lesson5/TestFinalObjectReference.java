package Lesson5;

public class TestFinalObjectReference {
    public static void main(String[] args) {
        final Employee emp1 = new Employee(1, "Sue", "02-002-1234", 10000.00);
        Employee emp2 = new Employee(1, "Sue", "02-002-1234", 10000.00);
        emp1.setEmpId(100);
    }
}

