package in.shubhamprakash681.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shubhamprakash681.models.Laptop;
import in.shubhamprakash681.repositories.LaptopRepository;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodForProgramming(Laptop lap) {
        return true;
    }
}
