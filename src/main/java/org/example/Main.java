package org.example;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;


        do {
            System.out.println("------home-------");
            System.out.println("Aplicacion de mensaje");
            System.out.println("1. crear mensaje");
            System.out.println("2. actualizar mensaje");
            System.out.println("3. listar mensaje");
            System.out.println("4. borrar mensaje");
            System.out.println("5. salir");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    MensajesService.crearUnMensaje();
                    break;
                case 2:
                    MensajesService.actualizarMensajes();
                    break;
                case 3:
                    MensajesService.leerMensajes();
                case 4:
                    MensajesService.borrarMensajes();
                default:
                    break;
            }

        }while (opcion != 5);


    }
}