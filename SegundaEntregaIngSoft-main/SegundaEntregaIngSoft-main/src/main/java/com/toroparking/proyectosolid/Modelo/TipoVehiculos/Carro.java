package com.toroparking.proyectosolid.Modelo.TipoVehiculos;

import com.toroparking.proyectosolid.Modelo.TipoUsuarios.Administraor;

import java.io.Serializable;

public class Carro extends Vehiculo implements Serializable {
    public Carro() {
        super();
    }

    @Override
    public String tipoVehiculo() {
        return "Carro";
    }

    public Carro(Administraor propietario, String placa) {
        super(propietario, placa);
    }

    public void mensaje () {
        System.out.println("Soy un carro.");
    }


}
