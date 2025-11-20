package in.shubhamprakash681.repositories;

import org.springframework.stereotype.Repository;

import in.shubhamprakash681.models.Laptop;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("Congratulations🎉 Laptop saved in DB");
    }
}
