package org.example.modelosdatos;

import jakarta.persistence.*;

@Entity
public class ModeloUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;

    @Column(name="documento")
    private String documento;

    @Column(name = "ubicacion")
    private Integer ubicacion;

    @Column(name="correo")
    private String correoElectronico;

    public ModeloUsuario() {
    }

    public ModeloUsuario(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
