package com.duoc.clientes.repository;

import com.duoc.clientes.model.ClientesModel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientesRepository {
    private List<ClientesModel> listaClientes = new ArrayList<>();
}
