package Business.Employee;

public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;  
    private String status;

    public Employee() {
        id = count;
        count++;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
