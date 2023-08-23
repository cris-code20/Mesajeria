package org.example;

import java.util.Scanner;

public class MensajesService {

    public static void crearUnMensaje(){
        Scanner sc = new Scanner(System.in);

        System.out.println("escribe tu mensaje");
        String texto = sc.nextLine();
        System.out.println("tu nombre");
        String nombre = sc.nextLine();

        Mensajes mensajes = new Mensajes();
        mensajes.setMensaje(texto);
        mensajes.setAutor_mensaje(nombre);

        MensajesDAO.crearMensajeDB(mensajes);

    }

    public  static void  leerMensajes(){
        MensajesDAO.leerMensajesDB();
    }

    public static void borrarMensajes(){

    }

    public static void actualizarMensajes(){

    }

}
