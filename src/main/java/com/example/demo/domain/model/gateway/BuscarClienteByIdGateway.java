package com.example.demo.domain.model.gateway;

import com.example.demo.domain.model.entities.ClientesModel;
import com.example.demo.infraestructura.adaptadores.modelos.Clientes;

import java.util.List;

public interface BuscarClienteByIdGateway {

     List<Clientes> buscarById(String doc);

     Clientes buscarByIdView(int doc) ;
}
