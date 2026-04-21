package com.SpringBoot.cruds.repository;

import com.SpringBoot.cruds.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
