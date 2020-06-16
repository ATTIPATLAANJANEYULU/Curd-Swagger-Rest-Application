package com.org.volvobus.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "bus")
public class Bus implements Serializable {
    @Id
    private int busId;
    private String busName;
    private double nonACSeatCost;
    private double acSeatCost;

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public double getNonACSeatCost() {
        return nonACSeatCost;
    }

    public void setNonACSeatCost(double nonACSeatCost) {
        this.nonACSeatCost = nonACSeatCost;
    }

    public double getAcSeatCost() {
        return acSeatCost;
    }

    public void setAcSeatCost(double acSeatCost) {
        this.acSeatCost = acSeatCost;
    }

    public Bus(int busId, String busName, double nonACSeatCost, double acSeatCost) {
        this.busId = busId;
        this.busName = busName;
        this.nonACSeatCost = nonACSeatCost;
        this.acSeatCost = acSeatCost;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busId=" + busId +
                ", busName='" + busName + '\'' +
                ", nonACSeatCost=" + nonACSeatCost +
                ", acSeatCost=" + acSeatCost +
                '}';
    }
}
