import lombok.*;
/*
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
// @RequiredArgsConstructor
 */

// @DATA takes care of all annotations above
@Data
@AllArgsConstructor
public class Student_Lambda_introduction {
    private int studentId;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    // everything below can be done by Lombok annotation on top of class, implemented on top of class
 /*
    public Student(){}

    public Student(int studentId, String firstName, String lastName, String userName, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && firstName.equals(student.firstName) && lastName.equals(student.lastName) && userName.equals(student.userName) && email.equals(student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, firstName, lastName, userName, email);
    }

  */

}
