package com.example.demo.servicios;

import com.example.demo.modelos.Propietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositorios.RepositorioPropietario;

import java.util.List;

@Service
public class ServicioPropietario {

    @Autowired
    private RepositorioPropietario repositorioPropietario;

    public void crearPropietario(Propietario propietario)  {

        repositorioPropietario.save(propietario);
    }

    public List<Propietario> listarPropietarios()  {

        return repositorioPropietario.findAll();
    }

    public Propietario darPropietario(Long id){

        return repositorioPropietario.findById(id).orElse(null);
    }



}
