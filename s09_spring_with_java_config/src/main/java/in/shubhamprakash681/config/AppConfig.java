package in.shubhamprakash681.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import in.shubhamprakash681.Alien;
import in.shubhamprakash681.Desktop;
import in.shubhamprakash681.Employee;
import in.shubhamprakash681.Laptop;

@Configuration
public class AppConfig {
    // @Bean(name = "alien1")
    // public Alien alien1() {
    // return new Alien();
    // }

    // @Bean(name = "alien2")
    // public Alien alien2() {
    // return new Alien();
    // }

    // scope="singleton" -> Only one object is created
    // @Bean
    // @Scope("singleton")
    // public Laptop laptop() {
    // return new Laptop();
    // }

    // scope="prototype" -> new, independent instance of a bean is created every
    // time it is requested from the container
    @Bean
    @Scope("prototype")
    public Laptop laptop() {
        return new Laptop();
    }

    @Bean
    public Alien alien() {
        Alien alien = new Alien();
        alien.setAge(22);
        return alien;
    }

    @Bean(name = "desk")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    public Employee employee() {
        Employee emp = new Employee("Shubham");
        emp.setAge(25);
        emp.setDesktop(desktop());
        return emp;
    }
}
