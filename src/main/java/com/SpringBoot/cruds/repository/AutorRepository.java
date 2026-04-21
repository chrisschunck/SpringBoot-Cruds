package com.SpringBoot.cruds.repository;

import com.SpringBoot.cruds.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
