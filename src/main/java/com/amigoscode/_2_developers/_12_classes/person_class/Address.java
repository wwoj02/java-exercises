package com.amigoscode._2_developers._12_classes.person_class;

import java.util.Objects;

public class Address {
    private String streetName;
    private String postalCode;
    private String numberOfBuilding;
    private String numberOfFlat;

    public Address() {
    }

    public Address(String streetName, String postalCode, String numberOfBuilding, String numberOfFlat) {
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.numberOfBuilding = numberOfBuilding;
        this.numberOfFlat = numberOfFlat;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNumberOfBuilding() {
        return numberOfBuilding;
    }

    public void setNumberOfBuilding(String numberOfBuilding) {
        this.numberOfBuilding = numberOfBuilding;
    }

    public String getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(String numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(streetName, address.streetName) && Objects.equals(postalCode, address.postalCode) && Objects.equals(numberOfBuilding, address.numberOfBuilding) && Objects.equals(numberOfFlat, address.numberOfFlat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, postalCode, numberOfBuilding, numberOfFlat);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", numberOfBuilding='" + numberOfBuilding + '\'' +
                ", numberOfFlat='" + numberOfFlat + '\'' +
                '}';
    }
}
