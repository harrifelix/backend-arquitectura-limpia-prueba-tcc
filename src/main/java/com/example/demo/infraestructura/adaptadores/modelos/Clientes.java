package com.example.demo.infraestructura.adaptadores.modelos;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clientes", schema = "administracion_clientes")
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", unique = true, nullable = false, length = 50)
    private int id;

    @Column(name = "numero_identificacion", unique = true, nullable = false, length = 50)
    private String numero_identificacion;


    @Column(name = "genero", unique = true, nullable = false, length = 50)
    private String genero;

    @Column(name = "nombre", unique = true, nullable = false, length = 50)
    private String nombre;

    @Column(name = "tipo_identificacion", unique = true, nullable = false, length = 50)
    private String tipo_identificacion;

    public Clientes() {
    }

    /**
     *
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }
}

