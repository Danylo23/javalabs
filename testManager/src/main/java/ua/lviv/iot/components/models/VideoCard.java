package ua.lviv.iot.components.models;

public class VideoCard extends Components {
    private int memory;
    private int frequencyOfMemory;
    private int frequencyOfCores;

    public VideoCard() {

    }

    public VideoCard(final String name, final double price,
                     final int powerConsumption, final int productYear) {
        super(name, price, powerConsumption, productYear);
    }

    public final int getMemory() {
        return memory;
    }

    final void setMemory(final int memory) {

        this.memory = memory;
    }

    public final int getFrequencyOfMemory() {
        return frequencyOfMemory;
    }

    final void setFrequencyOfMemory(final int frequencyOfMemory) {

        this.frequencyOfMemory = frequencyOfMemory;
    }

    public final int getFrequencyOfCores() {
        return frequencyOfCores;
    }

    final void setFrequencyOfCores(final int frequencyOfMemory) {

        this.frequencyOfMemory = frequencyOfMemory;
    }


}
