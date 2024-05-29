package solid.srp.library_mngmnt;

import java.util.List;

public class Report {
    public void getReport(List<Book> issuedBooks){
        System.out.println("Issued Books Report:");
        System.out.println("--------------------");
        for (Book book : issuedBooks) {
            System.out.println("Name: " + book.getName());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Issued: " + (book.isIssued() ? "Yes" : "No"));
            System.out.println("--------------------");
        }
    }
}
