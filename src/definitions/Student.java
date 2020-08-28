/*  Created by IntelliJ IDEA.
 *  User: Mansi katiyar
 *  Date: 28/08/20
 *  Time: 8:48 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String studentName;
    private long universityRollNo;
    private int numberOfBooksIssued;
    private Book[] issued;

    public Student(String studentName, long universityRollNo, int numberOfBooksIssued, Book[] issued) {
        this.studentName = studentName;
        this.universityRollNo = universityRollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.issued = new Book[5];
    }

    public Student() {
        studentName = "Sam";
        universityRollNo = 1234567;
        numberOfBooksIssued = 5;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNo() {
        return universityRollNo;
    }

    public void setUniversityRollNo(long universityRollNo) {
        this.universityRollNo = universityRollNo;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getIssued() {
        return issued.clone();
    }

    public void setIssued(Book[] issued) {
        this.issued = issued;
    }
}
