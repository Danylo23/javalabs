package ua.lviv.iot.components.models;

public class MotherBoard extends Components {
    private String processorType;

    public MotherBoard() {

    }

    public MotherBoard(final String name, final double price,
                       final int powerConsumption, final int productYear) {
        super(name, price, powerConsumption, productYear);
    }

    public final String getProcessorType() {
        return processorType;
    }

    final void setProcessorType(final String processorType) {

        this.processorType = processorType;
    }


}
