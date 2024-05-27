
import java.sql.*;
        
        
public class DBConnection {
    static final String DB_URL ="jdbc:mysql://localhost:3307/employeesystem";
    static final String USER ="root";
    static final String PASS ="";
    
    public static Connection connectDB(){
            Connection conn =null ;

    try{
   // Class.forName("com.mysql.jdbc.Driver");
    //open connection
    conn = DriverManager.getConnection(DB_URL,USER,PASS );
    return conn;
    }
    catch(Exception ex){
        System.out.println("There were errors while Connecting to DB");
        return null;
    }
    }
}
