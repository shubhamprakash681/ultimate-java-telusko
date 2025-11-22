package in.shubhamprakash681;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.shubhamprakash681.models.Student;
import in.shubhamprakash681.services.StudentService;

@SpringBootApplication
public class S11SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(S11SpringJdbcApplication.class, args);
		StudentService studentService = context.getBean(StudentService.class);

		Student student = context.getBean(Student.class);
		student.setStudent_name("Shubham");
		student.setMarks(100);

		studentService.addStudent(student);

		List<Student> students = studentService.getStudents();
		System.out.println("All Students: " + students);
	}

}
