package solid.srp.library_mngmnt;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private long id;
    private List<Book> issuedBooks;

    public Member(String name, long id){
        this.id = id;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public long getId() {
        return id;
    }

    // Methods
    public void issueBook(Book book) {
        if (!book.isIssued()) {
            book.setIssued(true);
            this.issuedBooks.add(book);
        }
    }
}
