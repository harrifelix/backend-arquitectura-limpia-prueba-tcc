package com.example.demo.infraestructura.adaptadores.repositorios;

import com.example.demo.infraestructura.adaptadores.modelos.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepositorio extends JpaRepository<Clientes, Long> {

    @Query("SELECT C FROM Clientes C WHERE C.numero_identificacion =:numero_identificacion")
    List<Clientes> buscarById(@Param("numero_identificacion") String numero_identificacion);


    @Query("SELECT C FROM Clientes C WHERE C.id =:numero_identificacion")
    Clientes buscarByIdView(@Param("numero_identificacion") int numero_identificacion);

   }
