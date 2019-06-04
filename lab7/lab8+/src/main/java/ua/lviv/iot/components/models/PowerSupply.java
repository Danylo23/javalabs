package ua.lviv.iot.components.models;


public class PowerSupply extends Components {
    private int power;
    private int videoCardCollectors;
    private char modularCableConnectors;

    public PowerSupply() {

    }

    public PowerSupply(final String name, final double price,
                       final int powerConsumption, final int productYear) {
        super(name, price, powerConsumption, productYear);
    }



    @Override
    public String getHeaders() {

        return super.getHeaders() + ", videoCardCollectors, modularCableConnectors, power";
    }
    @Override
    public String toCSV() {

        return super.toCSV() + ", " + power + ", " +  videoCardCollectors + ", " +  modularCableConnectors;
    }

    public final int getPower() {
        return power;
    }

    final void setPower(final int power) {

        this.power = power;
    }

    public final int getVideoCardCollectors() {
        return videoCardCollectors;
    }

    final void setVideoCardCollectors(final int videoCardCollectors) {

        this.videoCardCollectors = videoCardCollectors;
    }

    public final char getModularCableConnectors() {
        return modularCableConnectors;
    }


    final void setModularCableConnectors(final char modularCableConnectors) {

        this.modularCableConnectors = modularCableConnectors;
    }

}

