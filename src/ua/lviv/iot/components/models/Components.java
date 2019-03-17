package ua.lviv.iot.components.models;

import ua.lviv.iot.components.Main;


public class Components extends Main {
    private String name;
    private double price;
    private int powerConsumption;
    private int productYear;

    @Override
    public String toString() {
        return "Components{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", powerConsumption=" + powerConsumption +
                ", productYear=" + productYear +
                '}';
    }

    public Components(String name, double price, int powerConsumption, int productYear) {
        this.name = name;
        this.price = price;
        this.powerConsumption = powerConsumption;
        this.productYear = productYear;
    }

    public Components() {
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }


}


