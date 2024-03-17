package com.mycompany.beneficiarios;

public class ejemplo_agregar {
    public static void main(String[] args) {
        // Datos del nuevo usuario
        String nombreUsuario = "nuevo_usuario";
        String correoUsuario = "nuevo_usuario@example.com";
        String contrasenaUsuario = "contrasena_nuevo_usuario";

        // Intentar agregar un nuevo usuario
        boolean usuarioAgregado = Usuario.agregarUsuario(nombreUsuario, correoUsuario, contrasenaUsuario);

        if (usuarioAgregado) {
            System.out.println("Usuario agregado exitosamente: " + nombreUsuario);
        } else {
            System.out.println("Error al agregar usuario: " + nombreUsuario);
        }
    }
}