package in.shubhamprakash681.s10_moving_to_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class S10MovingToSpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(S10MovingToSpringbootApplication.class, args);

		Alien al = appContext.getBean(Alien.class);
		System.out.println("al.getAge(): " + al.getAge());
		al.code();
	}

}
