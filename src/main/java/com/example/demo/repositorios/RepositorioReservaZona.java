package com.example.demo.repositorios;

import com.example.demo.modelos.ReservaZona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RepositorioReservaZona extends JpaRepository<ReservaZona, Long>{

    List<ReservaZona> findByFecha(LocalDate fecha);
}
