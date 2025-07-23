package JDBC;
import java.sql.*;

public class JDBC7STEPS {

    public static void main(String[] args) throws Exception {

        /*
        import package
        load and register driver
        create connection
        create statement
        execute statement
        process the results
        close connection

        * */
        String url = "jdbc:postgresql://localhost:5432/demo" ;
        String uname = "postgres";
        String pass = "yourpassword";


        // load and register the driver
        Class.forName("org.postgresql.Driver");

        // create connection
        Connection con = DriverManager.getConnection(url,uname,pass);

        // create statement;
        Statement st = con.createStatement();

        // Execute sql queries;
        ResultSet rs = st.executeQuery("Select * from student");

        // Process the result
        while(rs.next()){
            System.out.println("ID:" + rs.getInt("sid")+ ", Name: " +rs.getString("sname") + ", Marks: " + rs.getInt("marks") );
        }

        // close connections
        rs.close();
        st.close();
        con.close();


    }

}
