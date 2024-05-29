package solid.srp.library_mngmnt;

public class BookIssuanceService {
    public void issueBook(Member member, Book book){
        if (!book.isIssued()){
            member.issueBook(book);
        } else {
            System.out.println("Book is already issued.");
        }
    }
}
