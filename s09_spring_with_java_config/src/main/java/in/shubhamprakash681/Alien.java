package in.shubhamprakash681;

public class Alien {
    private int age;

    public Alien() {
        System.out.println("Alien Object (Bean) created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // It will be called during DI as in xml we are setting age <property>
        // If setter func is not defined, then DI will throw Exception
        System.out.println("Alien's setAge called");
        this.age = age;
    }

    public void code() {
        System.out.println("Coding");
    }
}
