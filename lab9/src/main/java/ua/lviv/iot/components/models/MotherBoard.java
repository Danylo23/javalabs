package ua.lviv.iot.components.models;


public class MotherBoard extends Components {
    private String processorType;

    public MotherBoard() {

    }

    public MotherBoard(final String name, final double price,
                       final int powerConsumption, final int productYear, int i) {
        super(name, price, powerConsumption, productYear);
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + processorType;
    }


    @Override
    public String getHeaders() {

        return super.getHeaders() + " processorType ";
    }

    final void setProcessorType(final String processorType) {

        this.processorType = processorType;
    }


}
