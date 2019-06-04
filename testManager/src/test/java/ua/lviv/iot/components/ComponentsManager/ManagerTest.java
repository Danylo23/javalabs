package ua.lviv.iot.components.ComponentsManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.components.models.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    private List<Components> components = new LinkedList<>();
    private List<String> resultName = new LinkedList<>();
    private Manager component = new Manager(components);

    @BeforeEach
    void setUp() throws Exception {
        components.add(new CoolingSystem("Asus", 500, 25, 2016, 21, 15));
        components.add(new HDD("Toshiba", 1000, 32, 1000, 32, 2018));
        components.add(new MotherBoard("Asus", 3000, 60, 2019, 8));
        components.add(new PowerSupply("GameMax", 500, 55, 2015));
        components.add(new Processor("AMD", 6000, 20, 2016, 45, 500));
        components.add(new RAM("HyperX", 3000, 5, 2018));
        components.add(new VideoCard("Asus", 12500, 40, 2016));
        resultName.add("AMD");
        resultName.add("Asus");
        resultName.add("Asus");
        resultName.add("Asus");
        resultName.add("GameMax");
        resultName.add("HyperX");
        resultName.add("Toshiba");


    }


    @Test
    void sortByPrice() {
        List<Components> result = component.sortByPrice(true);
        for (int i = 1; i < result.size(); i++) {
            assertTrue(result.get(i - 1).getPrice() >= result.get(i).getPrice());
        }
    }

    @Test
    void sortByProductYear() {
        List<Components> result = component.sortByProductYear(true);
        for (int i = 1; i < result.size(); i++) {
            assertTrue(result.get(i - 1).getProductYear() >= result.get(i).getProductYear());
        }
    }


    @Test
    void sortByProductName() {
        List<Components> result = component.sortByProductName(false);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(result.get(i).getName(), resultName.get(i));
        }
    }
}