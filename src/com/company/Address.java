package com.company;

public class Address {
    private String sity;
    private String street;
    private int house;
    private int flat;


    public Address(String sity, String street, int house, int flat) {
        this.sity = sity;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "гор."+ sity + " ул."+ street+ " д."+house + " кв." + flat;
    }

    @Override
    public boolean equals(Object obj) {
        Address a =(Address) obj;
        return street.equals(((Address) obj).street) && sity.equals(((Address) obj).sity)&&house==((Address) obj).house && flat==((Address) obj).flat;
    }
}
