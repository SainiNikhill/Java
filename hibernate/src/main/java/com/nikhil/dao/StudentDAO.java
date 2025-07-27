package com.nikhil.dao;

import java.util.List;

import com.nikhil.model.Student;
import com.nikhil.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAO {

    public void saveStudent(Student student) {
        Transaction tx = null;
        try (Session se = HibernateUtil.getSessionFactory().openSession()){
            tx= se.beginTransaction();
            se.persist(student);
            tx.commit();

        } catch (Exception e){
            if( tx!=null)tx.rollback();
            e.printStackTrace();
        }

    }
    public Student getStudent(int id){
        try(Session session  = HibernateUtil.getSessionFactory().openSession()){
            return session.byId(Student.class).load(id);

        }
    }

    public void updateStudent (Student student){
        Transaction tx =null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            session.merge(student);
            tx.commit();
        } catch(Exception e){
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }
    }
    public void deleteStudent(int id) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Student student = session.byId(Student.class).getReference(id);
            if (student != null) {
                tx = session.beginTransaction();
                session.remove(student);
                tx.commit();
            }
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
    public List<Student> getAllStudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student", Student.class).list();
        }
    }

}
