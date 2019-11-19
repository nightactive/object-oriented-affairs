package com.company;

public class Main {

    public static void main(String[] args) {
        Author Ivanov = new Author("Ivanov", "ivanov762@gmail.com");
        Book dummyBook = new Book("Java for begginers", Ivanov, 200.0D, 99);
        System.out.println(dummyBook);
        Book moreDummyBook = new Book("Java for developers", new Author("Levchenko", "levchenvko@gmail.com"), 19.99D, 8);
        System.out.println(moreDummyBook);
    }
}
