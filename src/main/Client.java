package main;

public class Client {
    public static void main(String[] args) {
        try{
            Employee employee = new EmployeeImpl();
            Employee employeeProxy = new EmployeeImplProxy(employee);
            employeeProxy.createEmployee("ADMIN", new EmployeeImpl());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
