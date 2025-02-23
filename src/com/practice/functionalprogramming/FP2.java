package com.practice.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP2 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Let Us C","France D souza",100,Book.TYPE.TECHNOLOGY),
                new Book("Who will cry when you will die","Robert D",90,Book.TYPE.NOVEL),
                new Book("Ramayan","Ramanand Sagar",90,Book.TYPE.HISTORY)
                );

        System.out.println(books.stream().filter(s->s.getAuthor().split(" ").length==2).collect(Collectors.toList()));
        System.out.println(books.stream().filter(s->s.getPages()>=90 && s.getType().name().equals("HISTORY")).collect(Collectors.toList()));

    }
}
class Book {
    enum TYPE {
        TECHNOLOGY,
        NOVEL,
        HISTORY
    }

    private String title;
    private String author;
    private int pages;
    private TYPE type;

    public Book(String title, String author, int pages, TYPE type) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", type=" + type +
                '}';
    }
}
