package com.duoc.clientes.repository;

import com.duoc.clientes.model.ClientesModel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ClientesRepository {
    private List<ClientesModel> listaClientes = new ArrayList<>();

    public List<ClientesModel> obtenerClientes() {
        return listaClientes;
    }

    public ClientesModel guardar(ClientesModel cliente) {
        listaClientes.add(cliente);
        return cliente;
    }

    public void eliminar(String correo) {
        listaClientes.removeIf(cliente -> Objects.equals(cliente.getCorreo(), correo));
    }
}
