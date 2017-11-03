/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import com.microsoft.sqlserver.jdbc.SQLServerBlob;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author admin
 */
public class DBUtils implements Serializable{
    public static Connection makeConnection() 
            throws NamingException, SQLException{
        //context cau truc ghi tap ten va file cua e dieu hanh 
        
                Context context = new InitialContext();
                Context tomcatCtx = (Context) context.lookup("java:comp/env");
                DataSource ds = (DataSource) tomcatCtx.lookup("SE1171DS");
                Connection con = ds.getConnection();
             return con;
            }
//        
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        
//        
//                Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ex", "sa", "123qwe");
//        return con;
    }


