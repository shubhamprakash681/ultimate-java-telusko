package in.shubhamprakash681;

import jakarta.persistence.Transient;

import java.util.List;

// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;
import jakarta.persistence.OneToOne;

@Entity
// @Table(name = "alien_table") -> To give custom name to the Table
public class Alien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @Column(name = "alien_name") -> To give custom Column name
    private String name;
    private String tech;
    private EmbedabbleLaptop embedabbleLaptop;

    @OneToOne
    private Laptop primaryLaptop;

    // Note: OnetoMany will create a mapping table by default
    // To Prevent this, Add @ManyToOne in Laptop and...
    // change @OneToMany to @OneToMany(mappedBy = 'alien')
    @OneToMany
    private List<Laptop> sharedLaptops;

    @ManyToMany
    // (fetch = FetchType.EAGER)
    private List<Desktop> desktops;

    /*
     * @Transient -> This Column won't be created in Table
     * Common use cases include fields for dynamically calculated data (like an
     * employee's net salary based on salary and tax), temporary UI fields, or data
     * that needs to be communicated between components but not stored in the main
     * database.
     */
    @Transient
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public EmbedabbleLaptop getEmbedabbleLaptop() {
        return embedabbleLaptop;
    }

    public void setEmbedabbleLaptop(EmbedabbleLaptop embedabbleLaptop) {
        this.embedabbleLaptop = embedabbleLaptop;
    }

    public Laptop getPrimaryLaptop() {
        return primaryLaptop;
    }

    public void setPrimaryLaptop(Laptop primaryLaptop) {
        this.primaryLaptop = primaryLaptop;
    }

    public List<Laptop> getSharedLaptops() {
        return sharedLaptops;
    }

    public void setSharedLaptops(List<Laptop> sharedLaptops) {
        this.sharedLaptops = sharedLaptops;
    }

    public List<Desktop> getDesktops() {
        return desktops;
    }

    public void setDesktops(List<Desktop> desktops) {
        this.desktops = desktops;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Alien [id=" + id + ", name=" + name + ", tech=" + tech + ", embedabbleLaptop=" + embedabbleLaptop
                + ", primaryLaptop=" + primaryLaptop + ", sharedLaptops=" + sharedLaptops + ", desktops=" + desktops
                + ", salary=" + salary + "]";
    }

}
