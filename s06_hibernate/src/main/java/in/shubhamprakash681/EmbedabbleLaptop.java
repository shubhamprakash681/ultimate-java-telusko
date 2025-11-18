package in.shubhamprakash681;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

// Embeddable is for embedding fields in the parent table itself
@Embeddable
public class EmbedabbleLaptop {
    @Column(name = "e_l_brand")
    private String brand;
    @Column(name = "e_l_model")
    private String model;
    @Column(name = "e_l_ram")
    private int ram;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", model=" + model + ", ram=" + ram + "]";
    }

}
