package com.duoc.clientes.service;

import com.duoc.clientes.model.ClientesModel;
import com.duoc.clientes.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {
    @Autowired
    private ClientesRepository clientesRepository;

    public List<ClientesModel> getLibros() {
        return clientesRepository.obtenerClientes();
    }

    public ClientesModel saveCliente(ClientesModel cliente) {
        return clientesRepository.guardar(cliente);
    }

    public String deleteCliente(String correo) {
        clientesRepository.eliminar(correo);
        return "Cliente eliminado";
    }
}
