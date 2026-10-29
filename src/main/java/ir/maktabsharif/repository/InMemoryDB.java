package ir.maktabsharif.repository;

import ir.maktabsharif.model.Book;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDB {

    private static final List<Book> books = new ArrayList<>();

    static {
        books.add(new ir.maktabsharif.model.Book("HarryPotter", "Hedayat", 5.55));
        books.add(new ir.maktabsharif.model.Book("CleanCode", "Robber C Martin", 20.55));
        books.add(new ir.maktabsharif.model.Book("Effective Java", "Bloch", 8.55));
    }

    public List<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        if (book == null) {
            System.out.println("Book Is Null !!!");
        }
        books.add(book);
    }

}
