package main;

public class EmployeeImplProxy implements Employee {
    private final Employee employee;

    public EmployeeImplProxy(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void createEmployee(String client, Employee employee) throws Exception {
        if (client.equalsIgnoreCase("ADMIN")) {
            employee.createEmployee(client, employee);
        } else {
            throw new Exception("Access Denied");
        }
    }

    @Override
    public void deleteEmployee(String client, int empId) throws Exception {
        if (client.equalsIgnoreCase("ADMIN")) {
            employee.deleteEmployee(client, empId);
        } else {
            throw new Exception("Access Denied");
        }
    }

    @Override
    public Employee getEmployee(String client, int empId) throws Exception {
        if ("ADMIN".equalsIgnoreCase(client) || "USER".equalsIgnoreCase(client)) {
            return employee.getEmployee(client, empId);
        } else {
            throw new Exception("Access Denied");
        }
    }
}
