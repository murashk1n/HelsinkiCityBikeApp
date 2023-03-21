package com.example.HelsinkiCityBikeApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stations")
public class Station {
    @Id
    @Column(name = "fid")
    private int fid;
    @Column(name = "station_id")
    private String stationId;
    @Column(name = "station_name_fi")
    private String stationNameFI;
    @Column(name = "station_name_sw")
    private String stationNameSW;

    @Column(name = "station_name_en")
    private String stationNameEn;
    @Column(name = "address_fi")
    private String addressFI;
    @Column(name = "address_sw")
    private String addressSW;
    @Column(name = "city_fi")
    private String cityFI;
    @Column(name = "city_sw")
    private String citySW;
    @Column(name = "operator")
    private String operator;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "coordinate_x")
    private double x;
    @Column(name = "coordinate_y")
    private double y;

    public Station() {
    }

    public Station(int fid, String stationId, String stationNameFI,
                   String stationNameSW, String stationNameEn, String addressFI,
                   String addressSW, String cityFI, String citySW, String operator,
                   int capacity, double x, double y) {
        this.fid = fid;
        this.stationId = stationId;
        this.stationNameFI = stationNameFI;
        this.stationNameSW = stationNameSW;
        this.stationNameEn = stationNameEn;
        this.addressFI = addressFI;
        this.addressSW = addressSW;
        this.cityFI = cityFI;
        this.citySW = citySW;
        this.operator = operator;
        this.capacity = capacity;
        this.x = x;
        this.y = y;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationNameFI() {
        return stationNameFI;
    }

    public void setStationNameFI(String stationNameFI) {
        this.stationNameFI = stationNameFI;
    }

    public String getStationNameSW() {
        return stationNameSW;
    }

    public void setStationNameSW(String stationNameSW) {
        this.stationNameSW = stationNameSW;
    }

    public String getStationNameEn() {
        return stationNameEn;
    }

    public void setStationNameEn(String stationNameEn) {
        this.stationNameEn = stationNameEn;
    }

    public String getAddressFI() {
        return addressFI;
    }

    public void setAddressFI(String addressFI) {
        this.addressFI = addressFI;
    }

    public String getAddressSW() {
        return addressSW;
    }

    public void setAddressSW(String addressSW) {
        this.addressSW = addressSW;
    }

    public String getCityFI() {
        return cityFI;
    }

    public void setCityFI(String cityFI) {
        this.cityFI = cityFI;
    }

    public String getCitySW() {
        return citySW;
    }

    public void setCitySW(String citySW) {
        this.citySW = citySW;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}