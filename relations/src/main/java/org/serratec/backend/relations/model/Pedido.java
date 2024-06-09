package org.serratec.backend.relations.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long id;

    @Column
    private String descricao;

    @Column(name = "data_pedido", nullable = false)
    private Date dataPedido;

    @JoinColumn(name = "fk_usuario")
    @ManyToOne
    private Usuario usuario;

}