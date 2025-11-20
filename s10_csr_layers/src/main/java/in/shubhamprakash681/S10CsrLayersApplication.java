package in.shubhamprakash681;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.shubhamprakash681.models.Laptop;
import in.shubhamprakash681.services.LaptopService;

@SpringBootApplication
public class S10CsrLayersApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(S10CsrLayersApplication.class, args);

		LaptopService laptopService = context.getBean(LaptopService.class);

		Laptop laptop = context.getBean(Laptop.class);
		laptopService.addLaptop(laptop);
	}

}
