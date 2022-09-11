package org.bedu.java.backend.sesion8_ejemplo1.controllers;

import org.bedu.java.backend.sesion8_ejemplo1.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/reto/cliente")
public class ClienteControllerReto1 {

    @PostMapping
    public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente) {

        return ResponseEntity.created(URI.create("1")).build();

    }

}
