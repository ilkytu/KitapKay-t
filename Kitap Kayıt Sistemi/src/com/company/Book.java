package com.company;

public class Book<Int> extends Source {
       String book_name;
       String author;
       Int ISBN_number;

    @Override
    public String getDetails() {
        System.out.println("Book name:" + book_name);
        System.out.println("Author:" + author);
        System.out.println("ISBN number:" + ISBN_number);
        return null;
    }

}
