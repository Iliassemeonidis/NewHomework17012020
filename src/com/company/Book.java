package com.company;

import java.util.ArrayList;

public class Book {
    private String nameBook;
    private ArrayList<Page>  pages;

    public Book(String nameBook, ArrayList<Page> pages) {
        this.nameBook = nameBook;
        this.pages =  pages;
    }

    public String getNameBook() {
        return nameBook;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "nameBook is  "  +" \'"+nameBook+"\' "  + ", " +  pages.toString();
    }
}
