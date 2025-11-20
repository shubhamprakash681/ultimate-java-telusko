package in.shubhamprakash681.s10_moving_to_springboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
    public void compile() {
        System.out.println("Compiling in Desktop...");
    }
}
