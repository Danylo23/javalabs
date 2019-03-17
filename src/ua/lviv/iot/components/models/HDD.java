package ua.lviv.iot.components.models;

public class HDD extends Components {

    private int capasity;
    private int spindleSpeed;

    public HDD() {
    }

    public HDD(String name, double price, int powerConsumprion, int productYear) {
        super(name, price, powerConsumprion, productYear);
    }


    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }

    public int getSpindleSpeed() {
        return spindleSpeed;
    }

    public void setSpindleSpeed(int spindleSpeed) {
        this.spindleSpeed = spindleSpeed;
    }


}
