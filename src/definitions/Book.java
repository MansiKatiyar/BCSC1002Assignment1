/*  Created by IntelliJ IDEA.
 *  User: Mansi katiyar
 *  Date: 28/08/20
 *  Time: 7:30 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String ISBN;

    public Book(String bookName, String bookAuthorName, String ISBN) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.ISBN = ISBN;
    }

    public Book() {
        bookName = "DBMS";
        bookAuthorName = "Navathe";
        ISBN = "978-0-136-08620-8";
    }

    public String getBookName() {
        return null;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthorName() {
        return null;
    }

    public void setBookAuthorName(String bookAuthorName){
        this.bookAuthorName = bookAuthorName;
    }

    public String getISBN(){
        return null;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

}
