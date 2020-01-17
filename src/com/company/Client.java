package com.company;

public class Client {
    private String name;
    private Address address;

    public Client(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return  address.toString() +", клиенту "+  name ;
    }
}
