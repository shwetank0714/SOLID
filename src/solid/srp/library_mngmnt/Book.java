package solid.srp.library_mngmnt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String name;
    private String author;
    private long isbn;
    private boolean isIssued;

    public Book(String name, String author, long isbn){
        this.author = author;
        this.isbn = isbn;
        this.name = name;
        this.isIssued = false;
    }

    // Getters
    public String getName() {
        return name;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }
}


