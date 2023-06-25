package com.example.demo.domain.usecase;

import com.example.demo.domain.model.gateway.BuscarClienteByIdGateway;
import com.example.demo.infraestructura.adaptadores.modelos.Clientes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BuscarClienteByIdUseCase {

    @Autowired
    private BuscarClienteByIdGateway buscarClienteByIdGateway;

    public List<Clientes> buscarClientesById(String id) {
        log.info("Comenzo la busqueda del cliente con el id 0}", id);
        return buscarClienteByIdGateway.buscarById(id);
    }

    public Clientes buscarClientesByIdView(int id) {
        log.info("Comenzo la busqueda del cliente con el id 0}", id);
        return buscarClienteByIdGateway.buscarByIdView(id);
    }
}
