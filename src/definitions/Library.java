/*  Created by IntelliJ IDEA.
 *  User: Mansi katiyar
 *  Date: 29/08/20
 *  Time: 8:00 AM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] available;

    public Library() {
        this.available = new Book[10];
        for (int i = 0; i < available.length; i++) {
            available[i] = new Book();
        }
    }

    public Library(Book[] available) {
        this.available = available;
    }

    public Book[] getAvailable() {
        return available.clone();
    }

    public void setAvailable(Book[] available) {
        this.available = available;
    }

    public String toString() {
        return Arrays.toString(available);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getAvailable(), library.getAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailable());
    }
}
