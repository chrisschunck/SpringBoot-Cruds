package com.SpringBoot.cruds.service;

import com.SpringBoot.cruds.entity.Departamento;
import com.SpringBoot.cruds.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    public Departamento criarDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public List<Departamento> listarDepartamentos() {
        return departamentoRepository.findAll();
    }

    public void deletarDepartamento(Long id) {
        departamentoRepository.deleteById(id);
    }

    public Departamento buscarDepartamento(Long id) {
        return departamentoRepository.findById(id).orElse(null);
    }
}
