package ua.lviv.iot.components.models;

import ua.lviv.iot.components.Main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;


@Entity
@Inheritance
public class Components extends Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer   id;

    private String name;
    private double price;
    private int powerConsumption;
    private int productYear;


    public String getHeaders() {
        return "name, price, powerConsumption, productYear";
    }

    public String toCSV() {
        return getName() + ", " + getPrice() + ", " + getPowerConsumption() +
                ", " + getProductYear();
    }

    @Override
    public String toString() {
        return "Components{"
                +
                "name='" + name + '\''
                +
                ", price=" + price
                +
                ", powerConsumption=" + powerConsumption
                +
                ", productYear=" + productYear
                +
                '}';
    }

    public Components(final String name, final double price,
                      final int powerConsumption, final int productYear) {
        this.name = name;
        this.price = price;
        this.powerConsumption = powerConsumption;
        this.productYear = productYear;
    }

    public Components() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public  String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(final int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(final int productYear) {
        this.productYear = productYear;
    }


}


