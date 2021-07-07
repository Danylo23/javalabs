package ua.lviv.iot.components.models;

public class Processor extends Components {
    private int coresNumber;
    private int cashe;

    public Processor() {

    }

    public Processor(final String name, final double price,
                     final int powerConsumption, final int productYear) {
        super(name, price, powerConsumption, productYear);

    }

    public final int getCoresNumber() {
        return coresNumber;
    }

    final void setCoresNumber(final int coresNumber) {

        this.coresNumber = coresNumber;
    }

    public final int getCashe() {
        return cashe;
    }

    final void setCashe(final int cashe) {

        this.cashe = cashe;
    }

}