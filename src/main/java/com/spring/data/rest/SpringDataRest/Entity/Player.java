package com.spring.data.rest.SpringDataRest.Entity;


import javax.persistence.*;
import java.util.Date;
@Entity

public class Player {

    @Id
    // @GeneratedValue
    @Column(name = "Id")
    private int Id;//auto generated id value on new row inserted

    @Column(name = "Name")
    private String Name;

    @Column(name = "Age")
    private int Age;

    @Column(name = "Nationality")
    private String Nationality ;


    @Column(name = "DOB")
    private Date DOB ;

    @Column(name = "Designation")
    private int Designation ;

    public Player() {
    }

    public Player(int id, String name, int age, String nationality, Date DOB, int designation) {
        Id = id;
        Name = name;
        Age = age;
        Nationality = nationality;
        this.DOB = DOB;
        Designation = designation;
    }
    public Player( String name, int age, String nationality, Date DOB, int designation) {

        Name = name;
        Age = age;
        Nationality = nationality;
        this.DOB = DOB;
        Designation = designation;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getNationality() {
        return Nationality;
    }

    public Date getDOB() {
        return DOB;
    }

    public int getDesignation() {
        return Designation;
    }

    //convert it to json so that client understands it
    @Override
    public String toString() {
        return "Player{" +
                "ID=" + Id +
                ", name='" + Name + '\'' +
                ", age=" + Age +
                ", nationality='" + Nationality + '\'' +
                ", dob=" + DOB +
                ", designation=" + Designation +
                '}';
    }
    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setDesignation(int designation) {
        Designation = designation;
    }
}
