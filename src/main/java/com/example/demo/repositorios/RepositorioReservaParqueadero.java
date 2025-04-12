package com.example.demo.repositorios;

import com.example.demo.modelos.ReservaParqueadero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioReservaParqueadero extends JpaRepository<ReservaParqueadero, Long>{
}
