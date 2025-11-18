package in.shubhamprakash681.s07_springboot_demo;

import org.springframework.stereotype.Component;

@Component
public class CPU {
    public void build() {
        System.out.println("CPU is building...");
    }
}
