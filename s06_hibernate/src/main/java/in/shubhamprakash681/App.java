package in.shubhamprakash681;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
    private static void createEmployee() {
        Employees emp = new Employees();
        emp.setFname("Rahul");
        emp.setLname("Ramchandran");
        emp.setEmail("rahul.ramachandran@example.com");
        emp.setDept("IT");
        emp.setSalary(120000);
        emp.setHire_date("2022-08-01");

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(in.shubhamprakash681.Employees.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(emp);
        transaction.commit();
        System.out.println("Employee Created");

        session.close();
        sf.close();
    }

    private static void readEmployee() {
        SessionFactory sf = new Configuration().addAnnotatedClass(in.shubhamprakash681.Employees.class).configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Employees emp = session.find(Employees.class, 10);

        System.out.println(emp);

        session.close();
        sf.close();
    }

    private static void updateEmployee() {
        Employees emp = new Employees();
        emp.setEmp_Id(0);
        emp.setFname("Priyadarshini");
        emp.setLname("Ramchandran");
        emp.setEmail("priyadarshini.ramachandran@example.com");
        emp.setDept("IT");
        emp.setSalary(120000);
        emp.setHire_date("2022-08-01");

        SessionFactory sf = new Configuration().addAnnotatedClass(in.shubhamprakash681.Employees.class).configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.merge(emp);

        transaction.commit();
        System.out.println("Employee Updated");

        session.close();
        sf.close();

    }

    private static void deleteEmployee() {
        SessionFactory sf = new Configuration().addAnnotatedClass(in.shubhamprakash681.Employees.class).configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        Employees emp = session.find(Employees.class, 0);
        if (emp != null) {
            session.remove(emp);
        }

        transaction.commit();
        session.close();
        sf.close();
    }

    private static void createAlienWithEmbeddedLaptop() {
        EmbedabbleLaptop l1 = new EmbedabbleLaptop();
        l1.setBrand("Lenovo");
        l1.setModel("S340");
        l1.setRam(16);

        Alien al = new Alien();
        al.setName("Shubham Prakash");
        al.setTech("JAVA");
        al.setEmbedabbleLaptop(l1);

        SessionFactory sf = new Configuration().addAnnotatedClass(in.shubhamprakash681.Alien.class).configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(al);

        transaction.commit();
        session.close();
        sf.close();

        System.out.println("Alien with EmbeddedLaptop Created");
        System.out.println(al);
    }

    private static void createAliensWithLaptopsAndDesktops() {
        Laptop l1 = new Laptop();
        l1.setBrand("Apple");
        l1.setModel("Macbook M1");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setBrand("Apple");
        l2.setModel("Macbook M2");
        l2.setRam(32);

        Laptop l3 = new Laptop();
        l3.setBrand("Apple");
        l3.setModel("Macbook M1");
        l3.setRam(16);

        Laptop l4 = new Laptop();
        l4.setBrand("Apple");
        l4.setModel("Macbook M2");
        l4.setRam(32);

        Desktop dsk1 = new Desktop();
        dsk1.setBrand("Lenovo");
        dsk1.setModel("Desk M1");
        dsk1.setRam(16);

        Desktop dsk2 = new Desktop();
        dsk2.setBrand("Dell");
        dsk2.setModel("Dell M2");
        dsk2.setRam(18);

        Alien al1 = new Alien();
        al1.setName("Shubham Prakash");
        al1.setTech("JAVA");
        al1.setPrimaryLaptop(l1);
        al1.setSharedLaptops(Arrays.asList(l1, l2));
        al1.setDesktops(Arrays.asList(dsk1, dsk2));

        Alien al2 = new Alien();
        al2.setName("Telusko");
        al2.setTech("JAVA");
        al2.setPrimaryLaptop(l3);
        al2.setSharedLaptops(Arrays.asList(l3, l4));
        al2.setDesktops(Arrays.asList(dsk1, dsk2));

        SessionFactory sf = new Configuration().addAnnotatedClass(in.shubhamprakash681.Alien.class)
                .addAnnotatedClass(in.shubhamprakash681.Laptop.class)
                .addAnnotatedClass(in.shubhamprakash681.Desktop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(l4);
        session.persist(dsk1);
        session.persist(dsk2);
        session.persist(al1);
        session.persist(al2);

        transaction.commit();
        session.close();
        sf.close();

        System.out.println("Aliens with Laptops and Desktops Created");
        System.out.println(al1);
        System.out.println(al2);
    }

    private static void hqlSimpleFetch() {
        SessionFactory sf = new Configuration().addAnnotatedClass(in.shubhamprakash681.Laptop.class).configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        // Note: Entity and member names are case sensitive
        // SQL query is case in-sensitive
        Query<Laptop> query = session.createQuery("FROM Laptop WHERE ram=16", Laptop.class);

        List<Laptop> res = query.getResultList();

        System.out.println(res);

        session.close();
        sf.close();
    }

    private static void fetchWithFilterAndSpecificProperties() {
        SessionFactory sf = new Configuration().addAnnotatedClass(in.shubhamprakash681.Laptop.class).configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Query<Laptop> query1 = session.createQuery("from Laptop where brand like ?1 and ram = ?2", Laptop.class);
        query1.setParameter(1, "Apple");
        query1.setParameter(2, 32);

        Query<Object[]> query2 = session.createQuery("select brand, model from Laptop where brand like ?1 and ram = ?2",
                Object[].class);
        query2.setParameter(1, "Apple");
        query2.setParameter(2, 32);

        List<Laptop> res1 = query1.getResultList();
        List<Object[]> res2 = query2.getResultList();

        System.out.println("res1: " + res1);

        System.out.println("res2: ");
        for (Object[] row : res2) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        session.close();
        sf.close();
    }

    public static void main(String[] args) {
        // createEmployee();
        // readEmployee();
        // updateEmployee();
        // deleteEmployee();

        // createAlienWithEmbeddedLaptop();
        // createAliensWithLaptopsAndDesktops();

        // hqlSimpleFetch();
        // fetchWithFilterAndSpecificProperties();

    }
}
