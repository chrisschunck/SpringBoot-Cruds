package com.SpringBoot.cruds.repository;

import com.SpringBoot.cruds.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
