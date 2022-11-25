package com.toroparking.proyectosolid.Modelo;

import com.toroparking.proyectosolid.Modelo.Configuracion.ConfiguracionGeneral;
import com.toroparking.proyectosolid.Modelo.Configuracion.IGuardadoConfiguracion;
import com.toroparking.proyectosolid.Modelo.Servicios.Operaciones.OperacionGeneral;
import com.toroparking.proyectosolid.Modelo.Servicios.Servicio;
import lombok.Data;

import java.util.ArrayList;

@Data
public class ToroParking {

    private static ToroParking singleton;
    private ArrayList<Servicio> serviciosEnCurso;
    private ArrayList<Servicio> serviciosFinalizados;
    private ConfiguracionGeneral configuracionGeneral;
    private OperacionGeneral operaciones;

    private ToroParking() {
        this.serviciosEnCurso = new ArrayList<>();
        this.serviciosFinalizados = new ArrayList<>();
        this.configuracionGeneral = IGuardadoConfiguracion.cargar();
        this.operaciones = new OperacionGeneral();
    }


    public static ToroParking getInstance () {
        if (singleton == null) {
            singleton = new ToroParking();
        }
        return singleton;
    }

}
