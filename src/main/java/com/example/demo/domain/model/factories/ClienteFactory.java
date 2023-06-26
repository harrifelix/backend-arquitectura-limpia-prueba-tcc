package com.example.demo.domain.model.factories;

import com.example.demo.domain.model.entities.ClientesModel;

public final class ClienteFactory {
    private ClienteFactory() {
    }

    public static ClientesModel create_cliiente(String numero_identificacion, String tipo_identificacion, String genero
            , String nombre, int id) {
        return ClientesModel
                .builder()
                .id(id)
                .numero_identificacion(numero_identificacion)
                .tipo_identificacion(tipo_identificacion)
                .genero(genero)
                .nombre(nombre)
                .build();
    }


}
