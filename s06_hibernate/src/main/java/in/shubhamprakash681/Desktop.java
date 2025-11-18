package in.shubhamprakash681;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Desktop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int desktopId;
    private String brand;
    private String model;
    private int ram;

    public int getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(int desktopId) {
        this.desktopId = desktopId;
    }

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
        return "Desktop [desktopId=" + desktopId + ", brand=" + brand + ", model=" + model + ", ram=" + ram + "]";
    }

}
