package com.SpringBoot.cruds.repository;

import com.SpringBoot.cruds.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
