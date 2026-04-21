package com.SpringBoot.cruds.repository;

import com.SpringBoot.cruds.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
