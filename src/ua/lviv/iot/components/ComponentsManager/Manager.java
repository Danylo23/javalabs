package ua.lviv.iot.components.ComponentsManager;

import ua.lviv.iot.components.models.Components;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Manager {
    private List<Components> products;

    public Manager(List<Components> products) {
        this.products = products;
    }

    public List<Components> sortByPrice(boolean reverse) {

        if (reverse) {
            Collections.sort(products, Comparator.comparing(Components::getPrice).reversed());
        } else {
            Collections.sort(products, Comparator.comparing(Components::getPrice));
        }
        return products;

    }

    public List<Components> sortByProductYear(boolean reverse) {

        if (reverse) {
            Collections.sort(products, Comparator.comparing(Components::getProductYear).reversed());
        } else {
            Collections.sort(products, Comparator.comparing(Components::getPrice));

        }
        return products;
    }

    public List<Components> sortByProductName(boolean reverse) {
        if (reverse)
            Collections.sort(products, Comparator.comparing(Components::getName).reversed());
        else {
            Collections.sort(products, Comparator.comparing(Components::getName));
        }

        return products;
    }
}



