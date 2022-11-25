package com.pruebasunitarias.TipoVehiculos;

import com.toroparking.proyectosolid.Modelo.TipoVehiculos.Carro;
import junit.framework.TestCase;
import org.junit.Test;

public class CarroTest extends TestCase {

    @Test
    public void esCarro () {
        Carro carro = new Carro();

        assertEquals("Carro", carro.tipoVehiculo());
    }

    @Test
    public void palcaCorrecta () {
        Carro carro = new Carro ();
        carro.setPlaca("HBK-123");

        assertEquals("HBK-123", carro.getPlaca());
    }
}