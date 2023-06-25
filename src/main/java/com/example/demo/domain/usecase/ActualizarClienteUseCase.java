package com.example.demo.domain.usecase;

import com.example.demo.domain.model.entities.ClientesModel;
import com.example.demo.domain.model.exceptions.ClienteException;
import com.example.demo.domain.model.gateway.ActualizarClienteGateway;
import com.example.demo.domain.model.utils.ObjectUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ActualizarClienteUseCase {

    @Autowired
    private ActualizarClienteGateway actualizarClienteGateway;

    public ClientesModel actualizarCliente(int id, ClientesModel clientesModel) {

        log.info("Comenzo la actualizacion del cliente {0}", clientesModel);
        validarDatosActualizacion(clientesModel);
        log.info("Finalizo actualizacion {0}", clientesModel);
        return actualizarClienteGateway.actualizarClientes(id, clientesModel);
    }

    private void validarDatosActualizacion(ClientesModel clientesModel) {
        if (ObjectUtils.isNullOrEmpty(clientesModel)
                || ObjectUtils.isNullOrEmpty(clientesModel.getGenero())
                || ObjectUtils.isNullOrEmpty(clientesModel.getNombre())
                || ObjectUtils.isNullOrEmpty(clientesModel.getNumero_identificacion())
                || ObjectUtils.isNullOrEmpty(clientesModel.getTipo_identificacion())

        )
            throw ClienteException.Type.CAMPOS_IMCOMPLETOS_VALIDAR.build();
    }
}
