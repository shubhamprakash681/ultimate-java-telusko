package in.shubhamprakash681;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.shubhamprakash681.config.AppConfig;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            // // "alien" -> id of Alien bean in appContext.xml
            // Alien al1 = (Alien) context.getBean("alien1");
            // al1.code();

            // Alien al2 = (Alien) context.getBean("alien2");
            // al2.code();

            // Alien al3 = (Alien) context.getBean("alien1");
            // al3.code();

            Laptop laptop1 = (Laptop) context.getBean(Laptop.class);
            laptop1.ram = 16;
            Laptop laptop2 = (Laptop) context.getBean(Laptop.class);

            System.out.println("laptop1.ram: " + laptop1.ram); // 16 if laptop's is "singleton", 16 if it is "prototype"
            System.out.println("laptop2.ram: " + laptop2.ram); // 16 if laptop's is "singleton", 0 if it is "prototype"

            Alien al = (Alien) context.getBean(Alien.class);
            System.out.println("al.age: " + al.getAge());

            Employee emp = context.getBean(Employee.class);
            emp.code();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
