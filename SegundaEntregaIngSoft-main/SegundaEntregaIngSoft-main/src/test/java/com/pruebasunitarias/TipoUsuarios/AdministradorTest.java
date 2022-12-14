package com.pruebasunitarias.TipoUsuarios;

import com.toroparking.proyectosolid.Modelo.TipoUsuarios.Administrador;
import com.toroparking.proyectosolid.Modelo.TipoUsuarios.Administraor;
import junit.framework.TestCase;
import org.junit.Test;

public class AdministradorTest extends TestCase {

    @Test
    public void adminCorrecto () {
        Administrador administrador = new Administrador("Andres", "1000228019", "AndresD2314", "Blackops20023");
        Administrador administrador1= new Administrador("Andres", "1000228019", "AndresD2314", "Blackops20023");

        assertSame(administrador1,administrador);
    }

    @Test
    public void nombreCorrecto () {
        Administrador administrador = new Administrador();
        administrador.setNombre("Andres");

        assertEquals("Andres", administrador.getNombre());
    }

    @Test
    public void idCorrecto () {
        Administrador administrador = new Administrador();
        administrador.setID("1000228019");

        assertEquals("1000228019", administrador.getId());
    }

    @Test
    public void passwordCorrecto () {
        Administrador administrador = new Administrador();
        administrador.setPassword("Roma23");

        assertEquals("Roma23", administrador.getPassword());
    }

    @Test
    public void usuarioCorrecto () {
        Administrador administrador = new Administrador();
        administrador.setUsuario("AndresD2314");

        assertEquals("AndresD2314", administrador.getUsuario());
    }




}