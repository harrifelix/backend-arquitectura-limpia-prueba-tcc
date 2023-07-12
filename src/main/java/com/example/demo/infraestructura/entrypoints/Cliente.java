package com.example.demo.infraestructura.entrypoints;

import com.example.demo.domain.model.entities.ClientesModel;
import com.example.demo.domain.usecase.*;
import com.example.demo.infraestructura.adaptadores.modelos.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Cliente {

    @Autowired
    InsertarClienteUseCase insertarClienteUseCase;

    @Autowired
    BorrarClienteUseCase borrarUseCase;

    @Autowired
    ListarClienteUseCase listarClienteUseCase;

    @Autowired
    ActualizarClienteUseCase actualizarClienteUseCase;

    @Autowired
    BuscarClienteByIdUseCase buscarClienteByIdUseCase;

    @GetMapping("api/listar")
    public List<ClientesModel> listarClientes() {
        return listarClienteUseCase.getListaClientes();
    }

    @PostMapping("api/guardar")
    public ClientesModel guardarClientes(@RequestBody ClientesModel clientesModel) {
        return insertarClienteUseCase.insertarCliente(clientesModel);
    }

    @DeleteMapping("api/eliminar/{id}")
    public void elimia}
    nrClientes(@PathVariable(value = "id") int id) {
         borrarUseCase.borrar(id);
    }

    @PutMapping("api/actualizar/{id}")
    public ClientesModel actualizarCliente(@PathVariable(value = "id") int id, @RequestBody ClientesModel clientesModel) {
        return actualizarClienteUseCase.actualizarCliente(id,clientesModel);
    }

    @GetMapping("api/buscarByDoc/{numero_documento}")
    public List<Clientes> getClientesById(@PathVariable(value = "numero_documento") String numero_documento) {
        return buscarClienteByIdUseCase.buscarClientesById(numero_documento);
    }

    @GetMapping("api/buscarByDocView/{numero_documento}")
    public Clientes getClientesByIdView(@PathVariable(value = "numero_documento") int numero_documento) {
        return buscarClienteByIdUseCase.buscarClientesByIdView(numero_documento);
    }
}
