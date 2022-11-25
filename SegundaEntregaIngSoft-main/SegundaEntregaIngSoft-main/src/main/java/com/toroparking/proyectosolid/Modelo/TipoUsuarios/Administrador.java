package com.toroparking.proyectosolid.Modelo.TipoUsuarios;

import java.io.Serializable;

public class Administrador extends Usuario implements Serializable, Contenedor {
    
    public static final String atributos[] = {"Nombre", "ID", "Username", "Password"};
    
    @Override
    public Iterador getIterador()
    {
        return new IteradorAtributos();
    }
    
    
    private class IteradorAtributos implements Iterador
    {
        int indice;
        
        @Override
        public boolean tieneSiguiente()
        {
            if(indice < atributos.length)
            {
                return true;
            }
            return false;
        }
        
        @Override
        public Object siguiente()
        {
            if(this.tieneSiguiente())
            {
                return atributos[indice++];
            }
            return null;
        }
        
    }
    
    
    public Administrador() {
        super ();
    }

    public Administrador(String nombre, String id, String usuario, String password) {
        super(nombre, id, usuario, password);
    }

    public Administrador (String usuario, String password) {
        super (usuario, password);
        
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre +
                ", ID: " + id +
                ", Usuario: " + usuario +
                ", Password: " + password;
    }
}
