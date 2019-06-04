package ua.lviv.iot.components;

import ua.lviv.iot.components.ComponentsManager.Manager;
//import ua.lviv.iot.components.models.*;
import ua.lviv.iot.components.models.CoolingSystem;
import ua.lviv.iot.components.models.HDD;
import ua.lviv.iot.components.models.MotherBoard;
import ua.lviv.iot.components.models.Processor;
import ua.lviv.iot.components.models.RAM;
import ua.lviv.iot.components.models.VideoCard;
import ua.lviv.iot.components.models.Components;
import ua.lviv.iot.components.models.PowerSupply;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public final void main(String[] args) {
        List<Components> products = new ArrayList<Components>();
        products.add(new CoolingSystem("Asus", 500, 25, 2016, 21, 15));
        products.add(new HDD("Toshiba", 1000, 32, 1000, 32, 2018));
        products.add(new MotherBoard("Asus", 3000, 60, 2019, 8));
        products.add(new PowerSupply("GameMax", 500, 55, 2015));
        products.add(new Processor("AMD", 6000, 20, 2016, 45, 500));
        products.add(new RAM("HyperX", 3000, 5, 2018));
        products.add(new VideoCard("Asus", 12500, 40, 2016, 12, 2000, 700));

        Manager manager = new Manager(products);
        System.out.println("sorted price :");
        System.out.println(manager.sortByPrice(true));


        System.out.println("sorted year :");
        System.out.println(manager.sortByProductYear(true));

        System.out.println("sorted name:");
        System.out.println(manager.sortByProductName(true));
    }
}
