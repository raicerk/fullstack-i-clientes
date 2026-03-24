package com.duoc.clientes.controller;

import com.duoc.clientes.model.ClientesModel;
import com.duoc.clientes.service.ClientesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesController {
    @Autowired
    private ClientesService clientesService;

    @GetMapping
    public ResponseEntity<List<ClientesModel>> listarClientes() {
        try{
            return ResponseEntity.status(200).body(clientesService.getClientes());
        } catch (Exception e) {
            return new ResponseEntity("Error al obtener la lista de clientes", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<ClientesModel> agregarCliente(@Valid @RequestBody ClientesModel cliente) {
        try{
            return ResponseEntity.status(201).body(clientesService.saveCliente(cliente));
        } catch (Exception e) {
            return new ResponseEntity("Error al guardar al cliente", HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("{correo}")
    public ResponseEntity<String> eliminarCliente(@PathVariable String correo) {
        try{
            return ResponseEntity.status(200).body(clientesService.deleteCliente(correo));
        } catch (Exception e) {
            return new ResponseEntity("Error al borrar el cliente", HttpStatus.BAD_REQUEST);
        }
    }
}
