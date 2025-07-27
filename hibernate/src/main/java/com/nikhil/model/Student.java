package com.nikhil.model;


// This is and entity class that java maps to the database;
// defines what student table look alike, Annotations @Entity , @Table , @Id etc to tell hibernate how to create table.

import jakarta.persistence.*;

/*
@Entity              // Tells Hibernate this is an entity
@Table(name = "students")  // Table name in DB
@Id                 // Primary key
@GeneratedValue     // Auto-increment ID
@Column(name = "name") // Column name in DB
*/
@Entity
@Table(name= "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    public Student(){

    }
    public Student(String name , String email){
        this.name= name;
        this.email=email;

    }
    // getters  and setters
    public  int getId (){
        return id;

    }
    public void setId(int id){
        this.id = id;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "Student id :" + id + ", Name is: "+ name + "& email is: " + email + '\'';
    }

}
