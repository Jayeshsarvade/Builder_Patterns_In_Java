package abstractfactorypattern;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting Android Developer's Salary");
        return 50000;
    }

    @Override
    public String name() {
        return "Jayesh";
    }
}
