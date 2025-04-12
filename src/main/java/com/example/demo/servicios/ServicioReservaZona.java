package com.example.demo.servicios;

import com.example.demo.modelos.ReservaParqueadero;
import com.example.demo.modelos.ReservaZona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositorios.RepositorioReservaZona;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServicioReservaZona {

    @Autowired
    private RepositorioReservaZona reservaZonaRepository;

    public void crearReservaZona(ReservaZona reservaZona)  {

        reservaZonaRepository.save(reservaZona);
    }

    public List<ReservaZona> darReservasZonaPorFecha(LocalDate fecha)  {

        return reservaZonaRepository.findByFecha(fecha);
    }

    public List<ReservaZona> listarReservasZona()  {

        return reservaZonaRepository.findAll();
    }

    public ReservaZona darReservaZona(Long id){

        return reservaZonaRepository.findById(id).orElse(null);
    }

}
