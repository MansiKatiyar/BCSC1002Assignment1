/*  Created by IntelliJ IDEA.
 *  User: Mansi katiyar
 *  Date: 28/08/20
 *  Time: 7:30 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

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

    public String getISBN() {
        return null;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String toString() {
        return String.format("Book Name: %s, Book Author Name: %s, 13-digit ISBN: %s", getBookName(), getBookAuthorName(), getISBN());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getBookAuthorName(), book.getBookAuthorName()) &&
                Objects.equals(getISBN(), book.getISBN());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthorName(), getISBN());
    }
}
