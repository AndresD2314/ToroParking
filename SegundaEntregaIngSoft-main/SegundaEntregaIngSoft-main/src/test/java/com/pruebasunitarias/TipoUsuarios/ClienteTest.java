package com.pruebasunitarias.TipoUsuarios;

import com.toroparking.proyectosolid.Modelo.TipoUsuarios.Administraor;
import junit.framework.TestCase;
import org.junit.Test;

public class ClienteTest extends TestCase {

    @Test
    public void clienteCorrecto () {
        Administraor cliente = new Administraor("Andres", "1000228019", "AndresD2314", "Blackops2002", true);
        Administraor cliente1 = new Administraor("Andres", "1000228019", "AndresD2314", "Blackops2002", true);

        assertSame(cliente1,cliente);
    }

    @Test
    public void nombreCorrecto () {
        Administraor cliente = new Administraor();
        cliente.setNombre("Andres");

        assertEquals("Andres", cliente.getNombre());
    }

    @Test
    public void idCorrecto () {
        Administraor cliente = new Administraor();
        cliente.setID("1000228019");

        assertEquals("1000228019", cliente.getId());
    }

    @Test
    public void passwordCorrecto () {
        Administraor cliente = new Administraor();
        cliente.setPassword("Roma23");

        assertEquals("Roma23", cliente.getPassword());
    }

    @Test
    public void usuarioCorrecto () {
        Administraor cliente = new Administraor();
        cliente.setUsuario("AndresD2314");

        assertEquals("AndresD2314", cliente.getUsuario());
    }


}