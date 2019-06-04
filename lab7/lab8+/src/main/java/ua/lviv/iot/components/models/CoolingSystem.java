package ua.lviv.iot.components.models;

import javax.persistence.Entity;

@Entity
public class CoolingSystem extends Components {
    private int fanSize;
    private int weight;

    public CoolingSystem() {

    }

    public CoolingSystem(final String name, final double price,
                         final int powerConsumption, final int productYear, int fanSize, int weight) {
        super(name, price, powerConsumption, productYear);
        this.fanSize = fanSize;
        this.weight = weight;
    }

    @Override
    public String getHeaders() {

        return super.getHeaders() + ", fanSize, weight";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + fanSize+ ", " +  weight;
    }

    public int getFanSize() {
        return fanSize;
    }

    void setfanSize(final int fanSize) {


        this.fanSize = fanSize;
    }


    public int getWeight() {
        return weight;
    }

    void setWeight(final int weight) {

        this.weight = weight;
    }


}


