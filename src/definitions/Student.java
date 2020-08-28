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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNo() {
        return universityRollNo;
    }

    public void setUniversityRollNo() {
        this.universityRollNo = universityRollNo;
    }

}
