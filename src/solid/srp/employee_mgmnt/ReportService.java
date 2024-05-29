package solid.srp.employee_mgmnt;

public class ReportService {
    public void generateReport(Employee e){
        // Print or generate the Performance Report of the employee
        System.out.println("Details are ---------");
        System.out.println("Age: " + e.getAge());
        System.out.println("Name: " + e.getName());
        System.out.println("Pos: " + e.getPos());
    }
}
