package org.serratec.backend.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.serratec.backend.relations.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
