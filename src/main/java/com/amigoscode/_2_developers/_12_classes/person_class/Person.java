package com.amigoscode._2_developers._12_classes.person_class;

import java.util.Objects;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private Car car;
    private Address address;

    public Person() {
    }

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String name, String lastname, int age, Car car) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.car = car;
    }

    public Person(String name, String lastname, int age, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String lastname, int age, Car car, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.car = car;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(car, person.car) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age, car, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", address=" + address +
                '}';
    }


}
