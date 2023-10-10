package org.example.modelosdatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ModeloUsuarioAfiliado extends ModeloUsuario {

    @Column(name="valor_mensual")
    private Double mensualidad;

    @Column(name="cedula_invitado")
    private Integer cedulaInvitado;

    public ModeloUsuarioAfiliado() {
    }

    public ModeloUsuarioAfiliado(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico, Double mensualidad, Integer cedulaInvitado) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.mensualidad = mensualidad;
        this.cedulaInvitado = cedulaInvitado;
    }

    public Double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(Double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public Integer getCedulaInvitado() {
        return cedulaInvitado;
    }

    public void setCedulaInvitado(Integer cedulaInvitado) {
        this.cedulaInvitado = cedulaInvitado;
    }
}
