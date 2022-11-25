package com.toroparking.proyectosolid.Modelo.TipoVehiculos;

import com.toroparking.proyectosolid.Modelo.TipoUsuarios.Administraor;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class Vehiculo implements IVehiculo, Serializable {
    protected Administraor propietario;
    protected String placa;

    public Vehiculo() {
        this.propietario = new Administraor();
        this.placa = "";
    }

    public Vehiculo(Administraor propietario, String placa) {
        this.propietario = propietario;
        this.placa = placa;
    }
    public abstract String tipoVehiculo ();
}
