package in.shubhamprakash681.s10_moving_to_springboot;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Compiling in Laptop...");
    }
}
