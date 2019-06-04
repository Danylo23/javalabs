package ua.lviv.iot.components.models;


public class RAM extends Components {
    private int memoryAmount;
    private int effectiveBandwidth;
    private int voltageSupply;

    public RAM() {

    }

    public RAM(final String name, final double price,
               final int powerConsumption, final int productYear) {
        super(name, price, powerConsumption, productYear);
    }


    @Override
    public String getHeaders() {

        return super.getHeaders() + ", memoryAmount, effectiveBandwidth, voltageSupply";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + memoryAmount + ", " + effectiveBandwidth + ", " +  voltageSupply;
    }

    public final double getmemoryAmount() {
        return memoryAmount;
    }

    final void setMemoryAmount(final int memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public final int getEffectiveBandwidth() {
        return effectiveBandwidth;
    }

    final void setEffectiveBandwidth(final int effectiveBandwidth) {
        this.effectiveBandwidth = effectiveBandwidth;
    }


    public final int getVoltageSupply(final int voltageSupply) {
        return voltageSupply;
    }

    final void setVoltageSupply(final int voltageSupply) {
        this.voltageSupply = voltageSupply;
    }

}
