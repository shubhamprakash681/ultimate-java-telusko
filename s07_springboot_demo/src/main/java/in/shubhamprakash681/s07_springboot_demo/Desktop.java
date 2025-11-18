package in.shubhamprakash681.s07_springboot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Desktop {

    @Autowired
    CPU cpu;

    public void compile() {
        cpu.build();

        System.out.println("Desktop is Compiling...");
    }

}