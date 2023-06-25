package com.example.demo.domain.usecase;

import com.example.demo.domain.model.entities.ClientesModel;
import com.example.demo.domain.model.exceptions.ClienteException;
import com.example.demo.domain.model.gateway.ListarClienteGateway;
import com.example.demo.domain.model.utils.ObjectUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ListarClienteUseCase {


    private final ListarClienteGateway listarClienteGateway;

    public ListarClienteUseCase(ListarClienteGateway listarClienteGateway) {
        this.listarClienteGateway = listarClienteGateway;
    }

    public List<ClientesModel> getListaClientes() {

        log.info("Entro al metodo listar clientes");

        if (ObjectUtils.isNullOrEmpty(listarClienteGateway))
            throw ClienteException.Type.GATEWAY_NO_INSTANCIADO.build();

        log.info("Finalizo listar clientes");
        return listarClienteGateway.listarClientes();
    }
}
