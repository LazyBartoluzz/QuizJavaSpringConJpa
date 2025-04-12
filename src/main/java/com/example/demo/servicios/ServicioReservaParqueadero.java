package com.example.demo.servicios;

import com.example.demo.modelos.Propietario;
import com.example.demo.modelos.ReservaParqueadero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositorios.RepositorioReservaParqueadero;

import java.util.List;

@Service
public class ServicioReservaParqueadero {

    @Autowired
    private RepositorioReservaParqueadero reservaParqueaderoRepository;

    public void crearReservaParqueadero(ReservaParqueadero reservaParqueadero)  {

        reservaParqueaderoRepository.save(reservaParqueadero);
    }

    public List<ReservaParqueadero> listarReservasParqueaderos()  {

        return reservaParqueaderoRepository.findAll();
    }

    public ReservaParqueadero darReservaParqueadero(Long id){

        return reservaParqueaderoRepository.findById(id).orElse(null);
    }



}
