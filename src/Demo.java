import java.sql.*;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/d", "root", "");
        System.out.println("Connection Established successfully");
        Statement s=con.createStatement();
        s.execute("insert into details values('A',214567)");
        s.execute("insert into details values('B',123)");
        s.execute("insert into details values('D',1)");

       // s.executeUpdate("delete from details where name='A'");
        ResultSet rs=s.executeQuery("select * from details");
                while(rs.next())
                {
                    System.out.println(rs.getString(1)+" "+rs.getInt(2));

                }
PreparedStatement ps=con.prepareStatement("insert into details values(?,?)");
                ps.setString(1,"C");
                ps.setInt(2,8);
                ps.execute();
                //callable.
    }
}
//SQL Injections
//custom exceptions
//UPdation and deletion in java.
