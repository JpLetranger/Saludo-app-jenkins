package com.ejemplo.saludo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testSaludoConNombre() {
        assertEquals("¡Hola, DevOps!", App.generarSaludo("DevOps"));
    }
    
    @Test
    public void testSaludoSinNombre() {
        assertEquals("¡Hola, Mundo!", App.generarSaludo(""));
    }
    
    @Test
    public void testSaludoConNull() {
        assertEquals("¡Hola, Mundo!", App.generarSaludo(null));
    }
    
    @Test
    public void testSaludoConEspacios() {
        assertEquals("¡Hola, Jenkins!", App.generarSaludo("  Jenkins  "));
    }
}