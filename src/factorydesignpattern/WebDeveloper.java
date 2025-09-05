package factorydesignpattern;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("Getting Web Developer's Salary");
        return 40000;
    }
}
