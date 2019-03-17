package ua.lviv.iot.components.models;

public class VideoCard extends Components {
    private int memory;
    private int frequencyOfMemory;
    private int frequencyOfCores;

    public VideoCard() {

    }

    public VideoCard(String name, double price, int powerConsumption, int productYear) {
        super(name, price, powerConsumption, productYear);
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {

        this.memory = memory;
    }

    public int getFrequencyOfMemory() {
        return frequencyOfMemory;
    }

    public void setFrequencyOfMemory(int frequencyOfMemory) {

        this.frequencyOfMemory = frequencyOfMemory;
    }

    public int getFrequencyOfCores() {
        return frequencyOfCores;
    }

    public void setFrequencyOfCores(int frequencyOfMemory) {

        this.frequencyOfMemory = frequencyOfMemory;
    }


}
