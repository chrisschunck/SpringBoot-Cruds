package com.SpringBoot.cruds.repository;

import com.SpringBoot.cruds.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
