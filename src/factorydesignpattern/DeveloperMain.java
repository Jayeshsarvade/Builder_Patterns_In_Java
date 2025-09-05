package factorydesignpattern;

public class DeveloperMain {

    public static void main(String[] args) {

        Employee webDeveloper = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(webDeveloper.salary());

        Employee androidDeveloper = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(androidDeveloper.salary());
    }
}
