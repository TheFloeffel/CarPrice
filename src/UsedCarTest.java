import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsedCarTest {

    UsedCar u1;

    @BeforeEach
    void setUp() {

        u1 = new UsedCar(10000,"Tesla",100000);

    }

    @Test
    void testGetCarPrice() {

        assertTrue(95000 == u1.getCarPrice());

    }
}