package in.shubhamprakash681;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employees {
        // fname, lname, email, dept, salary, hire_date
        @Id
        private int emp_id;
        private String fname;
        private String lname;
        private String email;
        private String dept;
        private double salary;
        private String hire_date;

        public int getEmp_id() {
                return emp_id;
        }

        public String getFname() {
                return fname;
        }

        public String getLname() {
                return lname;
        }

        public String getEmail() {
                return email;
        }

        public String getDept() {
                return dept;
        }

        public double getSalary() {
                return salary;
        }

        public String getHire_date() {
                return hire_date;
        }

        public void setEmp_Id(int emp_id) {
                this.emp_id = emp_id;
        }

        public void setFname(String fname) {
                this.fname = fname;
        }

        public void setLname(String lname) {
                this.lname = lname;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public void setDept(String dept) {
                this.dept = dept;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        public void setHire_date(String hire_date) {
                this.hire_date = hire_date;
        }

}
