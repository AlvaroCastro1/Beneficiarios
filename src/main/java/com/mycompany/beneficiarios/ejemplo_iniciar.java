package com.mycompany.beneficiarios;

public class ejemplo_iniciar {
    public static void main(String[] args) {
        // Datos de inicio de sesión
        String nombreUsuario = "nuevo_usuario";
        String contrasena = "contrasena_nuevo_usuario2";

        // Intentar iniciar sesión
        boolean inicioSesionExitoso = Usuario.iniciarSesion(nombreUsuario, contrasena);

        if (inicioSesionExitoso) {
            System.out.println("Inicio de sesión exitoso para el usuario: " + nombreUsuario);
        } else {
            System.out.println("Inicio de sesión fallido para el usuario: " + nombreUsuario);
        }
    }
}