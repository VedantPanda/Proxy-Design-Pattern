package main;

public class EmployeeImpl implements Employee {

    @Override
    public void createEmployee(String client, Employee employee)  {
        System.out.println("Created the employee successfully");
    }

    @Override
    public void deleteEmployee(String client, int empId)  {
        System.out.println("Deleted the employee successfully");
    }

    @Override
    public Employee getEmployee(String client, int empId) {
        System.out.println("Fetched the employee successfully");
        return new EmployeeImpl();

    }

}
