package com.company;

public class Main {

    public static void main(String[] args) {

        Book book = new Book();
        book.book_name = "Kuyucaklı Yusuf";
        book.author = "Sabahattin Ali";
        book.ISBN_number = 97456;
        Book book_2 = new Book();
        book_2.book_name = "Savaş ve Barış";
        book_2.author = "Tolstoy";
        book_2.ISBN_number = 36541;


        Periodical periodicalDetails = new Periodical();
        periodicalDetails.periodical_title = "Computer Science";
        periodicalDetails.publisher = "ACM";
        periodicalDetails.issue_number = 354;

        System.out.println(book.getDetails());
        System.out.println(book_2.getDetails());
        System.out.println((periodicalDetails.getDetails()));
    }
}