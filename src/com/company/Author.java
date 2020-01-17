package com.company;

public class Author implements Comparable<Author>{
private String surname;

public String getSurname() {
        return surname;
        }

public Author(String surname) {
        this.surname =  surname;
        }

@Override
public String toString() {
        return "Author's surname is "  +  surname;
        }

@Override
public int compareTo(Author o) {
        return this.surname.compareTo(o.surname);
        }
        }