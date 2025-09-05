package abstractfactorypattern;

public class ClientMain {

    public static void main(String[] args) {

        EmployeeAbstractFactory androidDevFactory = new AndroidDevFactory();
        Employee employee = androidDevFactory.createEmployee();
        System.out.println(employee.name());
        System.out.println(employee.salary());

        EmployeeAbstractFactory webDevFactory = new WebDevFactory();
        Employee employee1 = webDevFactory.createEmployee();
        System.out.println(employee1.name());
        System.out.println(employee1.salary());
    }
}
