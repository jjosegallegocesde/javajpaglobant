package org.example.controladores;

import org.example.entidades.UsuarioMembresia;
import org.example.servicios.ServicioAfiliado;

public class ControladorAfiliado {

    //llamar a la clase que valida
    UsuarioMembresia usuarioMembresia = new UsuarioMembresia();
    //llamar al servicio
    ServicioAfiliado servicioAfiliado = new ServicioAfiliado();

    public void registrarAfiliado(String nombre, String documento, String correo, Integer ubicacion){

        //utilizare los SET del usuario menbresia par avalidar los datos
        this.usuarioMembresia.setNombres(nombre);
        this.usuarioMembresia.setDocumento(documento);
        this.usuarioMembresia.setCorreoElectronico(correo);
        this.usuarioMembresia.setUbicacion(ubicacion);

        //SI TODOS los datos del usuario se cargaron con set y no hubo errores
        //llamo al servicio para guardar los datos
        this.servicioAfiliado.registrarAfiliado(usuarioMembresia);

    }


}
