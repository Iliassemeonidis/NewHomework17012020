package com.company;

public class Post {
    private String namePost;
    private Client clientAddr;


    public Post(String namePost, Client clientAddr) {
        this.namePost = namePost;
        this.clientAddr = clientAddr;
    }

    @Override
    public String toString() {
        return "Наименование посылки: " +"\'"+ namePost+"\'"+", " +" по адрессу "+ clientAddr.toString();
    }
}
