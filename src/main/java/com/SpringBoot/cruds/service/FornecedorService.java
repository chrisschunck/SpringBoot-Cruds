package com.SpringBoot.cruds.service;

import com.SpringBoot.cruds.entity.Fornecedor;
import com.SpringBoot.cruds.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor criarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    public void deletarFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }

    public Fornecedor buscarFornecedor(Long id) {
        return fornecedorRepository.findById(id).orElse(null);
    }
}
