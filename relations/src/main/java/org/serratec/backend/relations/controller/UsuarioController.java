package org.serratec.backend.relations.controller;

import org.serratec.backend.relations.model.Usuario;
import org.serratec.backend.relations.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public ResponseEntity<List<Usuario>> listar(){
        return ResponseEntity.ok(usuarioRepository.findAll());
    }

}
