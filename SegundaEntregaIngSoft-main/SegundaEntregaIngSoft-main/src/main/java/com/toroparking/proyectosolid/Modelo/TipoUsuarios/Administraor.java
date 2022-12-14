package com.toroparking.proyectosolid.Modelo.TipoUsuarios;

import lombok.Data;

import java.io.Serializable;

@Data
public class Administraor extends Usuario implements IDescuentos, Serializable {
    private boolean miembro;

    public Administraor() {
        super ();
        this.miembro = false;
    }

    public Administraor(String nombre, String id, String usuario, String password, boolean miembro) {
        super(nombre, id, usuario, password);
        this.miembro = miembro;
    }

    public Administraor(String nombre, String id, String numero) {
        super(nombre, id, numero);
    }

    @Override
    public String toString()
    {
        if(miembro)
        {
            return "Nombre: " + nombre + " | C.C: " + id + " | Celular: " + numero + " | MIEMBRO";
        }
        return "Nombre: " + nombre + " | C.C: " + id + " | Celular: " + numero;
    }

    public String toStr2()
    {
        if(miembro)
        {
            return "Nombre: " + nombre + " | C.C: " + id + " | MIEMBRO";
        }
        return "Nombre: " + nombre + " | C.C: " + id;
    }
}
