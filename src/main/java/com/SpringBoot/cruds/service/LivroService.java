package com.SpringBoot.cruds.service;

import com.SpringBoot.cruds.entity.Livro;
import com.SpringBoot.cruds.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public Livro criarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    public void deletarLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public Livro buscarLivro(Long id) {
        return livroRepository.findById(id).orElse(null);
    }
}
