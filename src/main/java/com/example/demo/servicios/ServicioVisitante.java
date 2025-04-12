package com.example.demo.servicios;

import com.example.demo.modelos.ReservaZona;
import com.example.demo.modelos.Visitante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositorios.RepositorioVisitante;

import java.util.List;

@Service
public class ServicioVisitante {

    @Autowired
    private RepositorioVisitante visitanteRepository;

    public void crearVisitante(Visitante visitante)  {

        visitanteRepository.save(visitante);
    }

    public List<Visitante> listarVisitantes()  {

        return visitanteRepository.findAll();
    }

    public Visitante darVisitante(Long id){

        return visitanteRepository.findById(id).orElse(null);
    }

}
