package practice2_4.domain;

public class Manager extends Employee {
    private String deptName;


    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
    public void managerMethod(){
    }
}
