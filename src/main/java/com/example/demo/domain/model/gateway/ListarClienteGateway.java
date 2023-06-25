package com.example.demo.domain.model.gateway;

import com.example.demo.domain.model.entities.ClientesModel;

import java.util.List;

public interface ListarClienteGateway {
    List<ClientesModel> listarClientes();
}
