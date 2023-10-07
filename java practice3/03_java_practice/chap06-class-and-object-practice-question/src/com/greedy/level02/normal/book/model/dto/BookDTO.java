package com.greedy.level02.normal.book.model.dto;

public class BookDTO {
    String title;
    String publisher;
    String author;
    int price;
    double discountRate;
    public BookDTO(){
        printInformation();


    }

    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        printInformation();
    }

    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
        printInformation();
    }
    public void printInformation(){
        System.out.println();
        System.out.print(title+" ");
        System.out.print(publisher+" ");
        System.out.print(author+" ");
        System.out.print(price+" ");
        System.out.print(discountRate+" ");
    }
}
