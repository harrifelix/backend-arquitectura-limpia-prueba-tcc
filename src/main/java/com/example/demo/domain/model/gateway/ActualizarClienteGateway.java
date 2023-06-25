package com.example.demo.domain.model.gateway;

import com.example.demo.domain.model.entities.ClientesModel;

public interface ActualizarClienteGateway {
    ClientesModel actualizarClientes(int id,ClientesModel clientesModel);
}
