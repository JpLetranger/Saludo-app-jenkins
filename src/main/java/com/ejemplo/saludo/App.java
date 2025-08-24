package com.ejemplo.saludo;

public class App {
    public static String saludoCompleto(String nombre) {
    return generarSaludo(nombre) + " Bienvenido a Jenkins!";
}
    
    public static void main(String[] args) {
        String nombre = args.length > 0 ? args[0] : "Jenkins";
        System.out.println(generarSaludo(nombre));
        System.out.println("✅ Aplicación ejecutada exitosamente");
    }
}