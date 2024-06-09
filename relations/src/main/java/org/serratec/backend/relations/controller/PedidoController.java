package org.serratec.backend.relations.controller;

import org.apache.coyote.Response;
import org.serratec.backend.relations.model.Pedido;
import org.serratec.backend.relations.repository.PedidoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private PedidoRepository pedidoRepository;

    // Injeção de dependência por construtor
    public PedidoController (PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> buscar(){
        return ResponseEntity.ok(pedidoRepository.findAll());
    }
}
