package ua.lviv.iot.components.ComponentsManager;

import ua.lviv.iot.components.models.Components;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Manager {

    public Manager() {
    }

    public List<Components> products;

    public Manager(final List<Components> products) {
        this.products = products;
    }

    public final List<Components> sortByPrice(final boolean reverse) {

        if
        (reverse) Collections.sort(products, Comparator.comparing
                (Components::getPrice).reversed());
        else {
            products.sort(Comparator.comparing
                    (Components::getPrice));
        }
        return products;
    }


    public final List<Components> sortByProductYear(final boolean reverse) {

        if (reverse) {
            products.sort(Comparator.comparing
                    (Components::getProductYear).reversed());
        } else {
            Collections.sort(products, Comparator.comparing
                    (Components::getPrice));
        }
        return products;
    }

    final public List<Components> sortByProductName(final boolean reverse) {
        if (reverse)
            products.sort(Comparator.comparing
                    (Components::getName).reversed());
        else {
            Collections.sort(products, Comparator.comparing
                    (Components::getName));
        }

        return products;
    }
}




