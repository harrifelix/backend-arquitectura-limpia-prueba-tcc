package com.example.demo.domain.usecase;

import com.example.demo.domain.model.entities.ClientesModel;
import com.example.demo.domain.model.gateway.BorrarClienteGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BorrarClienteUseCase {

    @Autowired
    private BorrarClienteGateway borrarClienteGateway;

    public void borrar(int id, ClientesModel clienteModel) {
        log.info("Comenzo la busqueda del cliente con el id 0}", id);
        borrarClienteGateway.eliminarCliente(id, clienteModel);
    }
}
