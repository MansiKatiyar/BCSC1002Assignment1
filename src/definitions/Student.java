/*  Created by IntelliJ IDEA.
 *  User: Mansi katiyar
 *  Date: 28/08/20
 *  Time: 8:48 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    public String toString() {
        return String.format("student name: %s, university roll no: %d, number of books issued: %d", "array of issued books: %s", getStudentName(), getUniversityRollNo(), getNumberOfBooksIssued(), Arrays.toString(issued));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNo() == student.getUniversityRollNo() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Objects.equals(getStudentName(), student.getStudentName()) &&
                Arrays.equals(getIssued(), student.getIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getUniversityRollNo(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getIssued());
        return result;
    }
}
