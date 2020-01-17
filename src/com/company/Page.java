package com.company;

public class Page {
    private int numberPage;
    private String textPage;

    public Page(int numberPage, String textPage) {
        this.numberPage = numberPage;
        this.textPage = textPage;
    }

    @Override
    public String toString() {
        return "numberPage is " + numberPage +
                ", textPage is " + textPage+"\n";
    }

    public int getNumberPage() {
        return numberPage;
    }

    public String getTextPage() {
        return textPage;
    }
}
