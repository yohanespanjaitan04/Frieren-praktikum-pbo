// Yohanes Panjaitan
// 24060122140108

import java.sql.*;



public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        // save person to MySQL database
        String name = person.getName();
        // ...
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "goldenzero", "Password");
        // Query
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}
