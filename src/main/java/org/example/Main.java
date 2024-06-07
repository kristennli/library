package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Books book = new Books("abc", null);
        CDs cd = new CDs("EFG", null);
        DVDs dvd = new DVDs("123", null);
        Periodicals p = new Periodicals("777", null);

        library.addItem(book);
        library.addItem(cd);
        library.addItem(dvd);
        library.addItem(p);

        library.borrowItem(book,"Alice");
        library.borrowItem(p, "Bob");

        library.returnItem(book, "Alice");



    }
}