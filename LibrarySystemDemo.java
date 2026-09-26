package com.mycompany.lab6;

public class LibrarySystemDemo {

    public static void main(String[] args) {

        LibrarySystem library = new LibraryImplementation();

        library.addBook("B005", "Software Construction", "Engr Rizwan Shah");
        library.addBook("B010", "OOPs", "Engr Yasir Malik");

        System.out.println(library.searchBook("B005"));

        library.issueBook("B005");
        System.out.println(library.searchBook("B005"));

        library.returnBook("B005");
        System.out.println(library.searchBook("B005"));

        library.removeBook("B010");
        System.out.println(library.searchBook("B010"));
    }
}