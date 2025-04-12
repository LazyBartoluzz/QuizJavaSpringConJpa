package com.example.demo.servicios;

import com.example.demo.modelos.Visitante;
import com.example.demo.modelos.ZonaSocial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositorios.RepositorioZonaSocial;

import java.util.List;

@Service
public class ServicioZonaSocial {

    @Autowired
    private RepositorioZonaSocial zonaSocialRepository;

    public void crearZonaSocial(ZonaSocial zonaSocial)  {

        zonaSocialRepository.save(zonaSocial);
    }

    public List<ZonaSocial> listarZonasSociales()  {

        return zonaSocialRepository.findAll();
    }

    public ZonaSocial darZonaSocial(Long id){

        return zonaSocialRepository.findById(id).orElse(null);
    }



}
