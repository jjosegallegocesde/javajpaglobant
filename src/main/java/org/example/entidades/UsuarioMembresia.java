package org.example.entidades;

import org.example.entidades.interfaces.IAnalitica;
import org.example.entidades.interfaces.IReporte;

public class UsuarioMembresia extends Usuario implements IReporte, IAnalitica {

    @Override
    public void generarReporte(String datos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }

    @Override
    public void editarReporte(Integer id, String datos) {

    }

    @Override
    public void limpiarDatos(Object datos) {

    }

    @Override
    public void calcularDispersion(Object datos) {

    }
}
