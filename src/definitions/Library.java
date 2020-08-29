/*  Created by IntelliJ IDEA.
 *  User: Mansi katiyar
 *  Date: 29/08/20
 *  Time: 8:00 AM
 *  File Name : Library.java
 * */
package definitions;

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


}
