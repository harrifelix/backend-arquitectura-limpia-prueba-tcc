package com.example.demo.infraestructura.adaptadores.converter;

import com.example.demo.domain.model.entities.ClientesModel;
import com.example.demo.domain.model.factories.ClienteFactory;
import com.example.demo.infraestructura.adaptadores.modelos.Clientes;

import java.util.ArrayList;
import java.util.List;

public final class ClientesConvertEntity {

    private ClientesConvertEntity() {
    }

    public static Clientes convertToClientes(ClientesModel clientesModel) {
        Clientes clientes = new Clientes();

        clientes.setTipo_identificacion(clientesModel.getTipo_identificacion());
        clientes.setNombre(clientesModel.getNombre());
        clientes.setNumero_identificacion(clientesModel.getNumero_identificacion());
        clientes.setGenero(clientesModel.getGenero());


        return clientes;
    }

    public static List<ClientesModel> getListConverter(List<Clientes> clientes) {
        List<ClientesModel> clientesModelViewModels = new ArrayList<>();

        if (clientes.stream().count() >= 1) {
            for (Clientes clientesDtoModel : clientes) {
                ClientesModel model = ClienteFactory.create_cliiente(

                        clientesDtoModel.getGenero(),
                        clientesDtoModel.getNombre(),
                        clientesDtoModel.getNumero_identificacion(),
                        clientesDtoModel.getTipo_identificacion(),
                        clientesDtoModel.getId());
                clientesModelViewModels.add(model);
            }
            return clientesModelViewModels;
        }
        return null;
    }

}
