package org.example;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Conexion con = new Conexion();
        try (Connection cnx = con.get_connection()){

        }catch (Exception e){
            System.out.println(e);
        }
    }
}