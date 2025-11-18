package in.shubhamprakash681;

import java.sql.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
        /*
         * JDBC - Java Database Coneectivity
         * import package
         * load and register the driver
         * create connection
         * create statement
         * execute query
         * process the result
         * close the connection
         */

        // jdbc:postgresql://<host>:<port>/<database_name>
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "postgres";

        // load and register the driver
        // Class.forName("org.postgresql.Driver");
        // Since JDBC 4.0 (Java 6+), drivers are autoloaded if present in the classpath,
        // so manual loading is not required now.

        // create connection
        Connection con = DriverManager.getConnection(url, uname, pass);

        System.out.println("Connection Established");

        // Statement Creation
        // Statement st = con.createStatement();

        // ---------------- READ OPERATION ----------------
        // Execute Query
        // String query = "SELECT * FROM employees";
        // ResultSet res = st.executeQuery(query);

        // // Process result
        // // Get Metadata
        // ResultSetMetaData rsmd = res.getMetaData();
        // int columnCount = rsmd.getColumnCount();
        // System.out.println("columnCount: " + columnCount);

        // for (int i = 1; i <= columnCount; i++) {
        // System.out.print(rsmd.getColumnName(i) + "\t");
        // }
        // System.out.println();

        // while (res.next()) {
        // for (int i = 1; i <= columnCount; i++) {
        // System.out.print(rsmd.getColumnName(i) + ": " + res.getString(i) + " ");
        // }
        // System.out.println();
        // }

        // ---------------- INSERT OPERATION ----------------
        // String insertQuery = "INSERT INTO employees (fname, lname, email, dept,
        // salary, hire_date)" +
        // " VALUES ('Hero', 'Hiralal', 'hero.hiralal@example.com', 'IT', 80000.00,
        // '2024-08-15')";

        // int rowsInserted = st.executeUpdate(insertQuery);
        // System.out.println("Rows inserted: " + rowsInserted);

        // ---------------- UPDATE OPERATION ----------------
        // String updateQuery = "UPDATE employees SET salary = 70000 WHERE email =
        // 'hero.hiralal@example.com'";
        // int rowsUpdated = st.executeUpdate(updateQuery);
        // System.out.println("Rows updated: " + rowsUpdated);

        // ---------------- DELETE OPERATION ----------------
        // String deleteQuery = "DELETE FROM employees WHERE emp_id = 100";
        // int rowsDeleted = st.executeUpdate(deleteQuery);
        // System.out.println("Rows deleted: " + rowsDeleted);

        // ---------------- PREPARED STATEMENT ----------------
        String prepQuery = "INSERT INTO employees (fname, lname, email, dept, salary, hire_date) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(prepQuery);

        ArrayList<Employee> employees = Employee.getDummyEmployees();
        for (Employee emp : employees) {
            pst.setString(1, emp.getFname());
            pst.setString(2, emp.getLname());
            pst.setString(3, emp.getEmail());
            pst.setString(4, emp.getDept());
            pst.setDouble(5, emp.getSalary());
            pst.setDate(6, Date.valueOf(emp.getHire_date()));

            pst.addBatch();
        }

        int updateCnt[] = pst.executeBatch();
        System.out.println("Batch Insertion Completed");
        for (int i = 0; i < updateCnt.length; i++) {
            System.out.println("Rows affected for employee " + (i + 1) + ": " + updateCnt[i]);
        }

        System.out.println();

        // close the connection
        System.out.println("Closing Connection");
        con.close();
    }
}
