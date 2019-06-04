package ua.lviv.iot.components.models;

import javax.persistence.Entity;

@Entity
public class VideoCard extends Components {
    private int memory;
    private int frequencyOfMemory;
    private int frequencyOfCores;

    public VideoCard() {

    }

    public VideoCard(final String name, final double price,
                     final int powerConsumption, final int productYear, final  int memory,
                     final int frequencyOfMemory, final int frequencyOfCores) {
        super(name, price, powerConsumption, productYear);
        this.memory = memory;
        this.frequencyOfCores = frequencyOfCores;
        this.frequencyOfMemory = frequencyOfMemory;

    }



    @Override
    public String getHeaders() {

        return super.getHeaders() + ", memory, frequencyOfCores, frequencyOfMemory";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + memory + ", " + frequencyOfCores+ ", " + frequencyOfMemory;
    }

    public int getMemory() {
        return memory;
    }

    void setMemory(final int memory) {

        this.memory = memory;
    }

    public int getFrequencyOfMemory() {
        return frequencyOfMemory;
    }

    void setFrequencyOfMemory(final int frequencyOfMemory) {

        this.frequencyOfMemory = frequencyOfMemory;
    }

    public int getFrequencyOfCores() {
        return frequencyOfCores;
    }

    void setFrequencyOfCores(final int frequencyOfMemory) {

        this.frequencyOfMemory = frequencyOfMemory;
    }
}
