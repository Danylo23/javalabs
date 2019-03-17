package ua.lviv.iot.components.models;

public class PowerSupply extends Components {
    private int power;
    private int videoCardCollectors;
    private char modularCableConnectors;

    public PowerSupply() {

    }

    public PowerSupply(String name, double price, int powerConsumption, int productYear) {
        super(name, price, powerConsumption, productYear);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {

        this.power = power;
    }

    public int getVideoCardCollectors() {
        return videoCardCollectors;
    }

    public void setVideoCardCollectors(int videoCardCollectors) {

        this.videoCardCollectors = videoCardCollectors;
    }

    public char getModularCableConnectors() {
        return modularCableConnectors;
    }

    public void setModularCableConnectors(char modularCableConnectors) {

        this.modularCableConnectors = modularCableConnectors;
    }

}

