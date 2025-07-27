# Hibernate
## 1. Introduction to Hibernate
Hibernate is a powerful, open-source Java ORM (Object-Relational Mapping) framework. It simplifies database operations by mapping Java classes to database tables, letting developers perform CRUD operations without hand-coding SQL.

### Main Features
- ORM Support: Maps Java objects to database tables

- Database Independence: Swap databases with minimal code changes

- Caching: First-level and second-level cache support

- Query Options: HQL, Criteria API, native SQL

- Automatic Table Generation: Generates and updates tables from entity classes

### Hibernate CRUD Example: Student Database
1. hibernate.cfg.xml Example
   ```xml
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
2. Student Entity (Student.java)
   ```java
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

   // Constructors, getters, and setters
   }
   ```
3. Hibernate Utility (HibernateUtil.java)
   ```java
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
   public static void shutdown() { getSessionFactory().close(); }
   }
   ```
4. Student DAO
   ```java
   public class StudentDao {
   public void saveStudent(Student student) { ... }
   public List<Student> getStudents() { ... }
   public void updateStudent(Student student) { ... }
   public void deleteStudent(int studentId) { ... }
   }```
5. Main Runner
   ```java
   public class Main {
   public static void main(String[] args) {
   StudentDao dao = new StudentDao();
   dao.saveStudent(new Student("John Doe", "john@gmail.com"));
   List<Student> list = dao.getStudents();
   // update, delete, and print logic
   HibernateUtil.shutdown();
   }
   }
   ```
   
# Hibernate Top Interview Questions (with Short Answers)
1. What is Hibernate?
   Hibernate is an ORM tool for Java that maps Java classes to database tables and automates CRUD operations without writing explicit SQL.

2. What is the difference between Session and SessionFactory?
   - SessionFactory: Heavyweight, thread-safe object created once per application; provides Session objects.

   - Session: Lightweight, single-threaded object to perform CRUD operations and persists for a database transaction.

3. Explain Hibernate caching levels.
   - First-level cache: Default, session-scoped.

    - Second-level cache: SessionFactory-scoped, shared among sessions (EHCache, OSCache, etc.).

4. What is HQL? How is it different from SQL?
   - HQL (Hibernate Query Language) is object-oriented and queries Java objects/entities, not DB tables directly. It’s DB-independent, unlike SQL.

5. How do you configure Hibernate in Java?
    -  Via hibernate.cfg.xml, properties files, or Java code-based configuration. Typical config includes database connection info, entity mappings, and dialect.

6. What are advantages of Hibernate over JDBC?
     - Simplifies CRUD with no manual SQL

    - Auto object-relational mapping

     - Caching & performance improvements

    - Transactional support

7. What is the purpose of @Entity, @Table, and @Id annotations?
   -  @Entity: Declares Java class as a mapped entity.

    - @Table: Specifies the DB table name.

    - @Id: Identifies the primary key field.

8. What are Hibernate dialects?
      - Classes that convert HQL to the native SQL for a specific database (e.g., MySQLDialect, OracleDialect).

9. What strategies does Hibernate provide for primary key generation?
      - AUTO, IDENTITY, SEQUENCE, TABLE

10. What are common causes of LazyInitializationException?
       - When a lazy-loaded association is accessed outside an open Hibernate Session context.
