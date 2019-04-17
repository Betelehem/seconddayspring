package edu.mum.seconddayspring.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student {
    @Id
    @Column(name="student_id")
    @NotEmpty(message = "Student Id can not be empty")
    String studentId;

    String name;

    @Column(name="last_name")
    String lastName;

    Integer age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    Address address;
    @OneToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name = "gender_id")
    Gender gender;


    public Student(){

    }

    public Student(String studentId, String name, String lastName, Integer age, Address address, Gender gender) {
        this.studentId = studentId;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
