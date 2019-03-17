package ua.lviv.iot.components.models;

import ua.lviv.iot.components.models.Components;

public class CoolingSystem extends Components {
    private int fanSize;
    private int weight;

    public CoolingSystem() {
    }

    public CoolingSystem(String name, double price, int powerConsumption, int productYear) {
        super(name, price, powerConsumption, productYear);
    }

    public int getFanSize() {
        return fanSize;
    }

    public void setfanSize(int fanSize) {

        this.fanSize = fanSize;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int Weight) {

        this.weight = weight;
    }


}


