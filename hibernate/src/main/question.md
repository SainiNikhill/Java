# Hibernate

### Here is the a step-by-step guide with complete code for implementing full hibernate CRUD  operation ( create , update , read  , delete) operations on a student database using java , this example covers  
1. Hibernate Configuration.
2. The student entity.
3. CRUD operations.
4. Utility for managing Hibernate sessions.
5. A main runner to demonstrate all operations.

# 1. Hibernate  Configuration (hibernate.cfg.xml)
Place this config in your src/main/resources directory . Update database credential as needed.
``` xml
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/student_db</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">your_password</property>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
        <property name="show_sql">true</property>
        <property name="hbm2ddl.auto">update</property>
        <mapping class="com.example.model.Student"/>
    </session-factory>
</hibernate-configuration>
```
Note: Set hbm2ddl.auto to update for auto table creation, or to create to regenerate the schema each run.

# 2. The Student Entity(Student.java)

```java
package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    // Constructors, getters, setters

    public Student() {}

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters...
}

```
# 3. Hibernate Utility
```java
package com.example.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}

 ```
# 4. Student DAO(CRUD logic)

```java
package com.example.dao;

import com.example.model.Student;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class StudentDao {

    // CREATE
    public void saveStudent(Student student) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(student);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    // READ ALL
    public List<Student> getStudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student", Student.class).list();
        }
    }

    // UPDATE
    public void updateStudent(Student student) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.update(student);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStudent(int studentId) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            Student student = session.get(Student.class, studentId);
            if (student != null) {
                session.delete(student);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
```

# 5. Main file

```java
package com.example;

import com.example.dao.StudentDao;
import com.example.model.Student;
import com.example.util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();

        // CREATE
        Student s1 = new Student("John Doe", "john@gmail.com");
        dao.saveStudent(s1);

        // READ
        List<Student> studentList = dao.getStudents();
        System.out.println("Students:");
        studentList.forEach(s -> System.out.println(s.getId() + ": " + s.getName() + " - " + s.getEmail()));

        // UPDATE
        Student toUpdate = studentList.get(0);
        toUpdate.setEmail("john.doe@email.com");
        dao.updateStudent(toUpdate);

        // DELETE
        dao.deleteStudent(toUpdate.getId());

        // Final read to show changes
        dao.getStudents().forEach(s -> System.out.println(s.getId() + ": " + s.getName() + " - " + s.getEmail()));

        HibernateUtil.shutdown();
    }
}
```