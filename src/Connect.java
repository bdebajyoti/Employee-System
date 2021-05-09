import java.sql.*;
import javax.swing.*;
public class Connect {
Connection conn=null;
public static Connection ConnecrDB()
{
    String sql="com.mysql.jdbc.Driver";
    try
    {
        Class.forName(sql);
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","");
        //JOptionPane.showMessageDialog(null,"Database Connected");
        return conn;
    }catch(Exception ex)
    {
     //JOptionPane.showMessageDialog(null,ex);
     return null;
    }
}
}
