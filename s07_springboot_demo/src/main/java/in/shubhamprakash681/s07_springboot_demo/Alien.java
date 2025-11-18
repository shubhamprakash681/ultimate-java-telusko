package in.shubhamprakash681.s07_springboot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component -> Will create Alien Bean (Alien Object) in appContext Object Container
@Component
public class Alien {
    // @Autowired -> Will pick Desktop's Bean (Object) from appContext Object
    // Container
    @Autowired
    Desktop desktop;

    public void code() {
        desktop.compile();
    }
}
