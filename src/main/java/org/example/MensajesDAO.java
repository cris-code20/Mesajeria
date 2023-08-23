package org.example;

import com.mysql.cj.xdevapi.Result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensajes){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()) {

            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO mensajes ( mensaje, autor_mensaje) VALUES (?,?);";
                ps=conexion.prepareStatement(query);
                ps.setString(1,mensajes.getMensaje());
                ps.setString(2,mensajes.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("mensaje creado correctamente");

            }catch (SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public  static void  leerMensajesDB(){
        Conexion db_connection = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

         try (Connection conexion = db_connection.get_connection()){

                 String query = "SELECT * FROM mensajes";
                 ps=conexion.prepareStatement(query);
                 rs=ps.executeQuery();

                 while (rs.next()){
                     System.out.println("ID: " + rs.getInt("id_mesaje"));
                     System.out.println("MENASAJE: " +rs.getString("mensaje"));
                     System.out.println("AUTHOR: " +rs.getString("autor_mensaje"));
                     System.out.println("DATE: " +rs.getString("fecha_mensaje"));
                     System.out.println("");
                 }

         }catch (SQLException e){
             System.out.println("error al listar mensaje");
             System.out.println(e);
         }
    }

    public static void borrarMensajesDB(int id_mensaje){

    }

    public static void actualizarMensajesDB(Mensajes mensajes){

    }
}
