package factorydesignpattern;

public class AndroidDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("Getting Android Developer's Salary");
        return 50000;
    }
}
