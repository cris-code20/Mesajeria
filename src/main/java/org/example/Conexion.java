package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_pp",
                                                     "root",
                                                     "Metano04");

        }catch(SQLException e){
            System.out.println(e);
        }

        return connection;
    }

}
