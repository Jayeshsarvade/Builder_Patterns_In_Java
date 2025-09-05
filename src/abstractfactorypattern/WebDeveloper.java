package abstractfactorypattern;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting Web Developer's Salary");
        return 40000;
    }

    @Override
    public String name() {
        return "Shefali";
    }
}
