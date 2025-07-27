package com.nikhil;

import com.nikhil.dao.StudentDAO;
import com.nikhil.model.Student;


public class Main {
    public static void main(String[] args){
        StudentDAO dao= new StudentDAO();

        // create
        Student s1 = new Student("nikhil" , "bhaijaan@gmail.com");
        dao.saveStudent(s1);

        // read
        Student fetched  = dao.getStudent(s1.getId());
        System.out.println("Fetched: " + fetched);

        // update
        fetched.setName("mansi");
        dao.updateStudent(fetched);

        // list All
        dao.getAllStudents().forEach(System.out::println);

        // delete
        dao.deleteStudent(fetched.getId());

    }
}
