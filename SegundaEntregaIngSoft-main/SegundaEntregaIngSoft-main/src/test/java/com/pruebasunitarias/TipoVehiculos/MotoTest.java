package com.pruebasunitarias.TipoVehiculos;

import com.toroparking.proyectosolid.Modelo.TipoVehiculos.Moto;
import junit.framework.TestCase;
import org.junit.Test;

public class MotoTest extends TestCase {

    @Test
    public void esMoto () {
        Moto moto = new Moto();

        assertEquals("Moto", moto.tipoVehiculo());
    }

    @Test
    public void placaCorrecta () {
        Moto moto = new Moto();
        moto.setPlaca("JRT-123");

        assertEquals("JRT-123", moto.getPlaca());
    }
}