package ua.lviv.iot.components.models;

public class RAM extends Components {
    private int memoryAmount;
    private int effectiveBandwidth;
    private int voltageSupply;

    public RAM() {

    }

    public RAM(String name, double price, int powerConsumprion, int productYear) {
        super(name, price, powerConsumprion, productYear);
    }

    public double getmemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(int memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public int getEffectiveBandwidth() {
        return effectiveBandwidth;
    }

    public void setEffectiveBandwidth(int effectiveBandwidth) {
        this.effectiveBandwidth = effectiveBandwidth;
    }

    public int getVoltageSupply(int voltageSupply) {
        return voltageSupply;
    }

    public void setVoltageSupply(int voltageSupply) {
        this.voltageSupply = voltageSupply;
    }

}
