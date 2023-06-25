package com.example.demo.infraestructura.adaptadores.repositorios;

import com.example.demo.domain.model.entities.ClientesModel;
import com.example.demo.domain.model.gateway.*;
import com.example.demo.infraestructura.adaptadores.converter.ClientesConvertEntity;
import com.example.demo.infraestructura.adaptadores.modelos.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteAdapterRepositorio implements ListarClienteGateway, InsertarClienteGateway, ActualizarClienteGateway, BuscarClienteByIdGateway, BorrarClienteGateway {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Override
    public List<ClientesModel> listarClientes() {
        return ClientesConvertEntity.getListConverter(clienteRepositorio.findAll());
    }

    @Override

    public ClientesModel insertarCliente(ClientesModel clientesModel) {

        Clientes clientes = ClientesConvertEntity.convertToClientes(clientesModel);
        clienteRepositorio.save(clientes);
        return clientesModel;
    }

    @Override
    public ClientesModel actualizarClientes(int id, ClientesModel clientesModel) {
        Clientes cliente = clienteRepositorio.buscarByIdView(id);
        cliente.setId(id);
        cliente.setNombre(clientesModel.getNombre());
        cliente.setNumero_identificacion(clientesModel.getNumero_identificacion());
        cliente.setTipo_identificacion(clientesModel.getTipo_identificacion());
        cliente.setGenero(clientesModel.getGenero());
        clienteRepositorio.save(cliente);
        return clientesModel;
    }

    @Override
    public List<Clientes> buscarById(String doc) {
        return clienteRepositorio.buscarById(doc);
    }

    @Override
    public Clientes buscarByIdView(int doc) {
        return clienteRepositorio.buscarByIdView(doc);
    }

    @Override
    public void eliminarCliente(int id, ClientesModel clientesModel) {

        Clientes clientes = clienteRepositorio.buscarByIdView(id);

        clienteRepositorio.delete(clientes);

    }
}
