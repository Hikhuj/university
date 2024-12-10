/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea4;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Student {
    
    // Atributes
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private char gender;
    private int grade;
    private String universityCourseName;

    @Override
    public String toString() {
        return "Estudiante:{" + "id= " + id + ", firstName= " + firstName + ", middleName= " + middleName + ", lastName= " + lastName + ", age= " + age + ", gender= " + gender + ", grade= " + grade + ", universityCourseName= " + universityCourseName + '}';
    }
    
    public Student(int id, String firstName, String middleName, String lastName, int age, char gender, int grade, String universityCourseName) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.universityCourseName = universityCourseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getUniversityCourseName() {
        return universityCourseName;
    }

    public void setUniversityCourseName(String universityCourseName) {
        this.universityCourseName = universityCourseName;
    }
}
