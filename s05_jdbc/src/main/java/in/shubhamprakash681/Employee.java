package in.shubhamprakash681;

import java.util.ArrayList;

public class Employee {
        // fname, lname, email, dept, salary, hire_date
        private String fname;
        private String lname;
        private String email;
        private String dept;
        private double salary;
        private String hire_date;

        public Employee(String fname, String lname, String email, String dept, double salary, String hire_date) {
                this.fname = fname;
                this.lname = lname;
                this.email = email;
                this.dept = dept;
                this.salary = salary;
                this.hire_date = hire_date;
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

        public static ArrayList<Employee> getDummyEmployees() {
                ArrayList<Employee> employees = new ArrayList<>();

                employees.add(new Employee("John", "Smith", "john.smith1@example.com", "Engineering", 78000,
                                "2019-03-12"));
                employees.add(new Employee("Emily", "Johnson", "emily.johnson2@example.com", "Marketing", 62000,
                                "2020-07-19"));
                employees.add(new Employee("Michael", "Brown", "michael.brown3@example.com", "Finance", 85000,
                                "2018-11-04"));
                employees.add(
                                new Employee("Jessica", "Davis", "jessica.davis4@example.com", "Human Resources", 59000,
                                                "2021-01-23"));
                employees.add(
                                new Employee("Daniel", "Miller", "daniel.miller5@example.com", "Engineering", 91000,
                                                "2017-06-15"));

                employees.add(new Employee("Sarah", "Wilson", "sarah.wilson6@example.com", "Sales", 54000,
                                "2022-05-10"));
                employees.add(new Employee("David", "Moore", "david.moore7@example.com", "Engineering", 88000,
                                "2016-09-28"));
                employees.add(new Employee("Ashley", "Taylor", "ashley.taylor8@example.com", "Marketing", 61000,
                                "2020-02-17"));
                employees.add(
                                new Employee("Matthew", "Anderson", "matthew.anderson9@example.com", "Finance", 79000,
                                                "2019-04-30"));
                employees.add(
                                new Employee("Olivia", "Thomas", "olivia.thomas10@example.com", "Engineering", 94000,
                                                "2018-10-12"));

                employees.add(
                                new Employee("Andrew", "Jackson", "andrew.jackson11@example.com", "IT Support", 53000,
                                                "2021-09-03"));
                employees
                                .add(new Employee("Sophia", "White", "sophia.white12@example.com", "Engineering", 80000,
                                                "2017-12-21"));
                employees.add(new Employee("Joshua", "Harris", "joshua.harris13@example.com", "Sales", 57000,
                                "2019-03-18"));
                employees.add(new Employee("Ava", "Martin", "ava.martin14@example.com", "Finance", 84000,
                                "2020-10-07"));
                employees.add(new Employee("Christopher", "Thompson", "chris.thompson15@example.com", "Human Resources",
                                60000,
                                "2022-01-14"));

                employees.add(new Employee("Mia", "Garcia", "mia.garcia16@example.com", "Engineering", 92000,
                                "2015-07-25"));
                employees.add(
                                new Employee("Ethan", "Martinez", "ethan.martinez17@example.com", "IT Support", 56000,
                                                "2018-08-09"));
                employees.add(new Employee("Isabella", "Robinson", "isabella.robinson18@example.com", "Marketing",
                                64000,
                                "2019-11-13"));
                employees.add(new Employee("Alexander", "Clark", "alex.clark19@example.com", "Sales", 58000,
                                "2021-06-05"));
                employees.add(new Employee("Charlotte", "Rodriguez", "charlotte.rodriguez20@example.com", "Finance",
                                83000,
                                "2016-10-29"));

                employees.add(new Employee("Benjamin", "Lewis", "ben.lewis21@example.com", "Engineering", 96000,
                                "2017-02-11"));
                employees.add(new Employee("Amelia", "Lee", "amelia.lee22@example.com", "Marketing", 65000,
                                "2020-05-22"));
                employees.add(new Employee("Henry", "Walker", "henry.walker23@example.com", "Finance", 81000,
                                "2019-12-03"));
                employees.add(
                                new Employee("Evelyn", "Hall", "evelyn.hall24@example.com", "Human Resources", 61000,
                                                "2018-04-16"));
                employees.add(
                                new Employee("Jackson", "Allen", "jackson.allen25@example.com", "Engineering", 97000,
                                                "2016-11-20"));

                employees.add(new Employee("Harper", "Young", "harper.young26@example.com", "Sales", 59000,
                                "2021-03-09"));
                employees.add(
                                new Employee("Logan", "Hernandez", "logan.hernandez27@example.com", "IT Support", 55000,
                                                "2022-02-27"));
                employees.add(new Employee("Abigail", "King", "abigail.king28@example.com", "Finance", 82000,
                                "2017-08-31"));
                employees.add(new Employee("Ryan", "Wright", "ryan.wright29@example.com", "Engineering", 90000,
                                "2019-01-25"));
                employees.add(new Employee("Ella", "Lopez", "ella.lopez30@example.com", "Marketing", 66000,
                                "2020-06-18"));

                employees.add(new Employee("Nathan", "Hill", "nathan.hill31@example.com", "Finance", 84500,
                                "2018-09-10"));
                employees.add(new Employee("Grace", "Scott", "grace.scott32@example.com", "Engineering", 93000,
                                "2016-04-06"));
                employees.add(
                                new Employee("Samuel", "Green", "samuel.green33@example.com", "Human Resources", 62000,
                                                "2022-08-01"));
                employees.add(new Employee("Aria", "Adams", "aria.adams34@example.com", "Sales", 58000, "2019-05-14"));
                employees.add(
                                new Employee("Gabriel", "Baker", "gabriel.baker35@example.com", "IT Support", 54500,
                                                "2021-11-26"));

                employees.add(new Employee("Chloe", "Nelson", "chloe.nelson36@example.com", "Marketing", 67000,
                                "2020-03-02"));
                employees
                                .add(new Employee("Lucas", "Carter", "lucas.carter37@example.com", "Engineering", 92000,
                                                "2015-10-09"));
                employees.add(new Employee("Lily", "Mitchell", "lily.mitchell38@example.com", "Finance", 87500,
                                "2017-03-30"));
                employees.add(
                                new Employee("Caleb", "Perez", "caleb.perez39@example.com", "Human Resources", 60500,
                                                "2019-09-21"));
                employees.add(new Employee("Zoe", "Roberts", "zoe.roberts40@example.com", "Marketing", 66000,
                                "2021-07-08"));

                employees
                                .add(new Employee("Wyatt", "Turner", "wyatt.turner41@example.com", "Engineering", 95000,
                                                "2018-12-12"));
                employees.add(
                                new Employee("Hannah", "Phillips", "hannah.phillips42@example.com", "Finance", 84000,
                                                "2016-05-02"));
                employees.add(new Employee("Jack", "Campbell", "jack.campbell43@example.com", "Sales", 60000,
                                "2020-08-27"));
                employees.add(new Employee("Scarlett", "Parker", "scarlett.parker44@example.com", "Human Resources",
                                63000,
                                "2021-10-15"));
                employees.add(new Employee("Owen", "Evans", "owen.evans45@example.com", "IT Support", 56000,
                                "2019-01-19"));

                employees.add(new Employee("Victoria", "Edwards", "victoria.edwards46@example.com", "Engineering",
                                98000,
                                "2017-07-14"));
                employees
                                .add(new Employee("Dylan", "Collins", "dylan.collins47@example.com", "Marketing", 65500,
                                                "2020-11-01"));
                employees.add(new Employee("Sofia", "Stewart", "sofia.stewart48@example.com", "Finance", 89000,
                                "2018-06-23"));
                employees
                                .add(new Employee("Levi", "Sanchez", "levi.sanchez49@example.com", "Engineering", 91000,
                                                "2016-02-28"));
                employees.add(new Employee("Aubrey", "Morris", "aubrey.morris50@example.com", "Human Resources", 64000,
                                "2022-04-05"));

                return employees;
        }

}
