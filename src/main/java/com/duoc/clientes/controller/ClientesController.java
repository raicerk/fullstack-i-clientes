package com.duoc.clientes.controller;

import com.duoc.clientes.model.ClientesModel;
import com.duoc.clientes.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesController {
    @Autowired
    private ClientesService clientesService;

    @GetMapping
    public List<ClientesModel> listarClientes() {
        return clientesService.getClientes();
    }

    @PostMapping
    public ClientesModel agregarCliente(@RequestBody ClientesModel cliente) {
        return clientesService.saveCliente(cliente);
    }


    @DeleteMapping("{correo}")
    public String eliminarCliente(@PathVariable String correo) {
        return clientesService.deleteCliente(correo);
    }
}
