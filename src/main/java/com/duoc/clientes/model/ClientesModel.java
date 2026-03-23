package com.duoc.clientes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientesModel {
    private String nombre;
    private String correo;
    private int edad;
}
