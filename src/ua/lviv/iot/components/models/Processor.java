package ua.lviv.iot.components.models;

public class Processor extends Components {
    private int coresNumber;
    private int cashe;

    public Processor() {

    }

    public Processor(String name, double price, int powerConsumption, int productYear) {
        super(name, price, powerConsumption, productYear);

    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public void setCoresNumber(int coresNumber) {

        this.coresNumber = coresNumber;
    }

    public int getCashe() {
        return cashe;
    }

    public void setCashe(int cashe) {

        this.cashe = cashe;
    }

}