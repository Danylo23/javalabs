package ua.lviv.iot.components.models;

import ua.lviv.iot.components.Main;


public class Components extends Main {
    private String name;
    private double price;
    private int powerConsumption;
    private int productYear;

    @Override
    public String toString() {
        return "Components{"
                +
                "name='" + name + '\''
                +
                ", price=" + price
                +
                ", powerConsumption=" + powerConsumption
                +
                ", productYear=" + productYear
                +
                '}';
    }

    public Components(final String name, final double price,
                      final int powerConsumption, final int productYear) {
        this.name = name;
        this.price = price;
        this.powerConsumption = powerConsumption;
        this.productYear = productYear;
    }

    public Components() {
    }


    public final double getPrice() {
        return price;
    }

    final void setPrice(final double price) {
        this.price = price;
    }

    public final String getName() {
        return name;
    }

    final void setName(final String name) {
        this.name = name;
    }

    public final int getPowerConsumption() {
        return powerConsumption;
    }

    final void setPowerConsumption(final int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public final int getProductYear() {
        return productYear;
    }

    final void setProductYear(final int productYear) {
        this.productYear = productYear;
    }


}


