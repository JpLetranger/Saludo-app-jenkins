package com.ejemplo.saludo;

public class App {
    public static String generarSaludo(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return "¡Hola, Mundo!";
        }
        return "¡Hola, " + nombre.trim() + "!";
    }
    
    public static void main(String[] args) {
        String nombre = args.length > 0 ? args[0] : "Jenkins";
        System.out.println(generarSaludo(nombre));
        System.out.println("✅ Aplicación ejecutada exitosamente");
    }
}