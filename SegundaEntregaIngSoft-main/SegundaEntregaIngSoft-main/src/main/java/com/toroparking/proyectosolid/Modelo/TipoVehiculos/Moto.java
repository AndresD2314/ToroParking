package com.toroparking.proyectosolid.Modelo.TipoVehiculos;

import com.toroparking.proyectosolid.Modelo.TipoUsuarios.Administraor;

import java.io.Serializable;

public class Moto extends Vehiculo implements Serializable {

    public Moto() {
        super();
    }

    public Moto(Administraor propietario, String placa) {
        super(propietario, placa);
    }

    @Override
    public String tipoVehiculo() {
        return "Moto";
    }
}
