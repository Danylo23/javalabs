package ua.lviv.iot.components.models;

public class MotherBoard extends Components {
    private String processorType;

    public MotherBoard() {

    }

    public MotherBoard(String name, double price, int powerConsumption, int productYear) {
        super(name, price, powerConsumption, productYear);
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {

        this.processorType = processorType;
    }


}
