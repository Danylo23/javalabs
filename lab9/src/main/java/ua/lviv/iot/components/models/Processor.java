package ua.lviv.iot.components.models;


public class Processor extends Components {
    private int coresNumber;
    private int cashe;

    public Processor() {

    }

    public Processor(final String name, final double price,
                     final int powerConsumption, final int productYear, int coresNumber, int cashe) {
        super(name, price, powerConsumption, productYear);
        this.coresNumber = coresNumber;
        this.cashe = cashe;


    }


    @Override
    public String getHeaders() {

        return super.getHeaders() + ", coresNumber, cashe";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + coresNumber + ", " + cashe;
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