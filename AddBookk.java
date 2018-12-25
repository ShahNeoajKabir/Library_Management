import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import javax.swing.JOptionPane;
public class AddBookk {
    Connection con;
    public static Connection connecrDb(){
        try{
           Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:G:\\4th semester\\java programming\\Library Management System\\Librarydata.sqlite");
            return con;
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
           return null;
        }
    }
    
}
