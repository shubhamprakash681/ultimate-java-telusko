package in.shubhamprakash681;

public class Employee {
    private String name;
    private int age;
    private Desktop desktop;

    public Employee() {
        System.out.println("Employee Bean created");
    }

    public Employee(String name) {
        // for constructor injection
        System.out.println("Employee's Name constructor injector is called");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // for setter injection
        System.out.println("Employee's Age Setter called");
        this.age = age;
    }

    public Desktop getDesktop() {
        return desktop;
    }

    public void setDesktop(Desktop desktop) {
        // for setter injection
        System.out.println("Employee's Desktop Setter called");
        this.desktop = desktop;
    }

    public void code() {
        System.out.println("Employee is coding");
        desktop.compile();
    }
}
