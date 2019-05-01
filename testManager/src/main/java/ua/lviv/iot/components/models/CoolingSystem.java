package ua.lviv.iot.components.models;

public class CoolingSystem extends Components {
    private int fanSize;
    private int weight;

    public CoolingSystem() {
    }

    public CoolingSystem(final String name, final double price,
                         final int powerConsumption, final int productYear) {
        super(name, price, powerConsumption, productYear);
    }

    public final int getFanSize() {
        return fanSize;
    }

    final void setfanSize(final int fanSize) {

        this.fanSize = fanSize;
    }

    public final int getWeight() {
        return weight;
    }

    final void setWeight(final int weight) {

        this.weight = weight;
    }


}


