package JDBC;
import java.sql.*;
import java.util.Scanner;



public class PostgresStudentCRUD {

    // PostgreSQL DB Config
    static final String URL = "jdbc:postgresql://localhost:5432/school";
    static final String USER = "postgres";
    static final String PASSWORD = "yourpassword"; // Replace with your actual password

    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                Scanner sc = new Scanner(System.in)
        ) {
            // Create table if not exists
            createTableIfNotExists(conn);

            while (true) {
                System.out.println("\n--- STUDENT CRUD MENU ---");
                System.out.println("1. Insert student");
                System.out.println("2. Display all students");
                System.out.println("3. Update student branch");
                System.out.println("4. Delete student");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1 -> insertStudent(conn, sc);
                    case 2 -> displayStudents(conn);
                    case 3 -> updateStudent(conn, sc);
                    case 4 -> deleteStudent(conn, sc);
                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }

        } catch (SQLException e) {
            System.out.println("Database Error:");
            e.printStackTrace();
        }
    }

    // Create 'students' table if it doesn't exist
    static void createTableIfNotExists(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS students (" +
                "id SERIAL PRIMARY KEY, " +
                "name VARCHAR(100), " +
                "branch VARCHAR(100))";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Table 'students' is ready.");
        }
    }

    // INSERT student
    static void insertStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.println("Enter the id");
        int id  = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter branch: ");
        String branch = sc.nextLine();

        String sql = "INSERT INTO students (id, name, branch) VALUES (?,?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1,id);
            stmt.setString(2, name);
            stmt.setString(3, branch);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " student(s) inserted.");
        }
    }

    // SELECT all students
    static void displayStudents(Connection conn) throws SQLException {
        String sql = "SELECT * FROM students";
        try (
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ) {
            System.out.println("\nID | NAME | BRANCH");
            System.out.println("----------------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String branch = rs.getString("branch");
                System.out.println(id + " | " + name + " | " + branch);
            }
        }
    }

    // UPDATE student's branch
    static void updateStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear newline
        System.out.print("Enter new branch: ");
        String newBranch = sc.nextLine();

        String sql = "UPDATE students SET branch = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newBranch);
            stmt.setInt(2, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student updated.");
            } else {
                System.out.println("Student not found.");
            }
        }
    }

    // DELETE student
    static void deleteStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted.");
            } else {
                System.out.println("Student not found.");
            }
        }
    }
}
