package ua.lviv.iot.components.models;

public class HDD extends Components {

    private int capasity;
    private int spindleSpeed;

    public HDD() {
    }

    public HDD(final String name, final double price,
               final int powerConsumprion, final int productYear) {
        super(name, price, powerConsumprion, productYear);
    }


    public final int getCapasity() {
        return capasity;
    }

    final void setCapasity(final int capasity) {
        this.capasity = capasity;
    }

    public final int getSpindleSpeed() {
        return spindleSpeed;
    }

    final void setSpindleSpeed(final int spindleSpeed) {
        this.spindleSpeed = spindleSpeed;
    }


}
