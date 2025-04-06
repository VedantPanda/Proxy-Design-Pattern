package main;

public interface Employee {

    void createEmployee(String client, Employee employee) throws Exception;

    void deleteEmployee(String client, int empId) throws Exception;

    Employee getEmployee(String client, int empId) throws Exception;

}
