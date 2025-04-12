package com.example.demo.repositorios;

import com.example.demo.modelos.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioVisitante extends JpaRepository<Visitante, Long>{
}
