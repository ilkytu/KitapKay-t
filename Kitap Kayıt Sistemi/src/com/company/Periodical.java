package com.company;

public class Periodical<Int> extends Source {
    String periodical_title;
    String publisher;
    Int issue_number;

    @Override
    public String getDetails() {
        System.out.println("Periodical title:" + periodical_title);
        System.out.println("Publisher:" + publisher);
        System.out.println("Issue numberr:" + issue_number);
        return null;
    }


}