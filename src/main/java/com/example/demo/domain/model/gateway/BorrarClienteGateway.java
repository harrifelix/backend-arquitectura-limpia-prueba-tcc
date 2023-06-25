package com.example.demo.domain.model.gateway;

import com.example.demo.domain.model.entities.ClientesModel;
import com.example.demo.infraestructura.adaptadores.modelos.Clientes;

public interface BorrarClienteGateway {
    void eliminarCliente(int id, ClientesModel clientesModel);
}
