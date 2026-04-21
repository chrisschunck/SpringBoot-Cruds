package com.SpringBoot.cruds.repository;

import com.SpringBoot.cruds.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
