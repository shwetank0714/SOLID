package solid.srp.employee_mgmnt;

public class Employee {

    private String name;
    private int age;
    private String pos;

    Employee(String name, int age, String pos){
        this.name = name;
        this.age = age;
        this.pos = pos;
    }

    // Getters
    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public String getPos(){
        return this.pos;
    }
}


