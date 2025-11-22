package in.shubhamprakash681.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.shubhamprakash681.models.Student;

@Repository
public class StudentRepository {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        System.out.println("Saving to DB, student: " + student);
        String sql = "INSERT INTO students (student_name, marks) VALUES (?, ?)";
        int rows = jdbc.update(sql, student.getStudent_name(), student.getMarks());

        System.out.println("Effected rows: " + rows);
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM students";

        RowMapper<Student> rowMapper = (rs, rowNum) -> {
            Student s = new Student();
            s.setRollNo(rs.getInt("rollNo"));
            s.setStudent_name(rs.getString("student_name"));
            s.setMarks(rs.getInt("marks"));

            return s;
        };

        return jdbc.query(sql, rowMapper);
    }

}
