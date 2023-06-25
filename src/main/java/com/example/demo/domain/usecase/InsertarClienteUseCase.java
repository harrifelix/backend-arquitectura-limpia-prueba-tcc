package com.example.demo.domain.usecase;

import com.example.demo.domain.model.entities.ClientesModel;
import com.example.demo.domain.model.exceptions.ClienteException;
import com.example.demo.domain.model.gateway.InsertarClienteGateway;
import com.example.demo.domain.model.utils.ObjectUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InsertarClienteUseCase {

    @Autowired
    private InsertarClienteGateway insertarClienteGateway;

    public ClientesModel insertarCliente(ClientesModel clientesModel) {
        log.info("Comenzo la inserccion del cliente {o}", clientesModel);

        if (ObjectUtils.isNullOrEmpty(clientesModel))
            throw ClienteException.Type.CLIENTE_NO_ENVIADO.build();

        validarCamposCliente(clientesModel);

        insertarClienteGateway.insertarCliente(clientesModel);
        log.info("Inserccion exitosa {0}", clientesModel.getNombre());
        return clientesModel;
    }

    private void validarCamposCliente(ClientesModel clientesModel) {
        if (ObjectUtils.isNullOrEmpty(clientesModel)
                || ObjectUtils.isNullOrEmpty(clientesModel.getNombre())
                || ObjectUtils.isNullOrEmpty(clientesModel.getNumero_identificacion())
                || ObjectUtils.isNullOrEmpty(clientesModel.getTipo_identificacion())

        )
            throw ClienteException.Type.CAMPOS_IMCOMPLETOS_VALIDAR.build();
    }
}
