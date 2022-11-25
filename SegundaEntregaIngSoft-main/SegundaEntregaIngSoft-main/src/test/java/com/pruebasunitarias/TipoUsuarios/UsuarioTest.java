package com.pruebasunitarias.TipoUsuarios;

import com.toroparking.proyectosolid.Modelo.TipoUsuarios.Usuario;
import junit.framework.TestCase;
import org.junit.Test;

public class UsuarioTest extends TestCase {

    @Test
    public void usuarioCorrecto () {
        Usuario usuario = new Usuario("Andres", "1000228019", "AndresD2314", "Roma23");
        Usuario usuario1 = new Usuario("Andres", "1000228019", "AndresD2314", "Roma23");

        assertSame(usuario1,usuario);
    }
}