/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;
import java.sql.*;
/**
 *
 * @author wachid op
 */
public class DBKoneksi {
    String DBurl = "jdbc:mysql://localhost/movie_db";
    String DBusername = "root";
    String DBpassword = "";
    public Connection koneksi;
    public Statement statement;
    
    public DBKoneksi(){  
        try{  
           Class.forName("com.mysql.cj.jdbc.Driver");
           koneksi = (Connection) DriverManager.getConnection(DBurl, DBusername, DBpassword);
        }catch(Exception e){
            System.out.println(e);
        }  
    }
}
