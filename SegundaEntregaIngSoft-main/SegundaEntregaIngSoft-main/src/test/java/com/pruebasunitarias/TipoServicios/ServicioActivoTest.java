package com.pruebasunitarias.TipoServicios;

import com.toroparking.proyectosolid.Modelo.Servicios.ServicioFinalizado;
import com.toroparking.proyectosolid.Modelo.TipoVehiculos.Moto;
import com.toroparking.proyectosolid.Modelo.TipoVehiculos.Vehiculo;
import com.toroparking.proyectosolid.Modelo.ToroParking;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Calendar;

public class ServicioActivoTest extends TestCase {

    @Test
    public void toStringCorrectoMoto () {
        ServicioFinalizado servicioFinalizado = new ServicioFinalizado();
        Vehiculo vehiculo = new Moto();

        Calendar fechaP = Calendar.getInstance();
        fechaP = servicioFinalizado.getFechaInicial();

        assertEquals("Placa: HBK-123 - MOTOCICLETA - Ingreso: " +
                fechaP ,
                servicioFinalizado.toString());
    }

    @Test
    public void toStringCorrectoCarro () {
        ServicioFinalizado servicioFinalizado = new ServicioFinalizado();
        Vehiculo vehiculo = new Moto();

        Calendar fechaP = Calendar.getInstance();
        fechaP = servicioFinalizado.getFechaInicial();

        assertEquals("Placa: HBK-123 - AUTOMOVIL - Ingreso: " +
                        fechaP ,
                servicioFinalizado.toString());
    }
    }

}