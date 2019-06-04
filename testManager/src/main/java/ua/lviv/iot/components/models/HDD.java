package ua.lviv.iot.components.models;

public class HDD extends Components {

    private int capasity;
    private int spindleSpeed;

    public HDD() {
    }

    public HDD(final String name, int i1, int i, final double price,
               final int powerConsumption, final int productYear) {
        super(name, price, powerConsumption, productYear);
    }


    @Override
    public String getHeaders() {

        return super.getHeaders() + ", capasity, spindleSpeed";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + capasity + ", " + spindleSpeed;
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
