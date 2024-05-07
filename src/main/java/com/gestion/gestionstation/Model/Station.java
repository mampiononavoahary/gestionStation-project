package com.gestion.gestionstation.Model;

import java.util.UUID;

public class Station {
     private int idStation;
     private UUID stationIdentity;
     private String stationPlace;
     private String stationName;

    public Station(int idStation, UUID stationIdentity, String stationPlace, String stationName) {
        this.idStation = idStation;
        this.stationIdentity = stationIdentity;
        this.stationPlace = stationPlace;
        this.stationName = stationName;
    }

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }

    public UUID getStationIdentity() {
        return stationIdentity;
    }

    public void setStationIdentity(UUID stationIdentity) {
        this.stationIdentity = stationIdentity;
    }

    public String getStationPlace() {
        return stationPlace;
    }

    public void setStationPlace(String stationPlace) {
        this.stationPlace = stationPlace;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public String toString() {
        return "Station{" +
                "idStation=" + idStation +
                ", stationIdentity=" + stationIdentity +
                ", stationPlace='" + stationPlace + '\'' +
                ", stationName='" + stationName + '\'' +
                '}';
    }
}
