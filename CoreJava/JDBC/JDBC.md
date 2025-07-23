# JDBC (Java Database Connectivity)

## What is JDBC?
JDBC (Java Database Connectivity) is an API in Java that enables applications to interact with relational databases using SQL. It provides methods to query, update, and manage data in a database from Java code.

---

## 7 Steps to Set Up JDBC in Java

1. **Import JDBC package**
   ```java
   import java.sql.*;
2. Register JDBC Driver

```java
Class.forName("org.postgresql.Driver");
```
3. Establish Connection

```java
Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school", "username", "password");
```
4. Create Statement / PreparedStatement

```java

Statement stmt = conn.createStatement();
// or
PreparedStatement pstmt = conn.prepareStatement("INSERT INTO students VALUES (?, ?, ?)");
```
5. Execute Query / Update

```java
Copy
Edit
ResultSet rs = stmt.executeQuery("SELECT * FROM students");
int rows = pstmt.executeUpdate();
```

6. Process Results

```java
while(rs.next()) {
System.out.println(rs.getInt("id") + " " + rs.getString("name"));
}
```

7. Close Connections

```java

rs.close();
stmt.close();
conn.close();
```
# JDBC Architecture
- DriverManager: Manages database drivers.

- Connection: Connects to the database.

- Statement: Executes SQL queries.

- ResultSet: Stores query result.

- SQLException: Handles database errors.
 
# JDBC Interfaces
1. Driver

2. Connection

3. Statement

4. PreparedStatement

5. CallableStatement

6. ResultSet

# 💬 Common JDBC Interview Questions
Q1. What are the types of JDBC Drivers?
Answer:

1. JDBC-ODBC Bridge Driver

2. Native-API Driver

3. Network Protocol Driver

4. Thin Driver (Type 4) - used in modern apps

Q2. What is the difference between Statement and PreparedStatement?

| Feature        | Statement                    | PreparedStatement            |
|----------------|------------------------------|------------------------------|
| SQL Type       | Static SQL                   | Parameterized SQL            |
| Security       | Prone to SQL Injection       | Safe from SQL Injection      |
| Performance    | Compiled each time           | Precompiled and cached       |
| Use Case       | Simple queries, repeated use | Dynamic queries with inputs  |

 
Q3. What is a ResultSet?
- Answer:
ResultSet is an object that holds the result of an SQL query. You can iterate through the rows using .next() and retrieve columns using getXXX() methods.

Q4. What are execute(), executeQuery(), and executeUpdate()?
- execute(): Returns boolean, used for any SQL.

- executeQuery(): Returns ResultSet, used for SELECT.

- executeUpdate(): Returns number of rows, used for INSERT, UPDATE, DELETE.

Q5. What is SQL Injection? How does JDBC prevent it?
- Answer:
SQL Injection is a hacking technique where malicious SQL is injected through input fields.
Using PreparedStatement prevents it because SQL and data are separated.

Q6. What are the advantages of using PreparedStatement?
- Avoids SQL injection

- Better performance due to pre-compilation

- Cleaner code with parameters

Q7. What is the role of DriverManager?
- Answer:
It manages and connects suitable JDBC drivers with the requested database URL.

Q8. What is Connection Pooling?
- Answer:
Connection Pooling is a technique to reuse database connections from a pool, reducing the overhead of establishing new connections.

Q9. How to call a stored procedure in JDBC?
```java
CallableStatement cs = conn.prepareCall("{call getStudent(?)}");
cs.setInt(1, 101);
cs.execute();
```
Q10. What are some best practices in JDBC?

- Always close ResultSet, Statement, and Connection.

- Use PreparedStatement over Statement.

- Use try-with-resources for auto-closing.

- Handle SQLException properly.

- Use connection pooling in production.

📝 Sample Code (Insert)
```java
String sql = "INSERT INTO students (id, name, branch) VALUES (?, ?, ?)";
try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
pstmt.setInt(1, 1);
pstmt.setString(2, "Nikhil");
pstmt.setString(3, "CSE");
pstmt.executeUpdate();
}
```
📚 References
Official JDBC Docs: https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/

PostgreSQL JDBC: https://jdbc.postgresql.org/