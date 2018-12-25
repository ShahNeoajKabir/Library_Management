import java.sql.*;
import javax.swing.JOptionPane;
public class Library {
    Connection conn;
    public static Connection connecrDb(){
        try{
           Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:G:\\4th semester\\java programming\\Library Management System\\Librarydata.sqlite");
            return conn;
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
           return null;
        }
    }
}
