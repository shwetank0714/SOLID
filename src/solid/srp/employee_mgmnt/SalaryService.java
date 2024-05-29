package solid.srp.employee_mgmnt;

public class SalaryService {
    public double calculateSalary(Employee e){
        // based on the Type calculate salary
        // Based on the employee position we can calculate the salary
        return switch (e.getPos()) {
            case "MANAGER" -> 900000d;
            case "DEVELOPER" -> 70000d;
            case "INTERN" -> 10000;
            default -> 0;
        };
    }
}
