package com.talent.java.talent_java_homework.Day6HomeWork.homework3;

public class Books {
    private String bookTitle;
    private String author;
    private int price;

    public Books(String bookTitle, String author, int price) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    double makeDiscount(int percent) {
        int getDiscount = price * percent / 100;
        return price - getDiscount;

    }

}
