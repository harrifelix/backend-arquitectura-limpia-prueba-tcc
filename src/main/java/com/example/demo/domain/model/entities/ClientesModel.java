package com.example.demo.domain.model.entities;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;


@Value
@Builder
@Data
public class ClientesModel implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

   private int id;

    private String numero_identificacion;


    private String genero;

    private String nombre;

    private String tipo_identificacion;
}

