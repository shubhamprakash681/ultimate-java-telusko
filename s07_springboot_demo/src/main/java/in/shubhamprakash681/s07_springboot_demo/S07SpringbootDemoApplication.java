package in.shubhamprakash681.s07_springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class S07SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(S07SpringbootDemoApplication.class, args);
		System.out.println("Hello World!!");

		// This will work as we @Component is added in Class description. So,
		// Alien Bean will be created in appContext Object Container on app load.
		Alien alien = appContext.getBean(Alien.class);
		alien.code();

		// This won't work (throw Errors) as we @Component is not added in Class
		// description. So,
		// Laptop Bean won't be created in appContext Object Container on app load.
		// Laptop lap = appContext.getBean(Laptop.class);
		// lap.code();
	}

}
