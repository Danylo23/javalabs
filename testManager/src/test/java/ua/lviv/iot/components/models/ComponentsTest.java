package ua.lviv.iot.components.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComponentsTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testCoolingSystem() {
        Components coolingSystem = new CoolingSystem("Asus", 500, 25, 2016);
        assertEquals(500, coolingSystem.getPrice());
        assertEquals(2016, coolingSystem.getProductYear());
        assertEquals("Asus", coolingSystem.getName());

    }

    @Test
    void testHDD() {
        Components hDD = new HDD("Toshiba", 1000, 32, 2018);
        assertEquals(1000, hDD.getPrice());
        assertEquals(2018, hDD.getProductYear());
        assertEquals("Toshiba", hDD.getName());

    }

    @Test
    void testMotherBoard() {
        Components motherBoard = new MotherBoard("Asus", 3000, 60, 2019);
        assertEquals(3000, motherBoard.getPrice());
        assertEquals(2019, motherBoard.getProductYear());
        assertEquals("Asus", motherBoard.getName());
    }

    @Test
    void testPowerSupply() {
        Components powersupply = new PowerSupply("GameMax", 500, 55, 2015);
        assertEquals(500, powersupply.getPrice());
        assertEquals(2015, powersupply.getProductYear());
        assertEquals("GameMax", powersupply.getName());
    }
    @Test
    void testProcessor() {
        Components processor = new Processor("AMD", 6000, 20, 2016);
        assertEquals(6000, processor.getPrice());
        assertEquals(2016, processor.getProductYear());
        assertEquals("AMD", processor.getName());
    }
    @Test
    void testManager() {
        Components ram = new RAM("HyperX", 3000, 5, 2018);
        assertEquals(3000, ram.getPrice());
        assertEquals(2018, ram.getProductYear());
        assertEquals("HyperX", ram.getName());
    }
    @Test
    void testVideoCard() {
        Components videocard = new VideoCard("Asus", 12500, 40, 2016);
        assertEquals(12500, videocard.getPrice());
        assertEquals(2016, videocard.getProductYear());
        assertEquals("Asus", videocard.getName());
    }
}