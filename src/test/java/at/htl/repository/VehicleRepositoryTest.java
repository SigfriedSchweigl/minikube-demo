package at.htl.repository;

import at.htl.entity.Vehicle;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

class VehicleRepositoryTest {
    @Inject
    VehicleRepository vehicleRepository;

    @Test
    @Transactional
    void createRecoredSmokeTest() {
        var myCar = new Vehicle("Opel", "Kadett");
        vehicleRepository.persist(myCar);
    }
}