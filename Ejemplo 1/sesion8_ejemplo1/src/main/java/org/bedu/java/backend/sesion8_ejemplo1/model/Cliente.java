package org.bedu.java.backend.sesion8_ejemplo1.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {

    private Long id;
    private String nombre;
    private String correoContacto;
    private int numeroEmpleado;
    private  String direccion;

}